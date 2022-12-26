package lab4.examples.logicC

import lab4.generators.MainGenerator

fun main() {
    val generator = MainGenerator("src/lab4/examples/logicC/grammar.gr", "src/lab4/examples/logicC/generated")
    generator.generate()
}