package lab2.test


//import org.junit.jupiter.api.Test

import parser.Parser
import parser.Tree

fun main() {

    ParserTest().parse()
}

class ParserTest {



    fun eval(node: Tree.Node, params: Map<String, Boolean>): String {
        val parent = node as? Tree.NonTerminal
        var res = ""
        if (parent != null) {
            res = parent.children.map { n -> eval(n, params) }.joinToString("")
        } else {
            return when(node.name[0]){
                'V' -> params[(node as Tree.Terminal).value].toString()
                '|', '&', '^', '!','(',')' -> node.name
                else -> {""}
            }
        }
        return res
    }


  // @Test
    fun parse() {
        val str = "(!a | b) & a & (a | !(b ^ c))"
        val parser = Parser()
        val res = parser.parse(str.byteInputStream())
        println(eval(res, mapOf("a" to true,"b" to true,"c" to true,"d" to true,)))
    }
}