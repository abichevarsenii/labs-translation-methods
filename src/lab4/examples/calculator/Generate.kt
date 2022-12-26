package lab4.examples.calculator

import lab4.generators.MainGenerator

fun main() {
    val generator = MainGenerator("src/lab4/examples/calculator/grammar.gr", "src/lab4/examples/calculator/generated")
    generator.generate()
}