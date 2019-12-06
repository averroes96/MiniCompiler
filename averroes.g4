/**
 * Define a grammar called averroes.g4
 */
grammar averroes;


// the general grammar syntax
program
 : PROGRAM ID block EOF
 ;

// block syntax
block
 : BEGIN statement* END
 ;
        

statement
 : assignment
 | if_statement
 | while_statement
 | output
 | OTHER {System.err.println("Unknown statement : " + $OTHER.text);}
 ;

assignment
 : ID ASSIGN expr SCOL
 ;

if_statement
 : IF condition_block (ELSE IF condition_block)* (ELSE statement_block)?
 ;

condition_block
 : expr statement_block
 ;

statement_block
 : OBRACE block CBRACE
 | statement
 ;

while_statement
 : WHILE expr statement_block
 ;

output
 : PRINT expr SCOL
 ;

expr
 : expr POW<assoc=right> expr           #powExpr
 | MINUS expr                           #unaryMinusExpr
 | NOT expr                             #notExpr
 | expr op=(MULT | DIV | MOD) expr      #multiplicationExpr
 | expr op=(PLUS | MINUS) expr          #additiveExpr
 | expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
 | expr op=(EQ | NEQ) expr              #equalityExpr
 | expr AND expr                        #andExpr
 | expr OR expr                         #orExpr
 | atom                                 #atomExpr
 ;

atom
 : OPAR expr CPAR #parExpr
 | (INT | FLOAT)  #numberAtom
 | (TRUE | FALSE) #booleanAtom
 | ID             #idAtom
 | TEXT         #stringAtom
 | NIL            #nilAtom
 ;

OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POW : '^';
NOT : '!';

SCOL : ';';
ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';

TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
PRINT : 'print';
PROGRAM : 'program';
DEC : 'declare';
BEGIN : 'begin';
END : 'end';

INTEGER : 'integer';
DOUBLE : 'double';
STRING : 'string';
CHAR : 'char';
CONST : 'constant';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]* 
 | '.' [0-9]+
 ;

TEXT
 : '"' (~["\r\n] | '""')* '"'
 ;

COMMENT
 : '#' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;

OTHER
 : . 
 ;