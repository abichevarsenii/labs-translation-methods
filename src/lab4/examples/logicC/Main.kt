package lab4.examples.logicC


import LogicCLexer
import LogicCParser



fun main() {
    //val tree = LogicCParser(LogicCLexer("a & b | c")).a(mapOf("a" to false, "b" to false),false,"")
    val tree = LogicCParser(LogicCLexer("a & b | c")).a(mapOf("a" to false, "b" to false, "c" to true),false,"")
    println("Value: " + tree.value.toString() + "\nParsed expression: " + tree.str)
}




