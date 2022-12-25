grammar HTMLHighlighting;


compilationUnit
    :   packageDeclaration? importDeclaration* typeDeclaration* EOF
    ;

packageDeclaration
    :   'package' qualifiedName ';'
    ;

importDeclaration
    :   'import' ('static')? qualifiedName ('.' '*')? ';'
    ;

typeDeclaration
    :   classDeclaration
    |   interfaceDeclaration
    |   ';'
    ;

classDeclaration
    :   ('abstract' | 'final' | 'strictfp')* 'class' IDENTIFIER ('extends' type)? ('implements' typeList)? classBody
    ;

interfaceDeclaration
    :   ('abstract' | 'strictfp')* 'interface' IDENTIFIER ('extends' typeList)? interfaceBody
    ;

classBody
    :   '{' classBodyDeclaration* '}'
    ;

interfaceBody
    :   '{' interfaceMemberDeclaration* '}'
    ;

interfaceMemberDeclaration
    :   constantDeclaration
    |   abstractMethodDeclaration
    |   classDeclaration
    |   interfaceDeclaration
    ;

constantDeclaration
    :   type variableDeclaratorList ';'
    ;

abstractMethodDeclaration
    :   ('abstract' | 'default' | 'static' | 'strictfp')* type IDENTIFIER '(' formalParameterList? ')' ';'
    ;


classBodyDeclaration
    :   ';'
    |   ('static')? block
    |   memberDeclaration
    ;

memberDeclaration
    :   fieldDeclaration
    |   methodDeclaration
    |   classDeclaration
    |   interfaceDeclaration
    ;

fieldDeclaration
    :   type variableDeclaratorList ';'
    ;

methodDeclaration
    :   ('abstract' | 'final' | 'native' | 'static' | 'strictfp' | 'synchronized')* type IDENTIFIER '(' formalParameterList? ')' ('throws' qualifiedNameList)? ('{' blockStatement* '}' | ';')
    ;

variableDeclaratorList
    :   variableDeclarator (',' variableDeclarator)*
    ;

formalParameterList
    :   lastFormalParameter (',' formalParameter)*
    |   formalParameter (',' formalParameter)*
    ;

    localVariableDeclaration
        :   type variableDeclaratorList
        ;

variableDeclarator
    :   variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    :   IDENTIFIER ('[' ']')*
    ;

formalParameter
    :   type variableDeclaratorId
    ;

lastFormalParameter
    :   type variableDeclaratorId ',' '...' variableDeclaratorId
    ;

type
    :   primitiveType
    |   qualifiedName
    |   '?' (('extends' | 'super') type)?
    ;

typeList
    :   type (',' type)*
    ;

qualifiedNameList
    :   qualifiedName (',' qualifiedName)*
    ;

block
    :   '{' blockStatement* '}'
    ;

blockStatement
    :   block
    |   ';'
    |   expression ';'
    |   'if' '(' expression ')' blockStatement ('else' blockStatement)?
    |   'for' '(' (forInit)? ';' (expression)? ';' (expressionList)? ')' blockStatement
    |   'while' '(' expression ')' blockStatement
    |   'do' blockStatement 'while' '(' expression ')' ';'
    |   'try' block (catches | catchesFinally)
    |   'switch' '(' expression ')' '{' switchBlockStatementGroup* '}'
    |   'synchronized' '(' expression ')' block
    |   'return' (expression)? ';'
    |   'throw' expression ';'
    |   'break' (IDENTIFIER)? ';'
    |   'continue' (IDENTIFIER)? ';'
    |   'assert' expression (':' expression)? ';'
    ;

    catches
        :   'catch' '(' catchType variableDeclaratorId ')' block
        ;

    catchesFinally
        :   catches+ 'finally' block
        |   'finally' block
        ;

    catchType
        :   qualifiedName ('|' qualifiedName)*
        ;

    switchBlock
        :   '{' switchBlockStatementGroup* switchLabel* '}'
        ;

    switchBlockStatementGroup
        :   switchLabel+ block
        ;

    switchLabel
        :   'case' constantExpression ':'
        |   'default' ':'
        ;

    forInit
        :   localVariableDeclaration
        |   expressionList
        ;

    expressionList
        :   expression (',' expression)*
        ;

    constantExpression
        :   expression
        ;

    expression
        :   assignmentExpression
        ;

    assignmentExpression
        :   conditionalExpression
        |   assignment
        ;

    assignment
        :   leftHandSide assignmentOperator assignmentExpression
        ;

    leftHandSide
        :   expressionName
        |   fieldAccess
        |   arrayAccess
        ;

    assignmentOperator
        :   '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '>>>=' | '&=' | '^=' | '|='
        ;

    conditionalExpression
        :   conditionalOrExpression ('?' expression ':' conditionalExpression)?
        ;

    conditionalOrExpression
        :   conditionalAndExpression ('||' conditionalAndExpression)*
        ;

    conditionalAndExpression
        :   inclusiveOrExpression ('&&' inclusiveOrExpression)*
        ;

    inclusiveOrExpression
        :   exclusiveOrExpression ('|' exclusiveOrExpression)*
        ;

    exclusiveOrExpression
        :   andExpression ('^' andExpression)*
        ;

    andExpression
        :   equalityExpression ('&' equalityExpression)*
        ;

    equalityExpression
        :   relationalExpression (('==' | '!=') relationalExpression)*
        ;

    relationalExpression
        :   shiftExpression (('<=' | '>=' | '<' | '>') shiftExpression)*
        ;

    shiftExpression
        :   additiveExpression (('<<' | '>>' | '>>>') additiveExpression)*
        ;

    additiveExpression
        :   multiplicativeExpression (('+' | '-') multiplicativeExpression)*
        ;

    multiplicativeExpression
        :   unaryExpression (('*' | '/' | '%') unaryExpression)*;


        preIncrementExpression
            :   '++' unaryExpression
            ;

        preDecrementExpression
            :   '--' unaryExpression
            ;

        unaryExpression
            :   primary
            |   '(' type ')' unaryExpressionNotPlusMinus
            ;

        unaryExpressionNotPlusMinus
            :   postfixExpression
            |   '(' type ')' unaryExpression
            ;

        primary
            :   literal
            |   'this'
            |   '(' expression ')'
            |   classInstanceCreationExpression
            |   arrayCreationExpression
            |   postfixExpression '.' IDENTIFIER
            |   postfixExpression '[' expression ']'
            |   postfixExpression '++'
            |   postfixExpression '--'
            ;



        primaryNoNewArray
            :   literal
            |   'this'
            |   '(' expression ')'
            |   classInstanceCreationExpression
            |   fieldAccess
            |   methodInvocation
            |   arrayAccess
            ;

        fieldAccess
            :   primary '.' IDENTIFIER
            ;

        methodInvocation
            :   primary '.' IDENTIFIER '(' argumentList? ')'
            |   typeName '.' IDENTIFIER '(' argumentList? ')'
            |   IDENTIFIER '(' argumentList? ')'
            ;

        arrayAccess
            :   expressionName '[' expression ']'
            |   primaryNoNewArray '[' expression ']'
            ;

        postfixExpression
            :   primary
            |   expressionName
            |   postfixExpression '++'
            |   postfixExpression '--'
            ;

        literal
            :   INT_LITERAL
            |   LONG_LITERAL
            |   FLOAT_LITERAL
            |   DOUBLE_LITERAL
            |   CHAR_LITERAL
            |   STRING_LITERAL
            |   'true'
            |   'false'
            |   'null'
            ;

        classInstanceCreationExpression
            :   'new' type '(' argumentList? ')' classBody?
            ;

        argumentList
            :   expression (',' expression)*
            ;


        expressionName
            :   IDENTIFIER
            ;

        arrayCreationExpression
            :   'new' primitiveType dimExprs dims?
            |   'new' classOrInterfaceType dimExprs dims?
            |   'new' type dimExprs arrayInitializer
            ;

        dimExprs
            :   dimExpr+
            ;

        dimExpr
            :   '[' expression ']'
            ;

        dims
            :   '[' ']'+
            ;

        arrayInitializer
            :   '{' variableInitializerList? ','? '}'
            ;


variableInitializerList
    :   variableInitializer (',' variableInitializer)*
    ;

variableInitializer
    :   expression
    |   arrayInitializer
    ;

primitiveType
    :   'boolean'
    |   'char'
    |   'byte'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    ;

qualifiedName
    :   IDENTIFIER ('.' IDENTIFIER)*
    ;

typeName
    :   qualifiedName
    ;

classOrInterfaceType
    :   typeName
    |   '?' (('extends' | 'super') classOrInterfaceType)?
    ;

IDENTIFIER
    :   [a-zA-Z_] [a-zA-Z_0-9]*
    ;

INT_LITERAL
    :   '0' | [1-9][0-9]*
    ;

LONG_LITERAL
    :   INT_LITERAL 'l' | INT_LITERAL 'L'
    ;

FLOAT_LITERAL
    :   INT_LITERAL 'f' | INT_LITERAL 'F' | [0-9]+ '.' [0-9]* 'f' | [0-9]+ '.' [0-9]* 'F'
    ;

DOUBLE_LITERAL
    :   INT_LITERAL 'd' | INT_LITERAL 'D' | [0-9]+ '.' [0-9]* 'd' | [0-9]+ '.' [0-9]* 'D'
    ;

CHAR_LITERAL
    :   '\'' (ESC | ~[\\']) '\''
    ;

STRING_LITERAL
    :   '"' (ESC | ~[\\"])* '"'
    ;

ESC
    :   '\\' [btnfr"'\\]
    |   '\\' [0-3] [0-7] [0-7]
    |   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

HEX_DIGIT
    :   [0-9a-fA-F]
    ;

COMMENT :  '//' ~[\r\n]* -> skip
    ;

WS
    :   [ \t\r\n]+ -> skip
    ;