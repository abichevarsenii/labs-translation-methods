package analyzer

import java.io.IOException
import java.io.InputStream
import java.text.ParseException

class LexicalAnalyzer(var reader: InputStream) {
    var curChar: Int = 0
    var curPos = 0
    var curToken: Token? = null
    var curVar: String = ""

    init {
        nextChar()
    }

    private fun isBlank(c: Char): Boolean {
        return c == ' ' || c == '\r' || c == '\n' || c == '\t'
    }

    @Throws(ParseException::class)
    private fun nextChar() {
        curPos++
        curChar = try {
            reader.read()
        } catch (e: IOException) {
            throw ParseException(e.message, curPos)
        }
    }

    @Throws(ParseException::class)
    fun nextToken() : Token? {
        while (isBlank(curChar.toChar())) {
            nextChar()
        }
        curToken = when (curChar) {
            '&'.code -> {
                nextChar()
                Token.AND
            }

            '|'.code -> {
                nextChar()
                Token.OR
            }

            '^'.code -> {
                nextChar()
                Token.XOR
            }

            '!'.code -> {
                nextChar()
                Token.NOT
            }

            '('.code -> {
                nextChar()
                Token.LPAREN
            }

            ')'.code -> {
                nextChar()
                Token.RPAREN
            }

            in ('A'..'z').map { a -> a.code } -> {
                curVar = curChar.toChar().toString()
                nextChar()
                Token.VARIABLE
            }
            -1 -> Token.END
            else -> throw ParseException("Illegal character $curChar", curPos)
        }
        return curToken()
    }

    fun curVar() : String{
        return curVar
    }

    fun curToken(): Token? {
        return curToken
    }
    
    fun curPos(): Int {
        return curPos
    }
}