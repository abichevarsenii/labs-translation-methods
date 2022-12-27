package lab4.analyzers.grammar

class Grammar(
    var name: String? = null,
    var header: String? = null,
    var members: String? = null,
    var returnType : String? = null,
    var returnValue : String? = null,
    var states: MutableList<State> = mutableListOf(),
    var tokens: MutableList<StateToken> = mutableListOf()
) {
    class StateToken(var name: String? = null, var regex: String? = null)
    class Item(var name: String? = null, var code: String? = null, var arg : String? = null)
    class Rule(var items: MutableList<Item> = mutableListOf()) {
        fun addItem(item: Item) = items.plusAssign(item)
    }
    class State(
        var name: String? = null,
        var args : List<String> = emptyList(),
        var rules: MutableList<Rule> = mutableListOf()
    ) {
        fun addRule(rule: Rule) = rules.plusAssign(rule)
        override fun toString(): String {
            val sb: StringBuilder = StringBuilder()
            sb.append('@')
            sb.append(name)
            return sb.toString()
        }
    }

    fun addState(state: State) = states.plusAssign(state)
    fun addToken(token: StateToken) = tokens.plusAssign(token)

    fun getFirst(items: MutableList<Item>): List<String> {
        if (items.isEmpty() || items[0].name == "EPS") return listOf("EPS")

        val maybeToken: StateToken? = this.tokens.find { it.name == items[0].name }
        if (maybeToken != null) return listOf(items[0].name!!)

        val first = FIRST[items[0].name!!]!!
        return (first - "EPS").toList() + if ("EPS" in first) getFirst(items.drop(1).toMutableList()) else listOf()
    }

    fun buildFirst(): MutableMap<String, MutableSet<String>> {
        this.states.forEach {
            FIRST[it.name!!] = mutableSetOf()
        }

        var changed: Boolean
        do {
            changed = false
            for (state in this.states) {
                val size = FIRST[state.name]!!.size

                state.rules.forEach { rule ->
                    FIRST[state.name]!! += getFirst(rule.items)
                    changed = changed || (size != FIRST[state.name]!!.size)
                }
            }
        } while (changed)

        return FIRST
    }

    fun buildFollow(): MutableMap<String, MutableSet<String>> {
        var changed: Boolean = true
        this.states.forEach {
            FOLLOW[it.name!!] = mutableSetOf()
        }
        states.firstOrNull()?.let {
            FOLLOW[it.name]!!.add("EOF")
        }


        while (changed) {
            changed = false

            for (nonTerm in states) {
                for (nonTermRules in nonTerm.rules) {
                    val stateSize = nonTermRules.items.size
                    for (index in nonTermRules.items.indices) {
                        val b = nonTermRules.items[index].name

                        if (b != "EPS" && tokens.find { it.name == b } == null) {
                            val gamma = if (index == stateSize - 1) "EPS"
                            else nonTermRules.items[index + 1].name

                            val pushedData = mutableListOf<String>()
                            if (gamma != "EPS") {
                                if (tokens.find { it.name == gamma } != null) {
                                    pushedData.add(gamma!!)
                                } else {
                                    pushedData.addAll(FIRST[gamma]!!)
                                }
                            } else {
                                pushedData.add("EPS")
                            }
                            if (pushedData.contains("EPS")) {
                                pushedData.addAll(FOLLOW[nonTerm.name]!!)
                            }
                            pushedData.removeAll { it == "EPS" }

                            val sizeBefore = FOLLOW[b]!!.size
                            FOLLOW[b]!!.addAll(pushedData)

                            changed = changed || (sizeBefore != FOLLOW[b]!!.size)
                        }
                    }
                }
            }
        }

        return FOLLOW
    }

    var FIRST: MutableMap<String, MutableSet<String>> = mutableMapOf()
    var FOLLOW: MutableMap<String, MutableSet<String>> = mutableMapOf()
}