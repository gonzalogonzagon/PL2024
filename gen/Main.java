import java.io.*;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Preparar el fichero de entrada para asignarlo al analizador léxico
            CharStream input = CharStreams.fromFileName(args[0]);
            // Crear el objeto correspondiente al analizador léxico con el fichero de
            // entrada
            GrammarLexer analex = new GrammarLexer(input);
            // Identificar al analizador léxico como fuente de tokens para el
            // sintactico
            CommonTokenStream tokens = new CommonTokenStream(analex);


            Codigo codigo = new Codigo();


            // Crear el objeto correspondiente al analizador sintáctico
            GrammarParser anasint = new GrammarParser(tokens, codigo, codigo.getConstantes(), new Bloque());
            anasint.removeErrorListeners();
            ErrorListener errorListener = new ErrorListener();
            DiagnosticErrorListener diagnostic = new DiagnosticErrorListener();
            anasint.addErrorListener(errorListener);
            anasint.addErrorListener(diagnostic);
            /*
            Si se quiere pasar al analizador algún objeto externo con el que trabajar,
            este deberá ser de una clase del mismo paquete
            Aquí se le llama "sintesis", pero puede ser cualquier nombre.
            NumbersParser anasint = new NumbersParser(tokens, new sintesis());
            */
            /*
            Comenzar el análisis llamando al axioma de la gramática
            Atención, sustituye "AxiomaDeLaGramatica" por el nombre del axioma de tu
            gramática
            */

            anasint.program();

            ////////////////////////////////////////////
            //String ruta = "../pracObligatoriaPL/"+args[0]+".html";

            String nombreArgs = args[0].substring(0, args[0].length()-2);

            String ruta = nombreArgs+".pas";
            FileWriter archivo = new FileWriter(ruta);

            BufferedWriter writer = new BufferedWriter(archivo);
            String s = codigo.imprimirCodigo(nombreArgs);


            writer.write(s);

            writer.close();
            archivo.close();
            ////////////////////////////////////////////

        } catch (org.antlr.v4.runtime.RecognitionException e) {
            //Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
            //Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
            //Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }
    }
}