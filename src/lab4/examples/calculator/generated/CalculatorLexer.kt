import java.lang.IllegalStateException
import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List

public class CalculatorLexer(
  public val text: kotlin.String,
) {
  public var length: Int = text.length

  public var position: Int = 0

  public var currentData: String? = null

  public var currentToken: CalculatorToken? = null

  init {
    nextToken()
  }

  private fun find(`value`: kotlin.String): Boolean {
    val regex = value.toRegex()
    val match = regex.find(text, position)
    currentData = match?.value
    return match != null && match.range.first == position
  }

  public fun getTokens(): List<CalculatorToken> {
    val tokens = mutableListOf<CalculatorToken>()
    var token: CalculatorToken = nextToken()
    while (token.type != CalculatorTokenType.EOF) {
    tokens += token
    token = nextToken()
    }
    return tokens + CalculatorToken(CalculatorTokenType.EOF, null)
  }

  public fun getToken(): CalculatorToken {
    if (currentToken == null) throw IllegalStateException("Lexer is not initialized")
    return currentToken as CalculatorToken
  }

  public fun nextToken(): CalculatorToken {
    while (position < length && text[position].isWhitespace()) { position++ }
    if (position == length) {
    currentToken = CalculatorToken(CalculatorTokenType.EOF,null);
    return currentToken as CalculatorToken
    }
    val res = when {
    find("=") -> CalculatorToken(CalculatorTokenType.EQUAL, currentData).also { position +=
        currentData!!.length }
    find(";") -> CalculatorToken(CalculatorTokenType.LINE_END, currentData).also { position +=
        currentData!!.length }
    find("\\+") -> CalculatorToken(CalculatorTokenType.PLUS, currentData).also { position +=
        currentData!!.length }
    find("-") -> CalculatorToken(CalculatorTokenType.MINUS, currentData).also { position +=
        currentData!!.length }
    find("\\*") -> CalculatorToken(CalculatorTokenType.MULT, currentData).also { position +=
        currentData!!.length }
    find("\\*\\*") -> CalculatorToken(CalculatorTokenType.POW, currentData).also { position +=
        currentData!!.length }
    find("/") -> CalculatorToken(CalculatorTokenType.DIV, currentData).also { position +=
        currentData!!.length }
    find("\\(") -> CalculatorToken(CalculatorTokenType.LB, currentData).also { position +=
        currentData!!.length }
    find("\\)") -> CalculatorToken(CalculatorTokenType.RB, currentData).also { position +=
        currentData!!.length }
    find("[0-9]+") -> CalculatorToken(CalculatorTokenType.INT, currentData).also { position +=
        currentData!!.length }
    find("[a-zA-Z]+") -> CalculatorToken(CalculatorTokenType.ALPS, currentData).also { position +=
        currentData!!.length }
    else -> throw Exception("Unexpected token at position $position")
    }
    currentToken = res
    return res
  }
}
