package lab4.examples.calc

import lab4.analyzers.grammar.GrammarGenerator
import lab4.generators.LexerGenerator

fun main() {
    val GrammarGenerator = GrammarGenerator("src/lab4/examples/calc/grammar.gr")
    val grammar = GrammarGenerator.generate()
    grammar.name = "Calc"
    val lexerGenerator = LexerGenerator(grammar)
    lexerGenerator.generate("src/lab4/examples/calc/grammar.gr")
}