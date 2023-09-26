grammar cc;

start   : (OPERATOR | NOT | IDENTIFIER | INT | FLOAT | WHITESPACE 
    | COMMENT | LONGCOMMENT | EQUALS 
    | ASSIGN | ALLOCATE | DOT | '.update' updatedecl | '.latches' latchdec1 | '.simulate' simdec1 | '.hardware' harddec1 
	| '.inputs' inpdec1 | '.outputs' outdec1) * EOF;

OPERATOR: '&&' | '||' ;
NOT: '!';
//COMMAND :  '.'IDENTIFIER ;

harddec1: hardware+ ;
hardware: IDENTIFIER+ ;

inpdec1: inputs+ ;
inputs: IDENTIFIER+ ; 

outdec1: outputs+ ;
outputs: IDENTIFIER+ ;

updatedecl: update+ ;
update: exp ASSIGN exp  ;

latchdec1: latches+ ;
latches: IDENTIFIER ALLOCATE exp ;

simdec1: simulate+ ;
simulate: exp ASSIGN INT ;


exp : IDENTIFIER
    | INT
    | exp OPERATOR exp
    | NOT exp
    | exp ALLOCATE exp
    | DOT IDENTIFIER ;

IDENTIFIER : [a-zA-Z] [a-zA-Z_0-9]* ;  // x17y
INT        : [0-9]+ ;
FLOAT      : [0-9]+ '.' [0-9]+ ;

EQUALS : '==' ;
ASSIGN : '=' ;
ALLOCATE : '->' ;
DOT : '.';
WHITESPACE : [ \t\n]+ -> skip;

