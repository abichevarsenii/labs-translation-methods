import java.text.ParseException
import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List

public class LogicCLexer(
  public val text: kotlin.String,
) {
  public var length: Int = text.length

  public var position: Int = 0

  public var currentData: String? = null

  public var currentToken: LogicCToken? = null

  private fun find(`value`: kotlin.String): Boolean {
    val regex = value.toRegex()
    val match = regex.find(text, position)
    currentData = match?.value
    return match != null && match.range.first == position
  }

  public fun getTokens(): List<LogicCToken> {
    val tokens = mutableListOf<LogicCToken>()
    var token: LogicCToken = nextToken()
    while (token.type != LogicCTokenType.EOF) {
    tokens += token
    token = nextToken()
    }
    return tokens + LogicCToken(LogicCTokenType.EOF, null)
  }

  public fun getToken(): LogicCToken {
    if (currentToken == null) nextToken()
    return currentToken as LogicCToken
  }

  public fun nextToken(): LogicCToken {
    while (position < length && text[position].isWhitespace()) { position++ }
    if (position == length) {
    currentToken = LogicCToken(LogicCTokenType.EOF,null);
    return currentToken as LogicCToken
    }
    val res = when {
    find("\\&") -> LogicCToken(LogicCTokenType.AND, currentData).also { position +=
        currentData!!.length }
    find("\\|") -> LogicCToken(LogicCTokenType.OR, currentData).also { position +=
        currentData!!.length }
    find("\\^") -> LogicCToken(LogicCTokenType.XOR, currentData).also { position +=
        currentData!!.length }
    find("\\!") -> LogicCToken(LogicCTokenType.NOT, currentData).also { position +=
        currentData!!.length }
    find("\\(") -> LogicCToken(LogicCTokenType.LB, currentData).also { position +=
        currentData!!.length }
    find("\\)") -> LogicCToken(LogicCTokenType.RB, currentData).also { position +=
        currentData!!.length }
    find("[a-zA-Z]+") -> LogicCToken(LogicCTokenType.VAR, currentData).also { position +=
        currentData!!.length }
    else -> throw ParseException("Unexpected token at position $position",position)
    }
    currentToken = res
    return res
  }
}
