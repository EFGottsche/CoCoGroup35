grammar cc;

start   : (OPERATOR | NOT | IDENTIFIER | INT | FLOAT | WHITESPACE 
    | COMMENT | LONGCOMMENT | EQUALS 
    | ASSIGN | ALLOCATE | DOT | '.update' updatedecl | '.latches' latchdec1 | '.simulate' stimdec1) * EOF;

OPERATOR: '&&' | '||' ;
NOT: '!';
//COMMAND :  '.'IDENTIFIER ;

updatedecl: update+ ;
update: IDENTIFIER '=' exp ;

latchdec1: latches+ ;
latches: IDENTIFIER ALLOCATE IDENTIFIER ;

stimdec1: simulate+ ;
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
