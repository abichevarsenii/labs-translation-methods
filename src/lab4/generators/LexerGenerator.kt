package lab4.generators

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import lab4.analyzers.grammar.Grammar
import java.io.InputStream
import kotlin.io.path.Path

class LexerGenerator(private val grammar: Grammar) {

    private val findFunction = FunSpec.builder("find")
        .addModifiers(KModifier.PRIVATE)
        .addParameter("value", String::class)
        .returns(Boolean::class)
        .addStatement("val regex = value.toRegex()")
        .addStatement("val match = regex.find(text, position)")
        .addStatement("currentData = match?.value")
        .addStatement("return match != null && match.range.first == position")
        .build()

    private val getTokensFunction = FunSpec.builder("getTokens")
        .addModifiers(KModifier.PRIVATE)
        .returns(ClassName("kotlin.collections", "List").parameterizedBy(ClassName("",  grammar.name + "Token")))
        .addStatement("val tokens = mutableListOf<%T>()", ClassName("",  grammar.name + "Token"))
        .addStatement("var token: %LToken? = getNextToken()", grammar.name!!)
        .addStatement("while (token != null) {")
        .addStatement("tokens += token")
        .addStatement("token = getNextToken()")
        .addStatement("}")
        .addStatement("return tokens + %LToken(%LTokenType.EOF, null)", grammar.name!!, grammar.name!!)
        .build()





    fun generate(path: String) {
        val lexerClass = TypeSpec.classBuilder(ClassName("", grammar.name + "Lexer"))
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter("text", String::class)
                    .build()
            ).addProperty(
                PropertySpec.builder("text", String::class)
                    .initializer("text")
                    .build()
            )
            .addProperty(
                PropertySpec.builder("length", Int::class)
                    .initializer("text.length")
                    .mutable()
                    .build()
            )
            .addProperty(
                PropertySpec.builder("position", Int::class)
                    .initializer("0")
                    .mutable()
                    .build()
            )
            .addProperty(
                PropertySpec.builder("currentData", ClassName("","String").copy(nullable = true))
                    .initializer("null")
                    .mutable()
                    .build()
            )
            .addFunction(findFunction)
            .addFunction(getTokensFunction)
            .addFunction(
                FunSpec.builder("getNextToken").returns(ClassName("", grammar.name + "Token").copy(nullable = true))
                    .addStatement("while (position < length && text[position].isWhitespace()) { position++ }")
                    .addStatement("if (position == length) { return null }")
                    .addStatement("return when {")
                    .apply {
                        grammar.tokens.forEach { rule ->
                            addStatement(
                                "find(%L) -> %LToken(%LTokenType.%L, currentData).also { position += currentData!!.length }",
                                rule.regex!!.replace("\'", "\""),
                                grammar.name!!,
                                grammar.name!!,
                                rule.name!!.uppercase()
                            )
                        }
                    }
                    .addStatement("else -> throw Exception(\"Unexpected token at position \$position\")")
                    .addStatement("}")
                    .build()
            )
            .build()

        val typeTokenClass = TypeSpec.classBuilder(ClassName("", grammar.name + "Token"))
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter("type", ClassName("", grammar.name + "TokenType").copy(nullable = true))
                    .addParameter("text", ClassName("","String").copy(nullable = true))
                    .build()
            ).addProperty(
                PropertySpec.builder("type", ClassName("", grammar.name + "TokenType").copy(nullable = true))
                    .initializer("type")
                    .build()
            )
            .addProperty(
                PropertySpec.builder("text", ClassName("","String").copy(nullable = true))
                    .initializer("text")
                    .build()
            )
            .build()

        val enumTokenTypeClass = TypeSpec.enumBuilder(ClassName("", grammar.name + "TokenType"))
            .apply {
                grammar.tokens.forEach { rule ->
                    addEnumConstant(rule.name!!.uppercase())
                }
                addEnumConstant("EOF")
            }
            .build()


        val file = FileSpec.builder("", grammar.name + "Lexer").addType(lexerClass).build()
        val file2 = FileSpec.builder("", grammar.name + "Token").addType(typeTokenClass).build()
        val file3 = FileSpec.builder("", grammar.name + "TokenType").addType(enumTokenTypeClass).build()

        file.writeTo(Path("src/lab4/examples/calc"))
        file2.writeTo(Path("src/lab4/examples/calc"))
        file3.writeTo(Path("src/lab4/examples/calc"))

    }
}