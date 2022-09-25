package analyzer

enum class Token(val char: String) {
    AND("&"),
    OR("|"),
    XOR("^"),
    NOT("!"),
    VARIABLE("VAR"),
    END("$"),
    LPAREN("("),
    RPAREN(")")
}