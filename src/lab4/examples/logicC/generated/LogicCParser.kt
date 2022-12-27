import java.text.ParseException

public class LogicCParser(
  public val lexer: LogicCLexer,
) {
  init {
  }

  public fun a(params: Map<String, Boolean>): LogicCNode {
    val res = LogicCNode("a")
    when (lexer.getToken().type) {
    LogicCTokenType.NOT -> {
    val b = b(params)
    res.children += b
    val aPoint = aPoint(params)
    res.children += aPoint
    }
    LogicCTokenType.LB -> {
    val b = b(params)
    res.children += b
    val aPoint = aPoint(params)
    res.children += aPoint
    }
    LogicCTokenType.VAR -> {
    val b = b(params)
    res.children += b
    val aPoint = aPoint(params)
    res.children += aPoint
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun aPoint(params: Map<String, Boolean>): LogicCNode {
    val res = LogicCNode("aPoint")
    when (lexer.getToken().type) {
    LogicCTokenType.OR -> {
    val OR = LogicCNode("OR",lexer.getToken().text!!)
    OR.isTerminal = true
    res.children += OR
    lexer.nextToken()
    val b = b(params)
    res.children += b
    val aPoint = aPoint(params)
    res.children += aPoint
    }
    LogicCTokenType.EOF -> {
    }
    LogicCTokenType.RB -> {
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun b(params: Map<String, Boolean>): LogicCNode {
    val res = LogicCNode("b")
    when (lexer.getToken().type) {
    LogicCTokenType.NOT -> {
    val c = c(params)
    res.children += c
    val bPoint = bPoint(params)
    res.children += bPoint
    }
    LogicCTokenType.LB -> {
    val c = c(params)
    res.children += c
    val bPoint = bPoint(params)
    res.children += bPoint
    }
    LogicCTokenType.VAR -> {
    val c = c(params)
    res.children += c
    val bPoint = bPoint(params)
    res.children += bPoint
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun bPoint(params: Map<String, Boolean>): LogicCNode {
    val res = LogicCNode("bPoint")
    when (lexer.getToken().type) {
    LogicCTokenType.XOR -> {
    val XOR = LogicCNode("XOR",lexer.getToken().text!!)
    XOR.isTerminal = true
    res.children += XOR
    lexer.nextToken()
    val c = c(params)
    res.children += c
    val bPoint = bPoint(params)
    res.children += bPoint
    }
    LogicCTokenType.OR -> {
    }
    LogicCTokenType.EOF -> {
    }
    LogicCTokenType.RB -> {
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun c(params: Map<String, Boolean>): LogicCNode {
    val res = LogicCNode("c")
    when (lexer.getToken().type) {
    LogicCTokenType.NOT -> {
    val d = d(params)
    res.children += d
    val cPoint = cPoint(params)
    res.children += cPoint
    }
    LogicCTokenType.LB -> {
    val d = d(params)
    res.children += d
    val cPoint = cPoint(params)
    res.children += cPoint
    }
    LogicCTokenType.VAR -> {
    val d = d(params)
    res.children += d
    val cPoint = cPoint(params)
    res.children += cPoint
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun cPoint(params: Map<String, Boolean>): LogicCNode {
    val res = LogicCNode("cPoint")
    when (lexer.getToken().type) {
    LogicCTokenType.AND -> {
    val AND = LogicCNode("AND",lexer.getToken().text!!)
    AND.isTerminal = true
    res.children += AND
    lexer.nextToken()
    val d = d(params)
    res.children += d
    val cPoint = cPoint(params)
    res.children += cPoint
    }
    LogicCTokenType.XOR -> {
    }
    LogicCTokenType.OR -> {
    }
    LogicCTokenType.EOF -> {
    }
    LogicCTokenType.RB -> {
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun d(params: Map<String, Boolean>): LogicCNode {
    val res = LogicCNode("d")
    when (lexer.getToken().type) {
    LogicCTokenType.NOT -> {
    val NOT = LogicCNode("NOT",lexer.getToken().text!!)
    NOT.isTerminal = true
    res.children += NOT
    lexer.nextToken()
    val e = e(params)
    res.children += e
    }
    LogicCTokenType.LB -> {
    val e = e(params)
    res.children += e
    }
    LogicCTokenType.VAR -> {
    val e = e(params)
    res.children += e
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun e(params: Map<String, Boolean>): LogicCNode {
    val res = LogicCNode("e")
    when (lexer.getToken().type) {
    LogicCTokenType.LB -> {
    val LB = LogicCNode("LB",lexer.getToken().text!!)
    LB.isTerminal = true
    res.children += LB
    lexer.nextToken()
    val a = a(params)
    res.children += a
    val RB = LogicCNode("RB",lexer.getToken().text!!)
    RB.isTerminal = true
    res.children += RB
    lexer.nextToken()
    }
    LogicCTokenType.VAR -> {
    val VAR = LogicCNode("VAR",lexer.getToken().text!!)
    VAR.isTerminal = true
    res.children += VAR
    lexer.nextToken()
    res.value = params.get(VAR.text)!!; VAR.value = res.value;
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  private fun AND(): LogicCNode {
    if (lexer.getToken().type == LogicCTokenType.AND) {
    return LogicCNode("AND")
    } else {
    throw ParseException("AND expected", lexer.position)
    }
  }

  private fun OR(): LogicCNode {
    if (lexer.getToken().type == LogicCTokenType.OR) {
    return LogicCNode("OR")
    } else {
    throw ParseException("OR expected", lexer.position)
    }
  }

  private fun XOR(): LogicCNode {
    if (lexer.getToken().type == LogicCTokenType.XOR) {
    return LogicCNode("XOR")
    } else {
    throw ParseException("XOR expected", lexer.position)
    }
  }

  private fun NOT(): LogicCNode {
    if (lexer.getToken().type == LogicCTokenType.NOT) {
    return LogicCNode("NOT")
    } else {
    throw ParseException("NOT expected", lexer.position)
    }
  }

  private fun LB(): LogicCNode {
    if (lexer.getToken().type == LogicCTokenType.LB) {
    return LogicCNode("LB")
    } else {
    throw ParseException("LB expected", lexer.position)
    }
  }

  private fun RB(): LogicCNode {
    if (lexer.getToken().type == LogicCTokenType.RB) {
    return LogicCNode("RB")
    } else {
    throw ParseException("RB expected", lexer.position)
    }
  }

  private fun VAR(): LogicCNode {
    if (lexer.getToken().type == LogicCTokenType.VAR) {
    return LogicCNode("VAR")
    } else {
    throw ParseException("VAR expected", lexer.position)
    }
  }
}
