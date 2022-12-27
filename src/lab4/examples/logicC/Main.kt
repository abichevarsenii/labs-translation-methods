package lab4.examples.logicC


import LogicCLexer
import LogicCParser

fun main() {
    val tree = LogicCParser(LogicCLexer("a & b | c")).a(mapOf("a" to false, "b" to false, "c" to true))
    println(tree)
}




