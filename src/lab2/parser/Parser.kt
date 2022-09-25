package parser

import analyzer.LexicalAnalyzer
import analyzer.Token
import parser.Tree.*
import java.io.InputStream
import java.text.ParseException

class Parser {
    private lateinit var lex : LexicalAnalyzer
    private var token: Token? = null

    @Throws(ParseException::class)
    fun parse(reader : InputStream): Node{
        lex = LexicalAnalyzer(reader)
        token = lex.nextToken()
        return A()
    }

    fun A() : Node {
        val res = NonTerminal("A")
        return when(token){
            Token.NOT,Token.VARIABLE,Token.LPAREN -> {
                res.add(B())
                res.add(A1())
                res
            }
            else -> throw ParseException("Illegal character $token", lex.curPos())
        }
    }

    fun A1() : Node {
        val res = NonTerminal("A'")
        return when(token){
            Token.OR -> {
                res.add(Terminal(token!!.char))
                token = lex.nextToken()
                res.add(B())
                res.add(A1())
                res
            }
            Token.END,Token.RPAREN -> {res}
            else -> throw ParseException("Illegal character $token", lex.curPos())
        }
    }

    fun B() : Node {
        val res = NonTerminal("B")
        return when(token){
            Token.NOT,Token.VARIABLE,Token.LPAREN -> {
                res.add(C())
                res.add(B1())
                res
            }
            else -> throw ParseException("Illegal character $token", lex.curPos())
        }
    }

    fun B1() : Node {
        val res = NonTerminal("B'")
        return when(token){
            Token.XOR -> {
                res.add(Terminal(token!!.char))
                token = lex.nextToken()
                res.add(C())
                res.add(B1())
                res
            }
            Token.END,Token.RPAREN,Token.OR -> {res}
            else -> throw ParseException("Illegal character $token", lex.curPos())
        }
    }

    fun C() : Node {
        val res = NonTerminal("C")
        return when(token){
            Token.NOT,Token.VARIABLE,Token.LPAREN -> {
                res.add(D())
                res.add(C1())
                res
            }
            else -> throw ParseException("Illegal character $token", lex.curPos())
        }
    }

    fun C1() : Node {
        val res = NonTerminal("C'")
        return when(token){
            Token.AND -> {
                res.add(Terminal(token!!.char))
                token = lex.nextToken()
                res.add(D())
                res.add(C1())
                res
            }
            Token.END,Token.RPAREN,Token.OR,Token.XOR -> {res}
            else -> throw ParseException("Illegal character $token", lex.curPos())
        }
    }

    fun D() : Node {
        val res = NonTerminal("D")
        return when(token){
            Token.NOT -> {
                res.add(Terminal(token!!.char))
                token = lex.nextToken()
                res.add(E())
                res
            }
            Token.VARIABLE,Token.LPAREN -> {
                res.add(E())
                res
            }
            else -> throw ParseException("Illegal character $token", lex.curPos())
        }
    }

    fun E() : Node {
        val res = NonTerminal("D")
        return when(token){
            Token.VARIABLE -> {
                res.add(Terminal(token!!.char,lex.curVar()))
                token = lex.nextToken()
                res
            }
            Token.LPAREN -> {
                res.add(Terminal(token!!.char))
                token = lex.nextToken()

                res.add(A())

                assert(token == Token.RPAREN)
                res.add(Terminal(token!!.char))
                token = lex.nextToken()
                res
            }
            else -> throw ParseException("Illegal character $token", lex.curPos())
        }
    }



}