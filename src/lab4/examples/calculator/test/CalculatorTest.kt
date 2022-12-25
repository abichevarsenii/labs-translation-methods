package lab4.examples.calculator.test


//import CalculatorLexer
//import CalculatorParser
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.api.assertThrows
import parser.Parser
import java.text.ParseException
import javax.script.ScriptEngineManager

class CalculatorTest {
    companion object {
        val correctExpression = mapOf(
            "0" to "SimpleVariable",
            " 0   " to "SimpleOperation",
            "1+1" to "TripleOperation",
            "1-2-3" to "SimpleOperationInBrackets",
            "1-2*3+4" to "SimpleNot",
            "2*3*4" to "SimpleNotWithSimpleOperation",
            "(0)" to "ManyBrackets",
            "(((((((((0)))))))))" to "FullExpressionWithAllOperations",
            "2/(2-1)" to "ManyVariables",
            "2/(2-1)/(2)" to "LongExpression",
        )
        val incorrectExpression = mapOf(
            "" to "SimpleBracket",
            "+" to "IncorrectOperation",
            "1+" to "IncorrectArityOperation",
            "1/" to "IncorrectBalanceOfBrackets",
            "1//" to "Number",
            "1/*" to "IncorrectSymbol",
            "1/0" to "IncorrectNameOfVariable",
            "(()" to "IncorrectNameOfVariable",
            "2+3((4)+1))" to "IncorrectNameOfVariable",
        )
    }



    @TestFactory
    fun simpleTest(): Collection<DynamicTest> {
        return correctExpression.map { pair ->
            DynamicTest.dynamicTest("${pair.value}Test") {
                println("Check expression ${pair.key}")
                assert(checkedValue(pair.key) == expectedValue(pair.key))
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
        return 0 //CalculatorParser(CalculatorLexer(expression)).e().value
    }

    private fun evaluate(string: String): Int {
        val e = ScriptEngineManager(null).getEngineByName("nashorn")
        var str = string
        return e.eval(str) as Int
    }


}