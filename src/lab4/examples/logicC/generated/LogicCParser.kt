import java.text.ParseException

public class LogicCParser(
  public val lexer: LogicCLexer,
) {
  
fun op(a: Boolean?, b: Boolean?, op: String): Boolean? {
    return if (a != null && b != null) when (op) {
        "^" -> a xor b
        "&" -> a && b
        "|" -> a || b
        "!" -> !a
        else -> null
    } else return null
}
fun check(s : String, b : Boolean?) : String{
    if (b == null) return s;
    else return b.toString();
}


  public fun a(
    params: Map<String, Boolean>,
    count: Boolean?,
    str: String,
  ): LogicCNode {
    val res = LogicCNode("a")
    res.value = count
    when (lexer.getToken().type) {
    LogicCTokenType.NOT -> {
    val b = b(params,count,str)
    res.children += b
    val aPoint = aPoint(params,b.value,str)
    res.children += aPoint
    res.value = aPoint.value; res.str = check(b.str + aPoint.str, aPoint.value);
    }
    LogicCTokenType.LB -> {
    val b = b(params,count,str)
    res.children += b
    val aPoint = aPoint(params,b.value,str)
    res.children += aPoint
    res.value = aPoint.value; res.str = check(b.str + aPoint.str, aPoint.value);
    }
    LogicCTokenType.VAR -> {
    val b = b(params,count,str)
    res.children += b
    val aPoint = aPoint(params,b.value,str)
    res.children += aPoint
    res.value = aPoint.value; res.str = check(b.str + aPoint.str, aPoint.value);
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun aPoint(
    params: Map<String, Boolean>,
    count: Boolean?,
    str: String,
  ): LogicCNode {
    val res = LogicCNode("aPoint")
    res.value = count
    when (lexer.getToken().type) {
    LogicCTokenType.OR -> {
    val OR = LogicCNode("OR",lexer.getToken().text!!)
    OR.isTerminal = true
    res.children += OR
    lexer.nextToken()
    val b = b(params,count,str)
    res.children += b
    val aPoint = aPoint(params,op(count, b.value,"|"),str)
    res.children += aPoint
    res.value = aPoint.value; res.str = check(OR.text!! + b.str + aPoint.str,aPoint.value);
    }
    LogicCTokenType.EOF -> {
    }
    LogicCTokenType.RB -> {
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun b(
    params: Map<String, Boolean>,
    count: Boolean?,
    str: String,
  ): LogicCNode {
    val res = LogicCNode("b")
    res.value = count
    when (lexer.getToken().type) {
    LogicCTokenType.NOT -> {
    val c = c(params,count,str)
    res.children += c
    val bPoint = bPoint(params,c.value,c.str)
    res.children += bPoint
    res.value = bPoint.value; res.str = check(c.str + bPoint.str, bPoint.value);
    }
    LogicCTokenType.LB -> {
    val c = c(params,count,str)
    res.children += c
    val bPoint = bPoint(params,c.value,c.str)
    res.children += bPoint
    res.value = bPoint.value; res.str = check(c.str + bPoint.str, bPoint.value);
    }
    LogicCTokenType.VAR -> {
    val c = c(params,count,str)
    res.children += c
    val bPoint = bPoint(params,c.value,c.str)
    res.children += bPoint
    res.value = bPoint.value; res.str = check(c.str + bPoint.str, bPoint.value);
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun bPoint(
    params: Map<String, Boolean>,
    count: Boolean?,
    str: String,
  ): LogicCNode {
    val res = LogicCNode("bPoint")
    res.value = count
    when (lexer.getToken().type) {
    LogicCTokenType.XOR -> {
    val XOR = LogicCNode("XOR",lexer.getToken().text!!)
    XOR.isTerminal = true
    res.children += XOR
    lexer.nextToken()
    val c = c(params,count,str)
    res.children += c
    val bPoint = bPoint(params, op(count, c.value,"^"),str)
    res.children += bPoint
    res.value = bPoint.value; res.str = check(XOR.text!! + c.str + bPoint.str,bPoint.value);
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

  public fun c(
    params: Map<String, Boolean>,
    count: Boolean?,
    str: String,
  ): LogicCNode {
    val res = LogicCNode("c")
    res.value = count
    when (lexer.getToken().type) {
    LogicCTokenType.NOT -> {
    val d = d(params,count,str)
    res.children += d
    val cPoint = cPoint(params,d.value,d.str)
    res.children += cPoint
    res.value = cPoint.value ; res.str = check(d.str + cPoint.str, cPoint.value);
    }
    LogicCTokenType.LB -> {
    val d = d(params,count,str)
    res.children += d
    val cPoint = cPoint(params,d.value,d.str)
    res.children += cPoint
    res.value = cPoint.value ; res.str = check(d.str + cPoint.str, cPoint.value);
    }
    LogicCTokenType.VAR -> {
    val d = d(params,count,str)
    res.children += d
    val cPoint = cPoint(params,d.value,d.str)
    res.children += cPoint
    res.value = cPoint.value ; res.str = check(d.str + cPoint.str, cPoint.value);
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun cPoint(
    params: Map<String, Boolean>,
    count: Boolean?,
    str: String,
  ): LogicCNode {
    val res = LogicCNode("cPoint")
    res.value = count
    when (lexer.getToken().type) {
    LogicCTokenType.AND -> {
    val AND = LogicCNode("AND",lexer.getToken().text!!)
    AND.isTerminal = true
    res.children += AND
    lexer.nextToken()
    val d = d(params,count,str)
    res.children += d
    val cPoint = cPoint(params, op(count, d.value, "&"),str)
    res.children += cPoint
    res.value = cPoint.value; res.str = check(AND.text!! + d.str + cPoint.str, cPoint.value);
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

  public fun d(
    params: Map<String, Boolean>,
    count: Boolean?,
    str: String,
  ): LogicCNode {
    val res = LogicCNode("d")
    res.value = count
    when (lexer.getToken().type) {
    LogicCTokenType.NOT -> {
    val NOT = LogicCNode("NOT",lexer.getToken().text!!)
    NOT.isTerminal = true
    res.children += NOT
    lexer.nextToken()
    val e = e(params,count,str)
    res.children += e
    res.value = op(e.value,false,"!") ; res.str = check(NOT.text!! + e.str, e.value);
    }
    LogicCTokenType.LB -> {
    val e = e(params,count,str)
    res.children += e
    res.value = e.value; res.str = e.str
    }
    LogicCTokenType.VAR -> {
    val e = e(params,count,str)
    res.children += e
    res.value = e.value; res.str = e.str
    }
    else -> throw ParseException("Unexpected token", lexer.position)
    }
    return res
  }

  public fun e(
    params: Map<String, Boolean>,
    count: Boolean?,
    str: String,
  ): LogicCNode {
    val res = LogicCNode("e")
    res.value = count
    when (lexer.getToken().type) {
    LogicCTokenType.LB -> {
    val LB = LogicCNode("LB",lexer.getToken().text!!)
    LB.isTerminal = true
    res.children += LB
    lexer.nextToken()
    val a = a(params,count,str)
    res.children += a
    val RB = LogicCNode("RB",lexer.getToken().text!!)
    RB.isTerminal = true
    res.children += RB
    lexer.nextToken()
    res.value = a.value; res.str = check(LB.text!! + a.str + RB.text!!, a.value)
    }
    LogicCTokenType.VAR -> {
    val VAR = LogicCNode("VAR",lexer.getToken().text!!)
    VAR.isTerminal = true
    res.children += VAR
    lexer.nextToken()
    res.value = params.get(VAR.text); res.str =  if (res.value != null) res.value.toString() else
        VAR.text!!;
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
