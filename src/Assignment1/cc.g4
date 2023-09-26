grammar cc;

start   : (OPERATOR | NOT | IDENTIFIER | INT | FLOAT | WHITESPACE 
    | COMMENT | LONGCOMMENT | EQUALS 
    | ASSIGN | ALLOCATE | DOT | update | latch |  simulate | hardware
	| input | output) * EOF ;

OPERATOR: '&&' | '||' ;
NOT: '!';
//COMMAND :  '.'IDENTIFIER ;

harddec1: hardware+ ;
hardware: '.hardware' IDENTIFIER+ ;

input: '.inputs' inputs+ ;
inputs: IDENTIFIER+ ; 

output: '.outputs' outputs+ ;
outputs: IDENTIFIER+ ;

latch: '.latches' latches+ ;
latches: exp ALLOCATE exp ;

update: '.update' updates+;
updates: IDENTIFIER ASSIGN exp;

simulate: '.simulate' simulations+ ;
simulations: exp ASSIGN INT ;

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

COMMENT : '//' ~[\n]* -> skip;
LONGCOMMENT : '/*' (~[*] | '*'~[/])* '*/' -> skip;
