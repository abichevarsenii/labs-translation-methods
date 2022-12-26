package lab4.examples.logicC


import LogicCLexer
import LogicCParser

fun main() {
    LogicCLexer("a & b").getTokens().forEach { println(it) }
    val tree = LogicCParser(LogicCLexer("!a")).a()
    println(tree)
}




