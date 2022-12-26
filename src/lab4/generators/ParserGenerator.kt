package lab4.generators

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import lab4.analyzers.grammar.Grammar
import java.text.ParseException
import kotlin.io.path.Path

class ParserGenerator(private val grammar: Grammar) {

    fun generateNodeClass(returnType : ClassName?, returnValue: String?) : TypeSpec {
        val res = TypeSpec.classBuilder(ClassName("", grammar.name + "Node"))
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter(  "name", ClassName("", "String").copy(nullable = true))
                    .addParameter(
                        ParameterSpec("text", ClassName("", "String").copy(nullable = true))
                        .toBuilder()
                        .defaultValue("null")
                        .build())
                    .build()
            )
            .addProperty(
                PropertySpec.builder("name", ClassName("", "String").copy(nullable = true))
                    .initializer("name")
                    .mutable()
                    .build()
            )
            .addProperty(
                PropertySpec.builder("text", ClassName("", "String").copy(nullable = true))
                    .initializer("text")
                    .mutable()
                    .build()
            )
            .addProperty(
                PropertySpec.builder("children", ClassName("kotlin.collections", "List").parameterizedBy(ClassName("", grammar.name + "Node")))
                    .initializer("emptyList()")
                    .mutable()
                    .build()
            )
            .addProperty(
                PropertySpec.builder("isTerminal", Boolean::class)
                    .initializer("false")
                    .mutable()
                    .build()
            )
            .addFunction(
                FunSpec.builder("toString")
                    .addModifiers(KModifier.OVERRIDE)
                    .returns(String::class)
                    .addStatement("return \"\$name: \$value\"")
                    .build()
            )
        if (returnType != null && returnValue != null) {
            res.addProperty(
                PropertySpec.builder("value", returnType)
                    .initializer(returnValue)
                    .mutable()
                    .build()
            )
        }
        return res.build()
    }

    fun generateTerminal(name: String): FunSpec {
        return FunSpec.builder(name)
            .addModifiers(KModifier.PRIVATE)
            .addStatement("if (lexer.getToken().type == %LTokenType.%L) {", grammar.name!!, name)
            .addStatement("return %LNode(\"%L\")", grammar.name!!, name)
            .addStatement("} else {")
            .addStatement("throw ParseException(\"%L expected\", lexer.position)", name)
            .addStatement("}")
            .returns(ClassName("", grammar.name + "Node"))
            .build()
    }

    private fun generateItem(item: Grammar.Item) : CodeBlock {
        val code = CodeBlock.builder()

        val maybeToken: Grammar.StateToken? = grammar.tokens.find { it.name == item.name }
        if (maybeToken != null) {
            code.addStatement("val %L = %L(\"%L\",lexer.getToken().text!!)", item.name, grammar.name + "Node", item.name)
            code.addStatement("%L.isTerminal = true", item.name)
            code.addStatement("res.children += %L", item.name)
            code.addStatement("lexer.nextToken()")
        } else {
            if (item.arg != null) {
                code.addStatement("val %L = %L(%L)", item.name, item.name, item.arg!!.drop(1).dropLast(1))
            } else {
                code.addStatement("val %L = %L()", item.name, item.name)
            }
            code.addStatement("res.children += %L", item.name)
        }
        if (item.code != null) {
            code.addStatement(item.code!!.dropLast(1).drop(1))
        }
        return code.build()
    }

    private fun generateItems(items : List<Grammar.Item>) : CodeBlock {
        val code = CodeBlock.builder()
        for (item in items) {
            code.add(generateItem(item))
        }
        return code.build()
    }


    fun generateState(name: String) : FunSpec {
        val state = grammar.states.find { it.name == name }!!
        val funSpec = FunSpec.builder(name)
        funSpec.returns(ClassName("", grammar.name + "Node"))
        funSpec.addStatement("val res = %LNode(\"%L\")", grammar.name!!, name)
        state.args.forEach{
            val nameArg = it.drop(1).dropLast(1).split(":")[0].replace(" ","")
            val typeArg = it.drop(1).dropLast(1).split(":")[1].replace(" ","")
            if (typeArg.matches(Regex("(.)+?<(.)+?>"))) {
                val type = ClassName("", typeArg.split("<")[0])
                val typeArgs = typeArg.split("<")[1].dropLast(1).split(",").map { ClassName("", it) }
                funSpec.addParameter(nameArg, type.parameterizedBy(typeArgs))
            } else {
                funSpec.addParameter(nameArg, ClassName("", typeArg))
            }
            if (typeArg == grammar.returnType){
                funSpec.addStatement("res.value = %L", nameArg)
            }
        }

        funSpec.addStatement("when (lexer.getToken().type) {")
        state.rules.forEach { rule ->
            funSpec.addCode(generateRule(rule, state))
        }
        funSpec.addStatement("else -> throw ParseException(\"Unexpected token\", lexer.position)")
        funSpec.addStatement("}")
        funSpec.addStatement("return res")

        return funSpec.build()
    }

    fun generateRule(rule : Grammar.Rule,state : Grammar.State) : CodeBlock {
        val code = CodeBlock.builder()

        val nextTargetName = rule.items[0].name
        val first = if (nextTargetName == "EPS" || grammar.tokens.find { it.name == nextTargetName } != null) {
            hashSetOf(nextTargetName)
        } else {
            grammar.FIRST[nextTargetName]!!
        }
        val follow = grammar.FOLLOW[state.name]!!
        for (currFirst in first) {
            if (currFirst == "EPS") continue
            val functionStateBodyRule = generateItems(rule.items)
            code.addStatement("%LTokenType.%L -> {", grammar.name!!, currFirst)
            code.add(functionStateBodyRule)
            code.addStatement("}")
        }

        follow.removeAll { it in first }
        if (first.contains("EPS")) {
            for (currFollow in follow) {
                val currTokenName = if (currFollow == "EOF") "EOF" else currFollow
                val functionStateBodyRule = ""
                code.addStatement("%LTokenType.%L -> {", grammar.name!!, currTokenName)
                code.add(functionStateBodyRule)
                code.addStatement("}")
            }
        }
        return code.build()
    }




    fun generate(path: String) {
        grammar.buildFirst()
        grammar.buildFollow()

        for (key in grammar.FIRST.keys) {
            print("$key: ")
            println(grammar.FIRST[key].toString())
        }
        println("=====")
        for (key in grammar.FOLLOW.keys) {
            print("$key: ")
            println(grammar.FOLLOW[key].toString())
        }


        val nodeClass = generateNodeClass(if (grammar.returnType == null) null else ClassName("", grammar.returnType!!), grammar.returnValue)

        val parserClass = TypeSpec.classBuilder(ClassName("", grammar.name + "Parser"))
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter("lexer", ClassName("", grammar.name + "Lexer"))
                    .build()
            ).addProperty(
                PropertySpec.builder("lexer", ClassName("", grammar.name + "Lexer"))
                    .initializer("lexer")
                    .build()
            )
            .addFunctions(grammar.states.map { generateState(it.name!!) })
            .addFunctions(grammar.tokens.map { generateTerminal(it.name!!) })
            .build()

        val file = FileSpec.builder("", grammar.name + "Parser").addType(parserClass).addImport("java.text", "ParseException").build()
        val fileNode = FileSpec.builder("", grammar.name + "Node").addType(nodeClass).build()

        file.writeTo(Path(path))
        fileNode.writeTo(Path(path))
    }
}