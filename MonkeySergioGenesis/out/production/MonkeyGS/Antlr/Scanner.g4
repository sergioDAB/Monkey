lexer grammar Scanner;


LET : 'let';
RETURN : 'return';
INTEGER : DIGIT DIGIT*;
STRING : '"'( .*? '"' .*?'"' .*?|.*?)'"';
TRUE :'true';
FALSE :'false';
LEN :'len';
FIRST :'first';
LAST :'last';
REST :'rest';
PUSH :'push';
FN :'fn';
PUTS :'puts';
IF :'if';
ELSE :'else';
COMA :',';
PyCOMA : ';';
IG : '=';
PIZQ : '(';
PDER : ')';
PCI :'[';
PCD :']';
LLI :'{';
LLD :'}';
DOSPUN : ':';
SUM : '+';
SUB : '-';
MUL : '*';
DIV : '/';
MAY :'>';
MEN :'<';
MAYI :'>=';
MENI :'<=';
IGIG : '==';


// Espaciado , skip: lo que hace es dejarlo pasar
WS : [ \t\n\r]+ -> skip;

//  Identificador



 fragment LETTER: 'a'..'z' | 'A'..'Z' | '_'; // se toma como si fuera un fragmento.

 fragment DIGIT : '0'..'9';

ID: LETTER (LETTER|DIGIT)*;



LINE_COMMENT     : '//'.*?'\r'?'\n' -> skip ; //    comentador, lo que sea y termina en un salto de linea

SPECIAL_COMMENT  : '/*'( SPECIAL_COMMENT | . )*?'*/' -> skip; // comentador, lo que sea, puede ser otro comentario, y cierra en un comentador.
// la llamda recursiva hace que el de adentro tenga que tener un incio y un fin, de lo contrario el ultimo queda fuera.






