grammar Grammar;

@parser::members {
    // Variables utilizadas en el analizador
    private Constantes constantes;
    private Bloque bloqueAux;
    private int inden = 0;

    // Declarar objeto
    private Codigo codigo;

    // Recibir como un parámetro del constructor el objeto real
    public GrammarParser ( TokenStream input, Codigo code, Constantes cons, Bloque bloque)  {
        this(input);
        codigo = code;
        constantes = cons;
        bloqueAux = bloque;
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
    IDENT {subp.setNombre($IDENT.text);} '(' listparam[subp.getCabecera()] ')' blq[subp.getVariables(), subp.getBloque(), subp.getNombre()]
    | IDENT {subp.setNombre($IDENT.text);} '(' 'void' ')' blq[subp.getVariables(), subp.getBloque(), subp.getNombre()]
    ;
blq[Variables var, Bloque b, String func] :
    '{' sentlist[var, b, func] '}'
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
sentlist[Variables var, Bloque b, String func] :
    sent[var, b, func] sentlistt[var, b, func]
    ;
sentlistt[Variables var, Bloque b, String func] :
    sent[var, b, func] sentlistt[var, b, func]
    |
    ;
sent[Variables var, Bloque b, String func] :
    type lid[var, $type.s] ';'
    | IDENT '=' exp ';'{String sent = $IDENT.text + " := " + $exp.s + ";"; b.anadirSentencia(new Sentencia(sent, 0));}
    | IDENT '(' lexp ')' ';'{String sent = $IDENT.text + "(" + $lexp.s + ")" + ";"; b.anadirSentencia(new Sentencia(sent, 0));}
    | IDENT '(' ')' ';'{String sent = $IDENT.text + "()" + ";"; b.anadirSentencia(new Sentencia(sent, 0));}
    | 'return' exp ';'{String sent = $func + " := " + $exp.s + ";"; b.anadirSentencia(new Sentencia(sent, 0));}
    // (Parte opcional)
    | {bloqueAux.resetSentencias();} 'if' '(' lcond ')'
    {String sent = "if(" + $lcond.s + ") then"; b.anadirSentencia(new Sentencia(sent, inden)); b.anadirSentencia(new Sentencia("begin", inden)); inden += 1;}
    blq[var, bloqueAux, null] {sent = bloqueAux.imprimirBloque(); b.anadirSentencia(new Sentencia(sent, inden)); inden -= 1; b.anadirSentencia(new Sentencia("end", 0));}
    {bloqueAux.resetSentencias();} 'else' {b.anadirSentencia(new Sentencia("else", inden)); b.anadirSentencia(new Sentencia("begin", inden)); inden += 1;}
    blq[var, bloqueAux, null] {
    sent = bloqueAux.imprimirBloque(); b.anadirSentencia(new Sentencia(sent, inden)); inden -= 1; b.anadirSentencia(new Sentencia("end;", inden));}
    | 'while' '(' lcond ')' blq[null, new Bloque(), null]
    | 'do' blq[null, new Bloque(), null] 'until' '(' lcond ')'
    | 'for' '(' IDENT '=' exp ';' lcond ';' IDENT '=' exp ')' blq[null, new Bloque(), null]
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
    factor expp {$s = $factor.s + $expp.s;}
    ;
expp returns [String s]:
    op factor expp {$s = " " + $op.s + " " + $factor.s + $expp.s;}
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
lcond returns [String s]:
    cond2Types {$s = $cond2Types.s;}
    | cond2Types {$s = $cond2Types.s + " ";} opl cond2Types lcondd {$s += $opl.s + " " + $cond2Types.s + $lcondd.s;}
    ;
lcondd returns [String s]:
    opl cond2Types lcondd {$s = " " + $opl.s + " " + $cond2Types.s + $lcondd.s;}
    |
    ;
opl returns [String s]:
    '||' {$s = "OR";}
    | '&&' {$s = "AND";}
    ;
cond2Types returns [String s]:
    cond {$s = $cond.s;}
    | '!' cond {$s = "NOT (" + $cond.s + ")";}
    ;
cond returns [String s]:
    exp opr exp {$s = $exp.s + " " + $opr.s + " " + $exp.s;}
    ;
opr returns [String s]:
    '==' {$s = "=";}
    | '<' {$s = "<";}
    | '>' {$s = ">";}
    | '>=' {$s = ">=";}
    | '<=' {$s = "<=";}
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