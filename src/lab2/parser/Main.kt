import parser.Parser

fun main() {
    val str = "(!a)"
    val parser = Parser()
    val res = parser.parse(str.byteInputStream())
    println(res)
}