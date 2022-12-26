package lab4.examples.calculator.test


import CalculatorLexer
import CalculatorParser
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.api.assertThrows
import parser.Parser
import java.text.ParseException
import javax.script.ScriptEngineManager

class CalculatorTest {
    companion object {
        val correctExpression = mapOf(
            "5" to "SimpleNumber",
            "1+1" to "SimpleOperation",
            "3+5*6" to "TripleOperation",
            "10-(2-3)" to "SimpleOperationInBrackets",
            "6*((2-3)*4)" to "OperationInBrackets",
            "2*2*2*2*2*2*2*2" to "ManyOperations",
            "(((((((((0)))))))))" to "FullExpressionWithAllOperations",
            "((20 + (((15 + 52) + (52)))) + 7) * ((2 + (((15 + 2) + (52)))) + 7)" to "LongExpression",
        )
        val incorrectExpression = mapOf(
            "" to "Empty expression",
            "+" to "IncorrectOperation",
            "1+" to "IncorrectArityOperation",
            "1/" to "IncorrectArityOperation",
            "#" to "IncorrectSymbol",
            "1//" to "IncorrectOperation",
            "1/*" to "IncorrectOperation",
            "1/0" to "DivideByZero",
            "(()" to "IncorrectBalanceOfBrackets",
            "2+3((4)+1))" to "SkipOperation",
        )
    }



    @TestFactory
    fun simpleTest(): Collection<DynamicTest> {
        return correctExpression.map { pair ->
            DynamicTest.dynamicTest("${pair.value}Test") {
                println("Check expression ${pair.key}")
                val check = checkedValue(pair.key)
                val expected = expectedValue(pair.key)
                assert(check == expected)
            }
        }.toList()
    }

    @TestFactory
    fun exceptionTest(): Collection<DynamicTest> {
        return incorrectExpression.map { pair ->
            DynamicTest.dynamicTest("${pair.value}Test") {
                println("Check expression ${pair.key}")
                assertThrows<ParseException> { Parser().parse(pair.key.byteInputStream()) }
            }
        }.toList()
    }


    private fun checkedValue(expression: String): Int {
        return evaluate(expression)
    }

    private fun expectedValue(expression: String): Int {
        return CalculatorParser(CalculatorLexer(expression)).e().value
    }

    private fun evaluate(string: String): Int {
        val e = ScriptEngineManager(null).getEngineByName("nashorn")
        var str = string
        return e.eval(str) as Int
    }


}