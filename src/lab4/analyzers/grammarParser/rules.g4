grammar rules;

@header {import lab4.analyzers.grammar.Grammar;}

start[Grammar x] returns [Grammar val] : grammarName[$x] (members[$x])? (nodeContext[$x])? nonTerminals[$x] terminals[$x] EOF;

grammarName[Grammar x] returns [Grammar val] : GRAMMAR_NAME;

members[Grammar x] returns [Grammar val] : MEMBER CODE ;
nodeContext[Grammar x] returns [Grammar val] : NODE_CONTEXT '(' RETURN_TYPE RETURN_VALUE ')';

nonTerminals[Grammar x] returns [Grammar val] : (nonTerminal[$x])+;
nonTerminal[Grammar x] returns [Grammar val] : ruleName[$x] ':' right[$x] ('|' right[$x])* ';';

right[Grammar x] returns [Grammar val] : ((ruleName[$x] | TOKEN_NAME) semantics[$x]?)+;

ruleName[Grammar x] returns [Grammar val] : RULE_NAME ARG* ;
semantics[Grammar x] returns [Grammar val] : SEMANTIC_RULE;

terminals[Grammar x] returns [Grammar val] : (terminal[$x])+;
terminal[Grammar x] returns [Grammar val] : TOKEN_NAME ':' LITERAL ('|' LITERAL)* ';';

GRAMMAR_NAME : 'grammar' (.)+? ';' ;
MEMBER : '@member';
NODE_CONTEXT : '@node';
RETURN_TYPE : 'return' (.)+? ';';
RETURN_VALUE : 'default' (.)+? ';';
TOKEN_NAME : [A-Z][A-Z0-9_]+;
RULE_NAME : [a-z][a-zA-Z0-9_]*;
ARG : '[' (.)+? ']';
CODE : '(' [a-zA-Z0-9_]+ '=' [a-zA-Z0-9_]+ ')';
SEMANTIC_RULE : '{' (.)+? '}';

LITERAL : '\'' ('\'\'' | ~ ('\''))* '\'';

WS : [ \n\t\r] -> skip;