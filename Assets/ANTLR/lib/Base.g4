lexer grammar Base;

FlOAT: INT '.' INT;
ONE: '1 ';
INT: [0-9]+;
ID: [a-zA-Z]+;
WS: [ \t] -> skip;
NL: [\r\n]+ -> skip;
