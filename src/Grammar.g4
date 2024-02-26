grammar Grammar;

/*
 * Parser Rules
 */

//Parte del programa principal
program :
    (DECIMAL_INTEGER_CONST | OCTAL_INTEGER_CONST | HEXA_INTEGER_CONST
    | DECIMAL_REAL_CONST | OCTAL_REAL_CONST | HEXA_REAL_CONST
    | CONSTLIT
    | WS | B | NL)+
;

/*
 * Lexer Rules
 */

//Identificadores

//Constantes numéricas
DECIMAL_INTEGER_CONST: ('+'|'-')? DEC_DIGIT+;
OCTAL_INTEGER_CONST: ('+'|'-')? '0' OCT_DIGIT+;
HEXA_INTEGER_CONST: ('+'|'-')? '0x' DEC_DIGIT+;
DECIMAL_REAL_CONST: ('+'|'-')? DEC_DIGIT+ '.' DEC_DIGIT+;
OCTAL_REAL_CONST: ('+'|'-')? '0' OCT_DIGIT+ '.' DEC_DIGIT+;
HEXA_REAL_CONST: ('+'|'-')? '0x' DEC_DIGIT+ '.' DEC_DIGIT+;

//Constantes literales
CONSTLIT : '\'' ( ~'\'' | '\\' '\'' )* '\'' ;

//Comentarios

WS  :   [\t\r\u000C]    ->  skip;   //Tabulaciones, retorno de carro

NL  :   '\n';
B   :   ' '+;

//BACKSLASH   :   '\''    {System.out.print(getText().substring(1));};

IG  :   .   ->  skip;

fragment
DEC_DIGIT: [1-9]; //Digitos del 1 al 9
fragment
OCT_DIGIT: [0-9]; //Digitos del 0 al 9