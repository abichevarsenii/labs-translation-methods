package lab3

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.FileReader
import java.io.FileWriter
import javax.swing.text.html.HTML

const val STYLE_PLACE = "STYLE_PLACE"
const val BODY_PLACE = "BODY_PLACE"

fun main() {
    val stream = CharStreams.fromFileName("src/lab3/input.txt")
    val lexer = HTMLHighlightingLexer(stream)
    val parser = HTMLHighlightingParser(CommonTokenStream(lexer))
    val node = parser.start()

    val res = node.`val`

    var template = ""
    FileReader("src/lab3/template.html").use {
        template = it.readText()
    }

    var style = ""
    FileReader("src/lab3/style.css").use {
        style = it.readText()
    }

    template = template.replace(STYLE_PLACE,style)
    template = template.replace(BODY_PLACE,res)

    FileWriter("src/lab3/output.html").use {
       it.write(template)
    }
}