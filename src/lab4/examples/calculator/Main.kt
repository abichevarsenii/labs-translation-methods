package lab4.examples.calculator

import lab4.generators.MainGenerator

fun main() {
    generateAll()
    //var tree = CalcParser(CalcLexer("1 + (2 * 3) - 5 * 999")).e().value
    //println(tree)
    //println(CalcLexer("1 + 2 * 3").getTokens())
}

private fun generateAll() {
    val generator = MainGenerator("src/lab4/examples/calculator/grammar.gr", "src/lab4/examples/calculator/generated")
    generator.generate()
}



