package lab4.examples.calculator

import CalculatorLexer
import CalculatorParser
import lab4.generators.MainGenerator
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow


fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val line = reader.readLine() ?: break
        if (line == "END") break
        val result = CalculatorParser(CalculatorLexer(line)).e().value
        println(result)
    }
}






