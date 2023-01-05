package lab4.examples.logicC


import LogicCLexer
import LogicCParser



fun main() {
    val tree = LogicCParser(LogicCLexer("a & b | c")).a(mapOf("a" to false, "b" to false),false,"")
    println(tree.value.toString() + " " + tree.str)
}




