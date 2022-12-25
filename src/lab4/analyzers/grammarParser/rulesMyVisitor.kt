package lab4.analyzers.grammarParser

import lab4.analyzers.grammar.Grammar

class rulesMyVisitor : rulesBaseVisitor<Grammar>() {


    override fun visitGrammarName(ctx: rulesParser.GrammarNameContext?): Grammar {
        if (ctx != null) {
            ctx.x.name = ctx.GRAMMAR_NAME().text.split(" ")[1].dropLast(1)
        }
        return Grammar()
    }

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
            ctx.x.returnType = ctx.RETURN_TYPE().text.split(" ")[1].dropLast(1)
            ctx.x.returnValue = ctx.RETURN_VALUE().text.split(" ")[1].dropLast(1)
        }
        return Grammar()
    }

    override fun visitNonTerminal(ctx: rulesParser.NonTerminalContext?): Grammar {
        if (ctx != null) {
            val state = Grammar.State()
            state.name = ctx.ruleName().RULE_NAME().text
            state.args = ctx.ruleName().ARG().map { it.text }
            ctx.x.addState(state)
            ctx.children.forEach { visit(it) }
        }
        return Grammar()
    }

    override fun visitRight(ctx: rulesParser.RightContext?): Grammar {
        if (ctx != null) {
            val rule = Grammar.Rule()
            ctx.children.forEach { child ->
                val item = Grammar.Item()
                val text = child.text
                if (child is rulesParser.RuleNameContext) {
                    item.name = child.RULE_NAME().text
                    if (child.ARG().size > 0) {
                        item.arg = child.ARG(0).text
                    }
                    rule.addItem(item)
                } else if (child is rulesParser.SemanticsContext) {
                    rule.items.last().code = child.SEMANTIC_RULE().text
                } else {
                    item.name = text
                    rule.addItem(item)
                }
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
