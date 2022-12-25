import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List

public class logicCLexer(
  public val text: kotlin.String,
) {
  public var length: Int = text.length

  public var position: Int = 0

  public var currentData: String? = null

  public var currentToken: logicCToken? = null

  private fun find(`value`: kotlin.String): Boolean {
    val regex = value.toRegex()
    val match = regex.find(text, position)
    currentData = match?.value
    return match != null && match.range.first == position
  }

  public fun getTokens(): List<logicCToken> {
    val tokens = mutableListOf<logicCToken>()
    var token: logicCToken = nextToken()
    while (token.type != logicCTokenType.EOF) {
    tokens += token
    token = nextToken()
    }
    return tokens + logicCToken(logicCTokenType.EOF, null)
  }

  public fun getToken(): logicCToken {
    if (currentToken == null) nextToken()
    return currentToken as logicCToken
  }

  public fun nextToken(): logicCToken {
    while (position < length && text[position].isWhitespace()) { position++ }
    if (position == length) {
    currentToken = logicCToken(logicCTokenType.EOF,null);
    return currentToken as logicCToken
    }
    val res = when {
    find("\\&") -> logicCToken(logicCTokenType.AND, currentData).also { position +=
        currentData!!.length }
    find("\\|") -> logicCToken(logicCTokenType.OR, currentData).also { position +=
        currentData!!.length }
    find("\\^") -> logicCToken(logicCTokenType.XOR, currentData).also { position +=
        currentData!!.length }
    find("\\!") -> logicCToken(logicCTokenType.NOT, currentData).also { position +=
        currentData!!.length }
    find("\\(") -> logicCToken(logicCTokenType.LB, currentData).also { position +=
        currentData!!.length }
    find("\\)") -> logicCToken(logicCTokenType.RB, currentData).also { position +=
        currentData!!.length }
    find("[a-zA-Z]+") -> logicCToken(logicCTokenType.VAR, currentData).also { position +=
        currentData!!.length }
    else -> throw Exception("Unexpected token at position $position")
    }
    currentToken = res
    return res
  }
}
