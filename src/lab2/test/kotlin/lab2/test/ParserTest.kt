package lab2.test


import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.api.assertThrows
import parser.Parser
import parser.Tree
import java.text.ParseException
import javax.script.ScriptContext
import javax.script.ScriptEngineManager


class ParserTest {

    companion object {
        val variablesRange = 'a'.rangeTo('z')

        val replaceOps = mapOf(
            "|" to "||",
            "&" to "&&",
            "^" to "!=",
        )

        val correctExpression = listOf(
            "(!a | b) & a & (a | !(b ^ c))"
        )
        val incorrectExpression = listOf(
            ")"
        )
    }


    @TestFactory
    fun simpleTest(): Collection<DynamicTest> {
       return  correctExpression.mapIndexed { i, item  ->
            dynamicTest("Check expression $item") {
                allVariations(getVariables(item)).forEach { param ->
                    println(param)
                    assert(checkedValue(item, param) == expectedValue(item, param))
                }
            }
        }.toList()
    }

    @TestFactory
    fun exceptionTest(): Collection<DynamicTest> {
        return  incorrectExpression.mapIndexed { i, item  ->
            dynamicTest("Check expression $item") {
                assertThrows<ParseException> { Parser().parse(item.byteInputStream()) }
            }
        }.toList()
    }

    fun treeWalk(node: Tree.Node, params: Map<String, Boolean>): String {
        val parent = node as? Tree.NonTerminal
        var res = ""
        if (parent != null) {
            res = parent.children.map { n -> treeWalk(n, params) }.joinToString("")
        } else {
            return when (node.name[0]) {
                'V' -> params[(node as Tree.Terminal).value].toString()
                '|', '&', '^', '!', '(', ')' -> node.name
                else -> {
                    ""
                }
            }
        }
        return res
    }

    fun allVariations(params: MutableList<String>): MutableList<MutableMap<String, Boolean>> {
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

    fun getVariables(string: String):MutableList<String>{
        val res = mutableListOf<String>()
        variablesRange.filter { string.contains(it) }.forEach { res.add(it.toString()) }
        return res
    }

    fun checkedValue(expression: String, params: Map<String, Boolean>): Boolean {
        return evaluate(params, expression)
    }

    fun expectedValue(expression: String, params: Map<String, Boolean>): Boolean {
        return evaluate(params, treeWalk(Parser().parse(expression.byteInputStream()), params))
    }

    fun evaluate(params: Map<String, Boolean>, string: String): Boolean {
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