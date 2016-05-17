grammar langageCours ;


//Définition des types

boolean_type
: ('true'|'false');


integer_number
:   DIGIT+;

fragment
DIGIT   :   ('0'..'9');

fragment
VARIABLE : ('a'..'z')('a'..'z'|'0'..'9')*;

affectation:
VARIABLE '=' integer_number|boolean_type;

WS : [ \t\r\n]+ -> skip ;
