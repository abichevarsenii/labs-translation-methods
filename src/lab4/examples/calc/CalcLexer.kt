import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List

public class CalcLexer(
  public val text: kotlin.String,
) {
  public var length: Int = text.length

  public var position: Int = 0

  public var currentData: String? = null

  private fun find(`value`: kotlin.String): Boolean {
    val regex = value.toRegex()
    val match = regex.find(text, position)
    currentData = match?.value
    return match != null && match.range.first == position
  }

  private fun getTokens(): List<CalcToken> {
    val tokens = mutableListOf<CalcToken>()
    var token: CalcToken? = getNextToken()
    while (token != null) {
    tokens += token
    token = getNextToken()
    }
    return tokens + CalcToken(CalcTokenType.EOF, null)
  }

  public fun getNextToken(): CalcToken? {
    while (position < length && text[position].isWhitespace()) { position++ }
    if (position == length) { return null }
    return when {
    find("+") -> CalcToken(CalcTokenType.PLUS, currentData).also { position += currentData!!.length
        }
    find("-") -> CalcToken(CalcTokenType.MINUS, currentData).also { position += currentData!!.length
        }
    find("[0-9]+") -> CalcToken(CalcTokenType.NUMBER, currentData).also { position +=
        currentData!!.length }
    else -> throw Exception("Unexpected token at position $position")
    }
  }
}
