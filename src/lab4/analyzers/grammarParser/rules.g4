grammar rules;

@header {import lab4.analyzers.grammar.Grammar;}

start[Grammar x] returns [Grammar val] : (members[$x])? (nodeContext[$x])? nonTerminals[$x] terminals[$x] EOF;

members[Grammar x] returns [Grammar val] : MEMBER CODE ;
nodeContext[Grammar x] returns [Grammar val] : NODE_CONTEXT CODE;

nonTerminals[Grammar x] returns [Grammar val] : (nonTerminal[$x])+;
nonTerminal[Grammar x] returns [Grammar val] : RULE_NAME ':' right[$x] ('|' right[$x])* ';';

right[Grammar x] returns [Grammar val] : (RULE_NAME | TOKEN_NAME | SEMANTIC_RULE)+;

terminals[Grammar x] returns [Grammar val] : (terminal[$x])+;
terminal[Grammar x] returns [Grammar val] : TOKEN_NAME ':' LITERAL ('|' LITERAL)* ';';

MEMBER : '@member';
NODE_CONTEXT : '@node';
TOKEN_NAME : [A-Z][A-Z0-9_]+;
RULE_NAME : [a-z][a-zA-Z0-9_]*;
CODE : '{' (~[$])+ '}';
SEMANTIC_RULE : '{' (.)+? '}';

LITERAL : '\'' ('\'\'' | ~ ('\''))* '\'';

WS : [ \n\t\r] -> skip;