import java.text.ParseException

public class CalculatorParser(
  public val lexer: CalculatorLexer,
) {
  public fun e(): CalculatorNode {
    val res = CalculatorNode("e")
    when (lexer.getToken().type) {
    CalculatorTokenType.LB -> {
    val t = t()
    res.children += t
    val ePoint = ePoint(t.value)
    res.children += ePoint
    res.value = ePoint.value
    }
    CalculatorTokenType.INT -> {
    val t = t()
    res.children += t
    val ePoint = ePoint(t.value)
    res.children += ePoint
    res.value = ePoint.value
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun ePoint(count: Int): CalculatorNode {
    val res = CalculatorNode("ePoint")
    res.value = count
    when (lexer.getToken().type) {
    CalculatorTokenType.PLUS -> {
    val PLUS = CalculatorNode("PLUS",lexer.getToken().text!!)
    PLUS.isTerminal = true
    res.children += PLUS
    lexer.nextToken()
    val t = t()
    res.children += t
    val ePoint = ePoint(count + t.value)
    res.children += ePoint
    res.value = ePoint.value
    }
    CalculatorTokenType.MINUS -> {
    val MINUS = CalculatorNode("MINUS",lexer.getToken().text!!)
    MINUS.isTerminal = true
    res.children += MINUS
    lexer.nextToken()
    val t = t()
    res.children += t
    val ePoint = ePoint(count - t.value)
    res.children += ePoint
    res.value = ePoint.value
    }
    CalculatorTokenType.EOF -> {
    }
    CalculatorTokenType.RB -> {
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun t(): CalculatorNode {
    val res = CalculatorNode("t")
    when (lexer.getToken().type) {
    CalculatorTokenType.LB -> {
    val f = f()
    res.children += f
    val tPoint = tPoint(f.value)
    res.children += tPoint
    res.value = tPoint.value
    }
    CalculatorTokenType.INT -> {
    val f = f()
    res.children += f
    val tPoint = tPoint(f.value)
    res.children += tPoint
    res.value = tPoint.value
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun tPoint(count: Int): CalculatorNode {
    val res = CalculatorNode("tPoint")
    res.value = count
    when (lexer.getToken().type) {
    CalculatorTokenType.MULT -> {
    val MULT = CalculatorNode("MULT",lexer.getToken().text!!)
    MULT.isTerminal = true
    res.children += MULT
    lexer.nextToken()
    val f = f()
    res.children += f
    val tPoint = tPoint(count * f.value)
    res.children += tPoint
    res.value = tPoint.value
    }
    CalculatorTokenType.DIV -> {
    val DIV = CalculatorNode("DIV",lexer.getToken().text!!)
    DIV.isTerminal = true
    res.children += DIV
    lexer.nextToken()
    val f = f()
    res.children += f
    val tPoint = tPoint(count / f.value)
    res.children += tPoint
    res.value = tPoint.value
    }
    CalculatorTokenType.PLUS -> {
    }
    CalculatorTokenType.MINUS -> {
    }
    CalculatorTokenType.EOF -> {
    }
    CalculatorTokenType.RB -> {
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun f(): CalculatorNode {
    val res = CalculatorNode("f")
    when (lexer.getToken().type) {
    CalculatorTokenType.LB -> {
    val LB = CalculatorNode("LB",lexer.getToken().text!!)
    LB.isTerminal = true
    res.children += LB
    lexer.nextToken()
    val e = e()
    res.children += e
    res.value = e.value
    val RB = CalculatorNode("RB",lexer.getToken().text!!)
    RB.isTerminal = true
    res.children += RB
    lexer.nextToken()
    }
    CalculatorTokenType.INT -> {
    val INT = CalculatorNode("INT",lexer.getToken().text!!)
    INT.isTerminal = true
    res.children += INT
    lexer.nextToken()
    res.value = INT.text!!.toInt()
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  private fun PLUS(): CalculatorNode {
    if (lexer.getToken().type == CalculatorTokenType.PLUS) {
    return CalculatorNode("PLUS")
    } else {
    throw ParseException("PLUS expected", lexer.position)
    }
  }

  private fun MINUS(): CalculatorNode {
    if (lexer.getToken().type == CalculatorTokenType.MINUS) {
    return CalculatorNode("MINUS")
    } else {
    throw ParseException("MINUS expected", lexer.position)
    }
  }

  private fun MULT(): CalculatorNode {
    if (lexer.getToken().type == CalculatorTokenType.MULT) {
    return CalculatorNode("MULT")
    } else {
    throw ParseException("MULT expected", lexer.position)
    }
  }

  private fun DIV(): CalculatorNode {
    if (lexer.getToken().type == CalculatorTokenType.DIV) {
    return CalculatorNode("DIV")
    } else {
    throw ParseException("DIV expected", lexer.position)
    }
  }

  private fun LB(): CalculatorNode {
    if (lexer.getToken().type == CalculatorTokenType.LB) {
    return CalculatorNode("LB")
    } else {
    throw ParseException("LB expected", lexer.position)
    }
  }

  private fun RB(): CalculatorNode {
    if (lexer.getToken().type == CalculatorTokenType.RB) {
    return CalculatorNode("RB")
    } else {
    throw ParseException("RB expected", lexer.position)
    }
  }

  private fun INT(): CalculatorNode {
    if (lexer.getToken().type == CalculatorTokenType.INT) {
    return CalculatorNode("INT")
    } else {
    throw ParseException("INT expected", lexer.position)
    }
  }
}
