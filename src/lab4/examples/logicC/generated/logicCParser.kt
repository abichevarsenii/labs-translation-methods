import java.text.ParseException

public class logicCParser(
  public val lexer: logicCLexer,
) {
  public fun a(params: Map<String, Boolean>, count: Boolean): logicCNode {
    val res = logicCNode("a")
    res.value = count
    when (lexer.getToken().type) {
    logicCTokenType.NOT -> {
    val b = b(params,count)
    res.children += b
    val aPoint = aPoint(params,count)
    res.children += aPoint
    res.value = aPoint.value
    }
    logicCTokenType.LB -> {
    val b = b(params,count)
    res.children += b
    val aPoint = aPoint(params,count)
    res.children += aPoint
    res.value = aPoint.value
    }
    logicCTokenType.VAR -> {
    val b = b(params,count)
    res.children += b
    val aPoint = aPoint(params,count)
    res.children += aPoint
    res.value = aPoint.value
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun aPoint(params: Map<String, Boolean>, count: Boolean): logicCNode {
    val res = logicCNode("aPoint")
    res.value = count
    when (lexer.getToken().type) {
    logicCTokenType.OR -> {
    val OR = logicCNode("OR",lexer.getToken().text!!)
    lexer.nextToken()
    val b = b(params,count)
    res.children += b
    val aPoint = aPoint(params,count)
    res.children += aPoint
    res.value = count || b.value
    }
    logicCTokenType.EOF -> {
    }
    logicCTokenType.RB -> {
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun b(params: Map<String, Boolean>, count: Boolean): logicCNode {
    val res = logicCNode("b")
    res.value = count
    when (lexer.getToken().type) {
    logicCTokenType.NOT -> {
    val c = c(params,count)
    res.children += c
    val bPoint = bPoint(params,count)
    res.children += bPoint
    res.value = bPoint.value
    }
    logicCTokenType.LB -> {
    val c = c(params,count)
    res.children += c
    val bPoint = bPoint(params,count)
    res.children += bPoint
    res.value = bPoint.value
    }
    logicCTokenType.VAR -> {
    val c = c(params,count)
    res.children += c
    val bPoint = bPoint(params,count)
    res.children += bPoint
    res.value = bPoint.value
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun bPoint(params: Map<String, Boolean>, count: Boolean): logicCNode {
    val res = logicCNode("bPoint")
    res.value = count
    when (lexer.getToken().type) {
    logicCTokenType.XOR -> {
    val XOR = logicCNode("XOR",lexer.getToken().text!!)
    lexer.nextToken()
    val c = c(params,count)
    res.children += c
    val bPoint = bPoint(params,count)
    res.children += bPoint
    res.value = count xor c.value
    }
    logicCTokenType.OR -> {
    }
    logicCTokenType.EOF -> {
    }
    logicCTokenType.RB -> {
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun c(params: Map<String, Boolean>, count: Boolean): logicCNode {
    val res = logicCNode("c")
    res.value = count
    when (lexer.getToken().type) {
    logicCTokenType.NOT -> {
    val d = d(params,count)
    res.children += d
    val cPoint = cPoint(params,count)
    res.children += cPoint
    res.value = cPoint.value
    }
    logicCTokenType.LB -> {
    val d = d(params,count)
    res.children += d
    val cPoint = cPoint(params,count)
    res.children += cPoint
    res.value = cPoint.value
    }
    logicCTokenType.VAR -> {
    val d = d(params,count)
    res.children += d
    val cPoint = cPoint(params,count)
    res.children += cPoint
    res.value = cPoint.value
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun cPoint(params: Map<String, Boolean>, count: Boolean): logicCNode {
    val res = logicCNode("cPoint")
    res.value = count
    when (lexer.getToken().type) {
    logicCTokenType.AND -> {
    val AND = logicCNode("AND",lexer.getToken().text!!)
    lexer.nextToken()
    val d = d(params,count)
    res.children += d
    val cPoint = cPoint(params,count)
    res.children += cPoint
    res.value = count && d.value
    }
    logicCTokenType.XOR -> {
    }
    logicCTokenType.OR -> {
    }
    logicCTokenType.EOF -> {
    }
    logicCTokenType.RB -> {
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun d(params: Map<String, Boolean>, count: Boolean): logicCNode {
    val res = logicCNode("d")
    res.value = count
    when (lexer.getToken().type) {
    logicCTokenType.NOT -> {
    val NOT = logicCNode("NOT",lexer.getToken().text!!)
    lexer.nextToken()
    val e = e(params,count)
    res.children += e
    res.value = !count
    }
    logicCTokenType.LB -> {
    val e = e(params,count)
    res.children += e
    res.value = e.value
    }
    logicCTokenType.VAR -> {
    val e = e(params,count)
    res.children += e
    res.value = e.value
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun e(params: Map<String, Boolean>, count: Boolean): logicCNode {
    val res = logicCNode("e")
    res.value = count
    when (lexer.getToken().type) {
    logicCTokenType.LB -> {
    val LB = logicCNode("LB",lexer.getToken().text!!)
    lexer.nextToken()
    val a = a(params,count)
    res.children += a
    res.value = a.value
    val RB = logicCNode("RB",lexer.getToken().text!!)
    lexer.nextToken()
    }
    logicCTokenType.VAR -> {
    val VAR = logicCNode("VAR",lexer.getToken().text!!)
    lexer.nextToken()
    res.value = params.get(VAR.text)!!;
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  private fun AND(): logicCNode {
    if (lexer.getToken().type == logicCTokenType.AND) {
    return logicCNode("AND")
    } else {
    throw ParseException("AND expected", lexer.position)
    }
  }

  private fun OR(): logicCNode {
    if (lexer.getToken().type == logicCTokenType.OR) {
    return logicCNode("OR")
    } else {
    throw ParseException("OR expected", lexer.position)
    }
  }

  private fun XOR(): logicCNode {
    if (lexer.getToken().type == logicCTokenType.XOR) {
    return logicCNode("XOR")
    } else {
    throw ParseException("XOR expected", lexer.position)
    }
  }

  private fun NOT(): logicCNode {
    if (lexer.getToken().type == logicCTokenType.NOT) {
    return logicCNode("NOT")
    } else {
    throw ParseException("NOT expected", lexer.position)
    }
  }

  private fun LB(): logicCNode {
    if (lexer.getToken().type == logicCTokenType.LB) {
    return logicCNode("LB")
    } else {
    throw ParseException("LB expected", lexer.position)
    }
  }

  private fun RB(): logicCNode {
    if (lexer.getToken().type == logicCTokenType.RB) {
    return logicCNode("RB")
    } else {
    throw ParseException("RB expected", lexer.position)
    }
  }

  private fun VAR(): logicCNode {
    if (lexer.getToken().type == logicCTokenType.VAR) {
    return logicCNode("VAR")
    } else {
    throw ParseException("VAR expected", lexer.position)
    }
  }
}
