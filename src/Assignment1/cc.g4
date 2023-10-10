grammar cc;

start   : h=hardware i=input o=output l=latch u=update s=simulate EOF ;

hardware: '.hardware' hardw=IDENTIFIER ;

input: '.inputs' ins+=IDENTIFIER+ ; //+= means a list of inputs

output: '.outputs' outs+=IDENTIFIER+ ; //+= means a list of outputs

latch: '.latches' lats+=latches+ ; //+= means a list of latches
latches: exp '->' exp ;

update: '.update' ups+=updates+;
updates: IDENTIFIER '=' exp;

simulate: '.simulate' sims+=simulations+ ;
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
