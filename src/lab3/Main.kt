package lab3

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val string = "int"
    val stream = CharStreams.fromString(string)
    val lexer = HTMLHighlightingLexer(stream)
    val parser = HTMLHighlightingParser(CommonTokenStream(lexer))
    val listener = HTMLHighlightingBaseListener()
    val visitor = HTMLHighlightingBaseVisitor<String>()
    parser.addParseListener(listener)
    var node = parser.start()
    visitor.visitStart(node)
}

class Main {
}