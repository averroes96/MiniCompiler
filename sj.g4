/**
 * Define a grammar called sj
 */
grammar sj;
// the general grammar syntax
program
 : libraries* klass OBRACE varDec* main_sj CBRACE EOF
 ;
 
libraries
 : 'import' bibname SCOL
 ; 
 
main_sj
 : 'main_SJ' OBRACE block CBRACE
 ; 

// block syntax
block
 : statement*
 ;

 
bibname
 : IMPORTLANG
 | IMPORTIO
 ;
 
 
 klass
 : 'class_SJ' ID        
 | modifier 'class_SJ' ID
 ;
 
 varDec
 : type variables SCOL
 ;
 
 variables
 : ID
 | ID ',' variables
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
 : 'Si' condition_block ( els statement_block)*
 ;
 
els 
 : 'Sinon'
 ; 

condition_block
 : expr 'Alors' statement_block
 ;

statement_block
 : OBRACE block CBRACE
 | statement
 ;

output
 : 'Out_SJ' OPAR content  CPAR SCOL
 ;
 
content
 : TEXT
 | varText
 ;
 
varText
 : TEXT ',' (ID)+
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
 : expr op1 t
 | t
 ;
 
t 
 : t op2 endExpr 
 | t op3 endExpr
 | t op4 endExpr 
 | endExpr
 ;
 
op1 
 : PLUS | MINUS 
 ;
 
op2 
 : MULT | DIV | MOD
 ;
 
op3
 : LTEQ | GTEQ | LT | GT 
 ;
 
op4
 : EQ | NEQ
 ; 
 
endExpr 
 : ID 
 | '(' expr ')' 
 | terminal 
 ;
 
terminal 
 :ID
 |INT | FLOAT | TEXT 
 ; 

OR : '||';
AND : '&&';
EQ : '=';
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
IMPORTLANG : 'small_java.lang';
IMPORTIO : 'small_java.io';
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
 : [+-]*[0-9]+
 ;

FLOAT
 : [+-]*[0-9]+ '.' [0-9]* 
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

