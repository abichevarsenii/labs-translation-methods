grammar HTMLHighlighting;

start returns [String val] : class;

nameType returns [String val] : primitiveType | { Tools.isNotReservedWord(_input.LT(1).getText()) }? NAME(('.')NAME)*;
typeVar returns [String val] : nameType | nameType'<'typeVar'>' | typeVar '[' value? ']';

primitiveValue returns [String val] : INT | FLOAT | STRING | CHAR | BOOLEAN | NULL;
primitiveType returns [String val] : INT_TYPE | FLOAT_TYPE | CHAR_TYPE | BOOLEAN_TYPE | VOID_TYPE;
value returns [String val] : primitiveValue | callMethod | NEW typeVar? value? | callMethod('.'value)* | nameType('.'value)* | '{' value(',' value)* '}';
term returns [String val] :  term BINARY_OPERATOR term | UNARY_OPERATOR term | term UNARY_OPERATOR | value;

declareVar returns [String val] : typeVar nameType ';' | MODIFIER* typeVar (nameType ASSIGN value)(','nameType ASSIGN value)*;
declareField returns [String val] : annotation* MODIFIER+ typeVar nameType ';' | MODIFIER* typeVar (nameType ASSIGN value)(','nameType ASSIGN value)* ';';

assignVar returns [String val] : nameType ASSIGN value;

callMethod returns [String val] : nameType'('')' | nameType'(' (nameType|callMethod|value)(','(nameType|callMethod|value))* ')';

function returns [String val] : annotation* MODIFIER* typeVar nameType'(' (arg(','arg)*)? ')' exeptions? '{' bodyFunction* returnFunction? '}';
annotation returns [String val] : AT callMethod | AT nameType;
arg returns [String val] : typeVar nameType;
exeptions returns [String val] : THROWS nameType(','nameType)*;
bodyFunction returns [String val] : (declareVar | assignVar | callMethod | function | ifStatement | forStatement | switchStatement)';';
returnFunction returns [String val] : RETURN value ';';

class returns [String val] : annotation? MODIFIER* CLASS nameType exstends? implements? '{' bodyClass* '}';
implements returns [String val] : IMPLEMENTS nameType(','nameType)*;
exstends returns [String val] : EXTENDS nameType;
constructor returns [String val] : annotation* MODIFIER? nameType'(' (arg(','arg)*)? ')' exeptions? '{' bodyFunction* '}';
bodyClass returns [String val] : constructor | declareField | callMethod | function | class | ifStatement | forStatement';';

castStatement returns [String val] : '('typeVar')' callMethod;

ifStatement returns [String val] : IF '(' (callMethod|term) ')' '{' bodyFunction '}' elseStatement? | IF'('callMethod')' bodyFunction elseStatement?;
elseStatement returns [String val] : ELSE '{' bodyFunction '}';

forStatement returns [String val] : (FOR'(' (declareVar | assignVar) ';' (callMethod|term) ';' (callMethod|term) ')') ('{' bodyFunction* '}' | bodyFunction?);

switchStatement returns [String val] : SWITCH '(' callMethod ')' '{' caseStatement* defaultStatement? '}';
caseStatement returns [String val] : CASE value ':' bodyFunction* (BREAK ';')?;
defaultStatement returns [String val] : DEFAULT ':' bodyFunction*;

BREAK : 'break' ;
CASE  : 'case';
DEFAULT  : 'default';
SWITCH : 'switch';
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

BINARY_OPERATOR : PLUS | MINUS | MULTIPLY | DIVIDE | MOD | EQUAL | NOT_EQUAL | LESS | LESS_OR_EQUAL | MORE_ | MORE_OR_EQUAL | AND | OR | NOT;

PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';
MOD : '%';
AND : '&&';
OR : '||';
NOT : '!';
EQUAL : '==';
NOT_EQUAL : '!=';
LESS : '<';
LESS_OR_EQUAL : '<=';
MORE_ : '>';
MORE_OR_EQUAL : '>=';

UNARY_OPERATOR : PLUS PLUS | MINUS MINUS | NOT;

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

INT_TYPE : 'int';
FLOAT_TYPE : 'float';
CHAR_TYPE : 'char';
BOOLEAN_TYPE : 'boolean';
VOID_TYPE : 'void';

NAME : [a-zA-Z_][a-zA-Z_0-9]*;
WS: [ \t\r\n]+ -> channel(HIDDEN);