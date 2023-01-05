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
            "a | b & c" to "TripleOperation",
            "(((a ^ b)))" to "SimpleOperationInBrackets",
            "!a" to "SimpleNot",
            "!(a | b)" to "SimpleNotWithSimpleOperation",
            "((((((a))))))^((((b))))" to "ManyBrackets",
            "(!a | b) & a & (a | !(b ^ c))" to "FullExpressionWithAllOperations",
            "a & b | c ^ d" to "ManyVariables",
            "(!a | (!a | b) & a & (a | !(b ^ c))) & a & ((!a | b) & a & (a | !(b ^ c)) | !(b ^ c))" to "LongExpression",
            "(!a | (!a | b) & a & (a | !(b ^ c))) & a & ((!a | (!a | (!a | b) & a & (a | !(b ^ c))) & a & ((!a | b) & a & (a | !(b ^ c)) | !(b ^ c))) & a & (a | !(b ^ c)) | !(b ^ c))" to "VeryLongExpression"
        )

        val notFinishedExpression = mapOf(
            "a" to Triple(
                "SimpleVariable",
                arrayListOf(
                    mapOf("a" to true),
                    emptyMap()),
                arrayListOf(
                    "true",
                    "a"
                )),
            "a & b" to Triple(
                "SimpleOperation",
                arrayListOf(
                    mapOf("a" to true),
                    mapOf("b" to false)),
                arrayListOf(
                    "true&b",
                    "a&false",
                )),
            "a | b & c" to Triple(
                "TripleOperation",
                arrayListOf(
                    mapOf("a" to true),
                    mapOf("b" to false),
                    mapOf("c" to true) ,
                    mapOf("b" to true, "c" to false)),
                arrayListOf(
                    "true|b&c",
                    "a|false&c",
                    "a|b&true",
                    "a|false",
                )),
            "a & b | c ^ d" to Triple(
                "ManyVariables",
                arrayListOf(
                    mapOf("a" to true),
                    mapOf("b" to false),
                    mapOf("c" to true),
                    mapOf("d" to false),
                    mapOf("a" to true, "b" to false),
                    mapOf("c" to true, "d" to true),
                    mapOf("b" to false, "c" to true),
                    mapOf("b" to true, "c" to false, "d" to true)),
                arrayListOf(
                    "true&b|c^d",
                    "a&false|c^d",
                    "a&b|true^d",
                    "a&b|c^false",
                    "false|c^d",
                    "a&b|false",
                    "a&false|true^d",
                    "a&true|true",
                )),
            "(a & b)" to Triple(
                "SimpleOperationInBrackets",
                arrayListOf(
                    mapOf("a" to true),
                    mapOf("b" to false),
                    mapOf("a" to true, "b" to false)),
                arrayListOf(
                    "(true&b)",
                    "(a&false)",
                    "false",
                )),
            "(!a | (!a | b) & a & (a | !(b ^ c))) & a & ((!a | b) & a & (a | !(b ^ c)) | !(b ^ c))" to Triple(
                "FullExpressionWithAllOperations",
                arrayListOf(
                    mapOf("a" to true, "b" to false),
                    mapOf("a" to true, "b" to false, "c" to true),
                ),
                arrayListOf(
                    "(false|false&true&(true|!(false^c)))&true&(false&true&(true|!(false^c))|!(false^c))",
                    "false",
                )),
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
                    assert(checkedValue(pair.key, param) == expectedValue(pair.key, param).value!!)
                }
            }
        }.toList()
    }

    @TestFactory
    fun notFinishedTest(): Collection<DynamicTest> {
        return notFinishedExpression.map { pair ->
            DynamicTest.dynamicTest("${pair.value.first}Test") {
                println("Check expression ${pair.key}")
                pair.value.second.forEachIndexed { index, param ->
                    var res = expectedValue(pair.key, param)
                    if (res.value != null) {
                        println("Params: ${param} Result: \'${res.value.toString()}\'")
                        assert(res.value.toString() == pair.value.third[index])
                    } else {
                        println("Params: ${param} Result: \'${res.str}\'")
                        assert(res.str == pair.value.third[index])
                    }
                }
            }
        }.toList()
    }

    @TestFactory
    fun exceptionTest(): Collection<DynamicTest> {
        return incorrectExpression.map { pair ->
            DynamicTest.dynamicTest("${pair.value}Test") {
                println("Check expression ${pair.key}")
                assertThrows<ParseException> { LogicCParser(LogicCLexer(pair.key)).a(mapOf(),null,"") }
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

    private fun expectedValue(expression: String, params: Map<String, Boolean>): LogicCNode {
        return LogicCParser(LogicCLexer(expression)).a(params,false,"")
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