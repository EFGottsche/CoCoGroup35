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

exp : x=IDENTIFIER              # Variable                // Variable
    | i=INT                     # Constant                // Constant
    | op='!' e=exp              # Not                // Not, the special not
    | e1=exp op='&&' e2=exp     # BoolAnd                // Boolean Expression
    | e1=exp op='||' e2=exp     # BoolOr                // Boolean Expression
    | e1=exp op='->' e2=exp     # Allocate                // Memory, flip flop = strandsandal
    | '(' e = exp ')'           # Parathesis ;              // Paranthesis


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
