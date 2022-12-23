package lab4.analyzers.grammarParser

import lab4.analyzers.grammar.Grammar

class rulesMyVisitor : rulesBaseVisitor<Grammar>() {



    override fun visitStart(ctx: rulesParser.StartContext?): Grammar {
        val grammar = ctx!!.x
        ctx.children.forEach { visit(it) }
        return grammar
    }

    override fun visitMembers(ctx: rulesParser.MembersContext?): Grammar {
        if (ctx != null) {
            ctx.x.members = ctx.text
        }
        return Grammar()
    }

    override fun visitNodeContext(ctx: rulesParser.NodeContextContext?): Grammar {
        if (ctx != null) {
            ctx.x.nodeContext = ctx.text
        }
        return Grammar()
    }

    override fun visitNonTerminal(ctx: rulesParser.NonTerminalContext?): Grammar {
        if (ctx != null) {
            val state = Grammar.State()
            state.name = ctx.RULE_NAME().text
            ctx.x.addState(state)
            ctx.children.forEach { visit(it) }
        }
        return Grammar()
    }

    override fun visitRight(ctx: rulesParser.RightContext?): Grammar {
        if (ctx != null) {
            val rule = Grammar.Rule()
            ctx.children.forEachIndexed() { index, child ->
                val item = Grammar.Item()
                val text = child.text
                if (text.contains("$")) {
                    item.code = text
                } else {
                    item.name = text
                }
                rule.addItem(item)
            }
            ctx.x.states.last().addRule(rule)
        }
        return Grammar()
    }

    override fun visitTerminal(ctx: rulesParser.TerminalContext?): Grammar {
        if (ctx != null) {
            val token = Grammar.StateToken()
            token.name = ctx.TOKEN_NAME().text
            if (ctx.LITERAL().size == 1) {
                token.regex = ctx.LITERAL().first().text
            } else {
                ctx.LITERAL().joinToString("|"){ '(' + it.text + ')' }
            }
            ctx.x.addToken(token)
        }
        return Grammar()
    }

    override fun visitTerminals(ctx: rulesParser.TerminalsContext?): Grammar {
        if (ctx != null) {
            ctx.children.forEach { visit(it) }
        }
        return Grammar()
    }

    override fun visitNonTerminals(ctx: rulesParser.NonTerminalsContext?): Grammar {
        if (ctx != null) {
            ctx.children.forEach { visit(it) }
        }
        return Grammar()
    }

}
