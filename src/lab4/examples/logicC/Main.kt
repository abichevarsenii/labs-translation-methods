package lab4.examples.logicC

import lab4.generators.MainGenerator
import logicCLexer
import logicCParser

fun main() {
    //generateAll()
    //logicCLexer("a & b").getTokens().forEach { println(it) }
    var tree = logicCParser(logicCLexer("!a")).a(mapOf("a" to false, "b" to true, "c" to false),true).value
    println(tree)
    //println(CalcLexer("1 + 2 * 3").getTokens())
}

private fun generateAll() {
    val generator = MainGenerator("src/lab4/examples/logicC/grammar.gr", "src/lab4/examples/logicC/generated")
    generator.generate()
}



