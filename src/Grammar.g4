grammar Grammar;

@parser::members {
    // Variables utilizadas en el analizador
    private Constantes constantes;
    private Bloque bloqueAux;

    // Declarar objeto
    private Codigo codigo;

    // Recibir como un parámetro del constructor el objeto real
    public GrammarParser ( TokenStream input, Codigo code, Constantes cons, Bloque bloque)  {
        this(input);
        codigo = code;
        constantes = cons;
        bloqueAux = bloque;
    }

    private String getInd(int indentacion){
            String inde = "";
            for (int i = 0; i <= indentacion; i++) {
                inde += "\t";
            }
            return inde;
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
    IDENT {subp.setNombre($IDENT.text);} '(' listparam[subp.getCabecera()] ')' blq[subp.getVariables(), subp.getBloque(), subp.getNombre(), 0]
    | IDENT {subp.setNombre($IDENT.text);} '(' 'void' ')' blq[subp.getVariables(), subp.getBloque(), subp.getNombre(), 0]
    ;
blq[Variables var, Bloque b, String func, int ind] :
    '{' sentlist[var, b, func, ind] '}'
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
sentlist[Variables var, Bloque b, String func, int ind] :
    sent[var, b, func, ind] sentlistt[var, b, func, ind]
    ;
sentlistt[Variables var, Bloque b, String func, int ind] :
    sent[var, b, func, ind] sentlistt[var, b, func, ind]
    |
    ;
sent[Variables var, Bloque b, String func, int ind] :
    type lid[var, $type.s] ';'
    | IDENT '=' exp ';'{String sent = $IDENT.text + " := " + $exp.s + ";"; b.anadirSentencia(new Sentencia(sent, 0));}
    | IDENT '(' lexp ')' ';'{String sent = $IDENT.text + "(" + $lexp.s + ")" + ";"; b.anadirSentencia(new Sentencia(sent, 0));}
    | IDENT '(' ')' ';'{String sent = $IDENT.text + "()" + ";"; b.anadirSentencia(new Sentencia(sent, 0));}
    | 'return' exp ';'{String sent = $func + " := " + $exp.s + ";"; b.anadirSentencia(new Sentencia(sent, 0));}
    // (Parte opcional)
    | 'if' '(' lcond ')'
    {String sent = "if(" + $lcond.s + ")then"; b.anadirSentencia(new Sentencia(sent, ind)); b.anadirSentencia(new Sentencia("begin", ind));Bloque nuevoBl = new Bloque();}
    blq[var, nuevoBl, func, ind + 1] {sent = nuevoBl.imprimirBloque() + getInd(ind) + "end"; b.anadirSentencia(new Sentencia(sent, ind));}
    'else' {b.anadirSentencia(new Sentencia("else", ind)); b.anadirSentencia(new Sentencia("begin", ind)); nuevoBl = new Bloque();}
    blq[var, nuevoBl, func, ind + 1] {sent = nuevoBl.imprimirBloque() + getInd(ind) + "end;"; b.anadirSentencia(new Sentencia(sent, ind));}
    | 'while' '(' lcond ')'
    {String sent = "while(" + $lcond.s + ")do"; b.anadirSentencia(new Sentencia(sent, ind));
     b.anadirSentencia(new Sentencia("begin", ind)); Bloque nuevoBl = new Bloque();}
    blq[null, nuevoBl, null, ind + 1]
    {sent = nuevoBl.imprimirBloque() + getInd(ind) + "end;";
     b.anadirSentencia(new Sentencia(sent, ind));}
    | 'do' {String sent = "repeat"; b.anadirSentencia(new Sentencia(sent, ind)); Bloque nuevoBl = new Bloque();}
    blq[null, nuevoBl, null, ind + 1] {sent = nuevoBl.imprimirBloque();}
    'until' '(' lcond ')' {sent += + getInd(ind) + "until(" + $lcond.s + ");"; b.anadirSentencia(new Sentencia(sent, ind));}
    | 'for' '(' id1=IDENT '=' ex1=exp ';' lcond ';' id2=IDENT '=' ex2=exp ')' {
        String mod = $ex2.s;
        String[] partes = mod.split(" ");
        String sent;
        if(partes[2].equals("1")){ //Incremento o decremento unitario
            sent = "for " + $id1.text + " := " + $ex1.s;
            if(partes[1].equals("+")){
                sent += " to ";
            }else{
                sent += " downto ";
            }
            String[] condiciones = $lcond.s.split(" ");
            sent += condiciones[2];
            sent += " do";
            b.anadirSentencia(new Sentencia(sent, ind));
            b.anadirSentencia(new Sentencia("begin", ind));
        }else{
            sent = $id1.text + " := " + $ex1.s;
            b.anadirSentencia(new Sentencia(sent, ind));
            sent = "while(" + $lcond.s + ")do";
            b.anadirSentencia(new Sentencia(sent, ind));
            b.anadirSentencia(new Sentencia("begin", ind));
        }
        Bloque nuevoBl = new Bloque();
    }
    blq[var, nuevoBl, null, ind + 1] {
        if(!partes[2].equals("1")){
            nuevoBl.anadirSentencia(new Sentencia($id2.text + " := " + $ex2.s, ind));
        }
        sent = nuevoBl.imprimirBloque() + getInd(ind) + "end;";
        b.anadirSentencia(new Sentencia(sent, ind));
    }
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
    | c1=cond2Types {$s = $c1.s + " ";} opl c2=cond2Types lcondd {$s += $opl.s + " " + $c2.s + $lcondd.s;}
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
    e1=exp opr e2=exp {$s = $e1.s + " " + $opr.s + " " + $e2.s;}
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
OCTAL_INTEGER_CONST: '0' ('+'|'-')? OCT_DIGIT+;
HEXA_INTEGER_CONST: '0x' ('+'|'-')? HEX_DIGIT+;
DECIMAL_REAL_CONST: ('+'|'-')? DEC_DIGIT+ '.' DEC_DIGIT+;
OCTAL_REAL_CONST: '0' ('+'|'-')? OCT_DIGIT+ '.' OCT_DIGIT+;
HEXA_REAL_CONST: '0x' ('+'|'-')? HEX_DIGIT+ '.' HEX_DIGIT+;

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
DEC_DIGIT: [0-9]; //Digitos del 0 al 9
fragment
OCT_DIGIT: [0-7]; //Digitos del 0 al 7
fragment
HEX_DIGIT: [0-9] | [A-F]; //Digitos del 0 al 9 o letras de la A a la F


// /t tabulación
