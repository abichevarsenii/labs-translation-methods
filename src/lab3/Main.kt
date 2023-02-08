package lab3

import lab3.parser.generated.HTMLHighlightingBaseListener
import lab3.parser.generated.HTMLHighlightingLexer
import lab3.parser.generated.HTMLHighlightingParser
import lab3.resources.Tools
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.FileReader
import java.io.FileWriter

const val STYLE_PLACE = "STYLE_PLACE"
const val BODY_PLACE = "BODY_PLACE"

fun main() {
    val stream = CharStreams.fromFileName("src/lab3/input.txt")
    val lexer = HTMLHighlightingLexer(stream)
    val parser = HTMLHighlightingParser(CommonTokenStream(lexer))
    parser.addParseListener(HTMLHighlightingBaseListener())
    val visitor = HTMLHighlightingMyVisitor()
    val node = parser.start()
    Tools.resetTab()
    visitor.visit(node)
    val res = node.`val`

    var template = ""
    FileReader("src/lab3/resources/template.html").use {
        template = it.readText()
    }

    var style = ""
    FileReader("src/lab3/resources/style.css").use {
        style = it.readText()
    }

    template = template.replace(STYLE_PLACE,style)
    template = template.replace(BODY_PLACE,res)

    FileWriter("src/lab3/output.html").use {
       it.write(template)
    }
}