/**
 * Define a grammar called sj
 */
grammar sj;
// the general grammar syntax
program
 : libraries* klass 
 	OBRACE 
 		varDec*  main_sj 
 	CBRACE 
 	EOF
 ;
 
libraries
 : IMPORT bibname SCOL
 ; 
 
main_sj
 : SJMAIN OBRACE block CBRACE
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
 : SJCLASS ID        
 | modifier SJCLASS ID
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
 |
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
 : IF condition_block ( els statement_block)*
 ;
 
els 
 : ELSE
 ; 

condition_block
 : OPAR comparaison CPAR 'Alors' statement_block
 ;
 
comparaison
 : expr operator expr
 ;
 
operator
 : LTEQ | GTEQ | LT | GT | EQ | NEQ | NOT | OR | AND
 ;    

statement_block
 : OBRACE block CBRACE
 | statement
 ;

output
 : OUTSJ OPAR content  CPAR SCOL
 ;
 
content
 : TEXT
 | varText
 ;
 
varText
 : TEXT ',' (ID)+
 ; 
  
 
input
 : INSJ OPAR '"' format '",' ID OPAR SCOL
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
 | endExpr
 ;
 
op1 
 : PLUS | MINUS 
 ;
 
op2 
 : MULT | DIV | MOD
 ; 
 
endExpr 
 : ID 
 | '(' expr ')' 
 | terminal
 | 
 ;
 
terminal 
 :ID
 |INT | FLOAT | TEXT 
 ; 

OR : '|';
AND : '&';
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

IF : 'Si';
ELSE : 'Sinon';
IMPORT : 'import';
IMPORTLANG : 'small_java.lang';
IMPORTIO : 'small_java.io';
SJCLASS : 'class_SJ';
SJMAIN : 'main_SJ' ;
INSJ : 'In_SJ' ;
OUTSJ : 'Out_SJ' ;
PROTECTED : 'protected';
PUBLIC : 'public';

INTEGER : 'int_sj';
DOUBLE : 'float_sj';
STRING : 'string_sj';
INT_SJ : '%d';
FLOAT_SJ : '%f';
STRING_SJ : '%s';

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

