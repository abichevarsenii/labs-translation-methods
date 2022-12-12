grammar HTMLHighlighting;

start returns [String val] : class;

/*start returns [String val] : headerNode
    { $val = $headerNode.val;};

headerNode returns [String val] : packageNode? importNode?
    { $val = Tools.getClass($packageNode.val,"var") + Tools.nextLine(2) +Tools.getClass($importNode.val + ";","simple") + Tools.nextLine() ; };

packageNode returns [String val] :PACKAGE PACKAGE_NAME';'
    { $val = Tools.getPackage($PACKAGE_NAME.text) ; };

importNode returns [String val] :
    IMPORT PACKAGE_NAME PACKAGE_END? ';' importNode
        { $val = "fj" }
    | IMPORT PACKAGE_NAME PACKAGE_END? ';'
        { $val = Tools.getImport($PACKAGE_NAME.text); };*/

//значения примитивов




//название типа
nameType returns [String val] : { Tools.isNotReservedWord(_input.LT(1).getText()) }? NAME(('.')NAME)*;
typeVar returns [String val] : nameType | nameType'<'typeVar'>' | typeVar'['']';

value returns [String val] : primitiveValue | callMethod | NEW typeVar? value | callMethod('.'value)* | nameType('.'value)* | '{' value(',' value)* '}';
declareVar returns [String val] : typeVar nameType ';' | MODIFIER* typeVar (nameType ASSIGN value)(','nameType ASSIGN value)* ';';
declareField returns [String val] : annotation* MODIFIER+ typeVar nameType ';' | MODIFIER* typeVar (nameType ASSIGN value)(','nameType ASSIGN value)* ';';
assignVar returns [String val] : nameType ASSIGN value;

callMethod returns [String val] : nameType'('')' | nameType'(' (nameType|callMethod|value)(','(nameType|callMethod|value))* ')';

annotation returns [String val] : AT callMethod | AT nameType;
arg returns [String val] : typeVar nameType;
exeptions returns [String val] : THROWS nameType(','nameType)*;
function returns [String val] : annotation* MODIFIER* typeVar nameType'(' (arg(','arg)*)? ')' exeptions? '{' bodyFunction? returnFunction? '}';
bodyFunction returns [String val] : (declareVar | assignVar | callMethod | function | ifStatement)+';';
returnFunction returns [String val] : RETURN value ';';

ifStatement returns [String val] : IF'('callMethod')' '{' bodyFunction '}' elseStatement? | IF'('callMethod')' bodyFunction elseStatement?;

elseStatement returns [String val] : ELSE '{' bodyFunction '}';

castStatement returns [String val] : '('typeVar')' callMethod; //исправить

implements returns [String val] : IMPLEMENTS nameType(','nameType)*;
exstends returns [String val] : EXTENDS nameType;
class returns [String val] : annotation? MODIFIER* CLASS nameType exstends? implements? '{' bodyClass* '}';
constructor returns [String val] : annotation* MODIFIER? nameType'(' (arg(','arg)*)? ')' exeptions? '{' bodyFunction* '}';
bodyClass returns [String val] : constructor | declareField | callMethod | function | class | ifStatement';';

primitiveValue returns [String val] : INT | FLOAT | STRING | CHAR | BOOLEAN | NULL;

//for


// try catch finally

RETURN : 'return';
CLASS : 'class';
IMPLEMENTS : 'implements';
EXTENDS : 'extends';
FOR : 'for';
IF : 'if';
ELSE : 'else';
THROWS : 'throws';
AT : '@';
NEW : 'new';
ASSIGN : '=';



NULL : 'null';
INT : [0-9]+;
FLOAT : [0-9]+.[0-9]+;
STRING : '"'[a-zA-Z_0-9.]*'"';
CHAR : '\''[a-zA-Z_0-9]'\'';
BOOLEAN : TRUE | FALSE;
TRUE : 'true';
FALSE : 'false';


MODIFIER : PUBLIC | PRIVATE | FINAL | STATIC | VOLATILE | TRANSIENT | SYNCHRONIZED | NATIVE | ABSTRACT | PROTECTED;

PUBLIC : 'public';
PRIVATE : 'private';
FINAL : 'final';
STATIC : 'static';
VOLATILE : 'volatile';
TRANSIENT : 'transient';
SYNCHRONIZED : 'synchronized';
NATIVE : 'native';
ABSTRACT : 'abstract';
PROTECTED : 'protected';

NAME : [a-zA-Z_][a-zA-Z_0-9]*;

/*
PACKAGE: 'package';
PACKAGE_END: '.*';
IMPORT: 'import';
NAME_ : [a-zA-Z_0-9]+ ;
PACKAGE_NAME : NAME_(('.')NAME_)*;
*/



WS: [ \t\r\n]+ -> channel(HIDDEN);