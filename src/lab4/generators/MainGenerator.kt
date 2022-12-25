package lab4.generators

import lab4.analyzers.grammar.GrammarGenerator

class MainGenerator(private val pathToGrammar : String, private val outputPath : String) {
    fun generate() {
        val grammarGenerator = GrammarGenerator(pathToGrammar)
        val grammar = grammarGenerator.generate()
        val lexerGenerator = LexerGenerator(grammar)
        val parserGenerator = ParserGenerator(grammar)
        lexerGenerator.generate(outputPath)
        parserGenerator.generate(outputPath)
    }
}