import org.antlr.v4.runtime.*;

public class ErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        CommonTokenStream tokens =
                (CommonTokenStream)recognizer.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];
        String expected = "";
        switch (errorLine.charAt(charPositionInLine)){
            case '(':
                expected = "No se encuentra expresion o fin de linea antes del parentesis de apertura ('(').";
                break;
            case '{':
                expected = "No se encuentra expresion o fin de linea antes de la llave de apertura ('{').";
                break;
            case '[':
                expected = "No se encuentra expresion o fin de linea antes del corchete de apertura ('[').";
                break;
            case ')':
                expected = "numero de argumentos invalido.";
                break;
            case '}':
                expected = "llave de cierre sin coincidencia.";
                break;
            case ']':
                expected = "corchete de cierre sin coincidencia.";
                break;
            case ',':
                expected = "coma inesperada.";
                break;
            case ';':
                expected = "falta punto y coma al final de la instruccion.";
                break;
            case '=':
                expected = "falta identificador.";
                break;
            case '+':
                expected = "No se encuentra identificador o valor numerico antes del operador ('+').";
                break;
            case '-':
                expected = "No se encuentra identificador o valor numerico antes del operador ('-').";
                break;
            case '*':
                expected = "No se encuentra identificador o valor numerico antes del operador ('*').";
                break;
            case '/':
                expected = "No se encuentra identificador o valor numerico antes del operador ('/').";
                break;
            case '%':
                expected = "No se encuentra identificador o valor numerico antes del operador ('%').";
                break;
            case '<':
                expected = "No se encuentra identificador o valor numerico antes del operador ('<').";
                break;
            case '>':
                expected = "No se encuentra identificador o valor numerico antes del operador ('>').";
                break;
            case '!':
                expected = "No se encuentra identificador o expresion booleana antes del operador ('!').";
                break;
            case '&':
                expected = "No se encuentra identificador o expresion booleana antes del operador ('&').";
                break;
            case '|':
                expected = "No se encuentra identificador o expresion booleana antes del operador ('|').";
                break;
            default:
                expected = msg;
        }
        System.err.println("linea "+line+":"+charPositionInLine+" "+expected);
        underlineError(recognizer,(Token)offendingSymbol,
                line, charPositionInLine);
    }
    protected void underlineError(Recognizer recognizer,
                                  Token offendingToken, int line,
                                  int charPositionInLine){
        CommonTokenStream tokens =
                (CommonTokenStream)recognizer.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];
        System.err.println(errorLine);
        for (int i=0; i<charPositionInLine; i++) System.err.print(" ");
        int start = offendingToken.getStartIndex();
        int stop = offendingToken.getStopIndex();
        if ( start>=0 && stop>=0 ) {
            for (int i=start; i<=stop; i++) System.err.print("^");
        }
        System.err.println();
    }
}

