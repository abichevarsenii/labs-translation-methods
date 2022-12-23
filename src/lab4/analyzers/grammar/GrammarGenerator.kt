package lab4.analyzers.grammar


import lab4.analyzers.grammarParser.*
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

class GrammarGenerator(private val path : String) {
    fun generate() : Grammar {
        val stream = CharStreams.fromFileName(path)
        val lexer = rulesLexer(stream)
        val parser = rulesParser(CommonTokenStream(lexer))
        val visitor = rulesMyVisitor()
        val node = parser.start(Grammar())
        val grammar = visitor.visit(node)
        return grammar
    }
}