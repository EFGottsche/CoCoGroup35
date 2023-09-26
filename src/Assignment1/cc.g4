grammar cc;

start   : (IDENTIFIER | INT | FLOAT | WHITESPACE | COMMENT | LONGCOMMENT | EQUALS
    | update | latch |  simulate | hardware | input | output) * EOF ;

hardware: '.hardware' IDENTIFIER+ ;

input: '.inputs' IDENTIFIER+ ;

output: '.outputs' IDENTIFIER+ ;

latch: '.latches' latches+ ;
latches: exp '->' exp ;

update: '.update' updates+;
updates: IDENTIFIER '=' exp;

simulate: '.simulate' simulations+ ;
simulations: exp '=' INT ;

exp : x=IDENTIFIER                              // Variable
    | i=INT                                     // Constant
    | op='!' e=exp                              // Not, the special not
    | e1=exp op='&&' e2=exp                     // Boolean Expression
    | e1=exp op='||' e2=exp                     // Boolean Expression
    | e1=exp op='->' e2=exp                     // Memory, flip flop = strandsandal
    | '(' e = exp ')' ;                         // Paranthesis


IDENTIFIER : [a-zA-Z] [a-zA-Z_0-9^ ]* ;
INT        : [0-9]+ ;
FLOAT      : [0-9]+ '.' [0-9]+ ;

EQUALS : '==' ;
//ASSIGN : '=' ;
//ALLOCATE : '->' ;
//DOT : '.';

WHITESPACE : [ \t\n]+ -> skip;

COMMENT : '//' ~[\n]* -> skip;
LONGCOMMENT : '/*' (~[*] | '*'~[/])* '*/' -> skip;
