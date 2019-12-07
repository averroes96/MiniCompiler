/**
 * Define a grammar called sj
 */
grammar sj;
// the general grammar syntax
program
 : libraries klass OBRACE varDec main_sj CBRACE EOF
 ;
 
main_sj
 : 'main_SJ' OBRACE block CBRACE
 ; 

// block syntax
block
 : statement*
 ;

libraries
 : IMPORT 'small_java.lang' SCOL libraries
 | IMPORT 'small_java.io' SCOL libraries
 |
 ;
 
 klass
 : 'class_SJ' ID        
 | modifier 'class_SJ' ID
 ;
 
 varDec
 : type ID SCOL varDec
 | type ID ',' variables SCOL varDec
 |
 ;
 
 variables
 : ID variables
 |
 ;
 
 type
 : INTEGER
 | DOUBLE
 | STRING
 | OTHER {System.err.println("Unknown type : " + $OTHER.text);}
 ;
 
 modifier
 : PROTECTED
 | PUBLIC
 ;
 
statement
 : assignment
 | if_statement
 | output
 | input
 | OTHER {System.err.println("Unknown statement : " + $OTHER.text);}
 ;

assignment
 : ID ASSIGN expr SCOL
 ;

if_statement
 : 'Si' condition_block ('Sinon' statement_block)*
 ;

condition_block
 : expr 'Alors' statement_block
 ;

statement_block
 : OBRACE block CBRACE
 | statement
 ;

output
 : 'Out_SJ' OPAR TEXT ',' ID CPAR SCOL
 | 'Out_SJ' OPAR TEXT CPAR SCOL
 ;
 
input
 : 'In_SJ' OPAR '"' format '",' ID OPAR SCOL
 ;
 
format
 : INT_SJ
 | FLOAT_SJ
 | STRING_SJ
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
ASSIGN : ':=';
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
IMPORT : 'import';
SJLANG : 'small_java.lang';
SJIO : 'small_java.io';
SJCLASS : 'class_SJ';
PROTECTED : 'protected';
PUBLIC : 'public';

INTEGER : 'int_sj';
DOUBLE : 'float_sj';
STRING : 'string_sj';
INT_SJ : '%d';
FLOAT_SJ : '%f';
STRING_SJ : '%s';
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

