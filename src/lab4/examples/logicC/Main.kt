package lab4.examples.logicC


import LogicCLexer
import LogicCParser

fun main() {
    val tree = LogicCParser(LogicCLexer("a | b & c")).a()
    println(tree)
}




