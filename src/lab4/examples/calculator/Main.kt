package lab4.examples.calculator

import CalculatorLexer
import CalculatorParser
import lab4.generators.MainGenerator

fun main() {
    val tree = CalculatorParser(CalculatorLexer("1 + (2 * 3) - 5 * 999")).e().value
    println(tree)
}





