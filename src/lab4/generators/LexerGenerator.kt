package lab4.generators

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import lab4.analyzers.grammar.Grammar
import java.io.InputStream
import java.text.ParseException
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
        .returns(ClassName("kotlin.collections", "List").parameterizedBy(ClassName("",  grammar.name + "Token")))
        .addStatement("val tokens = mutableListOf<%T>()", ClassName("",  grammar.name + "Token"))
        .addStatement("var token: %LToken = nextToken()", grammar.name!!)
        .addStatement("while (token.type != %LTokenType.EOF) {", grammar.name!!)
        .addStatement("tokens += token")
        .addStatement("token = nextToken()")
        .addStatement("}")
        .addStatement("return tokens + %LToken(%LTokenType.EOF, null)", grammar.name!!, grammar.name!!)
        .build()


    private val getTokenFunction = FunSpec.builder("getToken")
        .returns(ClassName("",  grammar.name + "Token"))
        .addStatement("if (currentToken == null) nextToken()")
        .addStatement("return currentToken as %LToken", grammar.name!!)
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
            .addProperty(
                PropertySpec.builder("currentToken", ClassName("", grammar.name + "Token").copy(nullable = true))
                    .initializer("null")
                    .mutable()
                    .build()
            )
            .addFunction(findFunction)
            .addFunction(getTokensFunction)
            .addFunction(getTokenFunction)
            .addFunction(
                FunSpec.builder("nextToken").returns(ClassName("", grammar.name + "Token"))
                    .addStatement("while (position < length && text[position].isWhitespace()) { position++ }")
                    .addStatement("if (position == length) {")
                    .addStatement("currentToken = %LToken(%LTokenType.EOF,null);",grammar.name!!, grammar.name!!)
                    .addStatement("return currentToken as %LToken",grammar.name!!)
                    .addStatement("}")
                    .addStatement("val res = when {")
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

                    .addStatement("else -> throw %T(\"Unexpected token at position \$position\",position)", ParseException::class)
                    .addStatement("}")
                    .addStatement("currentToken = res")
                    .addStatement("return res")
                    .build()
            )
            .build()

        val typeTokenClass = TypeSpec.classBuilder(ClassName("", grammar.name + "Token"))
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter("type", ClassName("", grammar.name + "TokenType"))
                    .addParameter("text", ClassName("","String").copy(nullable = true))
                    .build()
            ).addProperty(
                PropertySpec.builder("type", ClassName("", grammar.name + "TokenType"))
                    .initializer("type")
                    .build()
            )
            .addProperty(
                PropertySpec.builder("text", ClassName("","String").copy(nullable = true))
                    .initializer("text")
                    .build()
            )
            .addFunction(
                FunSpec.builder("toString")
                    .addModifiers(KModifier.OVERRIDE)
                    .returns(String::class)
                    .addStatement("return \"\$type: \$text\"")
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

        file.writeTo(Path(path))
        file2.writeTo(Path(path))
        file3.writeTo(Path(path))

    }
}