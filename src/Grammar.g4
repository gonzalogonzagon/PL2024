grammar Grammar;

@parser::members {
    // Variables utilizadas en el analizador
    private Constantes constantes;

    // Declarar objeto
    private Codigo codigo;

    // Recibir como un parámetro del constructor el objeto real
    public GrammarParser ( TokenStream input, Codigo code, Constantes cons )  {
        this(input);
        codigo = code;
        constantes = cons;


    }
}

/*
 * Parser Rules
 */
//Parte del programa principal
program :
    defines partes <EOF>
    ;

defines:
    '#define' {Elemento elem = new Elemento();} IDENT
    {elem.setId($IDENT.text);} ctes {elem.setValor($ctes.s); constantes.anadirElemento(elem);} defines
    |
    ;
ctes returns [String s]:
    CONSTINT {$s = $CONSTINT.text;}
    | CONSTFLOAT {$s = $CONSTFLOAT.text;}
    | CONSTLIT {$s = $CONSTLIT.text;}
    ;
partes :
    part[codigo.addSubprograma(new Subprograma())] partes
    | part[codigo.addSubprograma(new Subprograma())]
    ;
part[Subprograma subp]:
    type {subp.getCabecera().setTipo($type.s);} restpart[subp]
    ;
restpart [Subprograma subp]:
    IDENT {subp.setNombre($IDENT.text);} '(' listparam[subp.getCabecera()] ')' blq[subp.getVariables()]
    | IDENT {subp.setNombre($IDENT.text);} '(' 'void' ')' blq[subp.getVariables()]
    ;
blq[Variables var] :
    '{' sentlist[var] '}'
    ;
// modificada --- original -> listparam : listparam ',' type IDENT | type IDENT; //!
listparam [Cabecera cab] :
    type IDENT {cab.addElemento(new Elemento($IDENT.text, $type.s));} listparamm[cab]
    ;
listparamm [Cabecera cab]:
    ',' type IDENT {cab.addElemento(new Elemento($IDENT.text, $type.s));} listparamm[cab]
    |
    ;
type returns [String s]:
    'void' {$s = "VOID";}
    | 'int' {$s = "INTEGER";}
    | 'float' {$s = "REAL";}
    ;

// modificada --- original -> sentlist : sentlist sent | sent;
sentlist[Variables var] :
    sent[var] sentlistt[var]
    ;
sentlistt[Variables var] :
    sent[var] sentlistt[var]
    |
    ;
sent[Variables var] :
    type lid[var, $type.s] ';'
    | IDENT '=' exp ';'
    | IDENT '(' lexp ')' ';'
    | IDENT '(' ')' ';'
    | 'return' exp ';'
    // (Parte opcional)
    | 'if' '(' lcond ')' blq[var] 'else' blq[var]
    | 'while' '(' lcond ')' blq[var]
    | 'do' blq[var] 'until' '(' lcond ')'
    | 'for' '(' IDENT '=' exp ';' lcond ';' IDENT '=' exp ')' blq[var]
    ;
// modificada --- original -> lid : IDENT | lid ',' IDENT;
lid[Variables var, String t] :
    IDENT {var.anadirElemento(new Elemento($IDENT.text, $t));} lidd[var, t]
    ;
lidd[Variables var, String t] :
    ',' IDENT {var.anadirElemento(new Elemento($IDENT.text, $t));} lidd[var, t]
    |
    ;
// modificada --- original -> lexp : exp | lexp ',' exp;
lexp returns [String s]:
    exp lexpp {$s = $exp.s + $lexpp.s;}
    ;
lexpp returns [String s]:
    ',' lexpp {$s = ", " + $lexpp.s;}
    | {$s = "";}
    ;
// modificada --- original -> exp : exp op exp | factor;
exp returns [String s]:
    factor expp {$s = $factor.s + " " + $expp.s;}
    ;
expp returns [String s]:
    op factor expp {$s = $op.s + " " + $factor.s + " " + $expp.s;}
    | {$s = "";}
    ;
op returns [String s]:
    '+' {$s = "+";}
    | '-' {$s = "-";}
    | '*' {$s = "*";}
    | '/' {$s = "div";}
    | '%' {$s = "mod";}
    ;
factor returns [String s]:
    IDENT '(' lexp ')' {$s = $IDENT.text + " (" + $lexp.s + ")";}
    | IDENT '(' ')' {$s = $IDENT.text + "()";}
    | '(' exp ')' {$s = "(" + $exp.s + ")";}
    | IDENT {$s = $IDENT.text;}
    | ctes {$s = $ctes.s ;}
    ;

// (Parte opcional)
lcond :
    cond2Types
    | cond2Types opl cond2Types lcondd
    ;
lcondd :
    opl cond2Types lcondd
    |
    ;
opl :
    '||'
    | '&&'
    ;
cond2Types :
    cond
    | '!' cond
    ;
cond :
    exp opr exp
    ;
opr :
    '=='
    | '<'
    | '>'
    | '>='
    | '<='
    ;

/*
 * Lexer Rules
 */

//Identificadores
IDENT:  ([a-zA-Z] | '$') ([a-zA-Z] | [0-9] | '$' | '_')*;

//Constantes numéricas
CONSTINT: DECIMAL_INTEGER_CONST | OCTAL_INTEGER_CONST | HEXA_INTEGER_CONST;

CONSTFLOAT: DECIMAL_REAL_CONST | OCTAL_REAL_CONST | HEXA_REAL_CONST;

DECIMAL_INTEGER_CONST: ('+'|'-')? DEC_DIGIT+;
OCTAL_INTEGER_CONST: ('+'|'-')? '0' OCT_DIGIT+;
HEXA_INTEGER_CONST: ('+'|'-')? '0x' HEX_DIGIT+;
DECIMAL_REAL_CONST: ('+'|'-')? DEC_DIGIT+ '.' DEC_DIGIT+;
OCTAL_REAL_CONST: ('+'|'-')? '0' OCT_DIGIT+ '.' OCT_DIGIT+;
HEXA_REAL_CONST: ('+'|'-')? '0x' HEX_DIGIT+ '.' HEX_DIGIT+;

//Constantes literales
CONSTLIT : '\'' ( ~'\'' | '\\' '\'' )* '\'' ;

//Comentarios
COMENTARIOBLOQUE: '/*' .*? '*/' ->  channel(HIDDEN);
COMENTARIOLINEA: '//' .*? NL    ->  channel(HIDDEN);

WS  :   [\t\r\u000C]    ->  skip;   //Tabulaciones, retorno de carro

NL  :   '\n'    ->  channel(HIDDEN);
B   :   ' '+    ->  skip;

IG  :   .   ->  skip;

fragment
DEC_DIGIT: [1-9]; //Digitos del 1 al 9
fragment
OCT_DIGIT: [0-9]; //Digitos del 0 al 9
fragment
HEX_DIGIT: [0-9]; //Digitos del 0 al 9


// /t tabulación