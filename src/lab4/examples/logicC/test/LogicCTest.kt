package lab4.examples.logicC.test

import LogicCLexer
import LogicCNode
import LogicCParser
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.api.assertThrows
import java.text.ParseException
import javax.script.ScriptContext
import javax.script.ScriptEngineManager

class LogicCTest {

    companion object {
        val variablesRange = 'a'.rangeTo('z')

        val replaceOps = mapOf(
            "|" to "||",
            "&" to "&&",
            "^" to "!=",
        )

        val correctExpression = mapOf(
            "a" to "SimpleVariable",
            "a & b" to "SimpleOperation",
            "a ^ b ^ c" to "TripleOperation",
            "(((a ^ b)))" to "SimpleOperationInBrackets",
            "!a" to "SimpleNot",
            "!(a | b)" to "SimpleNotWithSimpleOperation",
            "((((((a))))))^((((b))))" to "ManyBrackets",
            "(!a | b) & a & (a | !(b ^ c))" to "FullExpressionWithAllOperations",
            "a & b & c & d & e & f & g & s & q" to "ManyVariables",
            "(!a | (!a | b) & a & (a | !(b ^ c))) & a & ((!a | b) & a & (a | !(b ^ c)) | !(b ^ c))" to "LongExpression",
            "(!a | (!a | b) & a & (a | !(b ^ c))) & a & ((!a | (!a | (!a | b) & a & (a | !(b ^ c))) & a & ((!a | b) & a & (a | !(b ^ c)) | !(b ^ c))) & a & (a | !(b ^ c)) | !(b ^ c))" to "VeryLongExpression"
        )
        val incorrectExpression = mapOf(
            ")" to "SimpleBracket",
            "||" to "IncorrectOperation",
            "&(a)" to "IncorrectArityOperation",
            "((((((()))))))))" to "IncorrectBalanceOfBrackets",
            "6" to "Number",
            "*" to "IncorrectSymbol"
        )
    }



    @TestFactory
    fun simpleTest(): Collection<DynamicTest> {
        return correctExpression.map { pair ->
            DynamicTest.dynamicTest("${pair.value}Test") {
                println("Check expression ${pair.key}")
                allVariations(getVariables(pair.key)).forEach { param ->
                    assert(checkedValue(pair.key, param) == expectedValue(pair.key, param))
                }
            }
        }.toList()
    }

    @TestFactory
    fun exceptionTest(): Collection<DynamicTest> {
        return incorrectExpression.map { pair ->
            DynamicTest.dynamicTest("${pair.value}Test") {
                println("Check expression ${pair.key}")
                assertThrows<ParseException> { LogicCParser(LogicCLexer(pair.key)).a() }
            }
        }.toList()
    }

    private fun treeWalk(node: LogicCNode, params: Map<String, Boolean>): String {
        var res = ""
        if (!node.isTerminal) {
            res = node.children.map { n -> treeWalk(n, params) }.joinToString("")
        } else {
            return when (node.name) {
                "VAR" -> params[(node).text].toString()
                "OR", "AND", "XOR", "NOT", "LB", "RB" -> node.text!!
                else -> {
                    ""
                }
            }
        }
        return res
    }

    private fun allVariations(params: MutableList<String>): MutableList<MutableMap<String, Boolean>> {
        if (params.size == 1) {
            return mutableListOf(
                mutableMapOf(params[0] to true),
                mutableMapOf(params[0] to false)
            )
        }
        val curParam = params.removeAt(0)
        val oldList = allVariations(params)
        val listTrue = mutableListOf<MutableMap<String, Boolean>>()
        val listFalse = mutableListOf<MutableMap<String, Boolean>>()
        listTrue.addAll(oldList)
        listFalse.addAll(oldList.map { item ->
            val res = mutableMapOf<String, Boolean>()
            res.putAll(item)
            res
        })
        listTrue.forEach { item ->
            item[curParam] = true
        }
        listFalse.forEach { item ->
            item[curParam] = false
        }
        listTrue.addAll(listFalse)
        return listTrue
    }

    private fun getVariables(string: String): MutableList<String> {
        val res = mutableListOf<String>()
        variablesRange.filter { string.contains(it) }.forEach { res.add(it.toString()) }
        return res
    }

    private fun checkedValue(expression: String, params: Map<String, Boolean>): Boolean {
        return evaluate(params, expression)
    }

    private fun expectedValue(expression: String, params: Map<String, Boolean>): Boolean {
        return evaluate(params, treeWalk(LogicCParser(LogicCLexer(expression)).a(), params))
    }

    private fun evaluate(params: Map<String, Boolean>, string: String): Boolean {
        val e = ScriptEngineManager(null).getEngineByName("nashorn")
        var str = string
        replaceOps.forEach { pair ->
            str = str.replace(pair.key, pair.value)
        }
        params.forEach { pair ->
            e.context.setAttribute(pair.key, pair.value, ScriptContext.ENGINE_SCOPE)
        }
        return e.eval(str) as Boolean
    }


}