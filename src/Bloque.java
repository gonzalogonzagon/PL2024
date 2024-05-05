import java.util.ArrayList;
import java.util.List;

public class Bloque {
    List<Sentencia> sentencias;

    public Bloque(){
        sentencias = new ArrayList<>();
    }

    public void eliminarSentencias(){
        sentencias = null;
    }

    public Sentencia anadirSentencia(Sentencia sentencia){
        sentencias.add(sentencia);
        return sentencia;
    }
    public String imprimirBloque(){
        String s = "";
        s += "begin\n";
        for(Sentencia sentencia: sentencias){
            s += "\t" + colocarIdentacion(sentencia) + sentencia.imprimirSentencia();
        }
        return s;
    }

    private String colocarIdentacion(Sentencia sentencia){
        String inde = "";
        for (int i = 0; i < sentencia.getIndentacion(); i++) {
            inde += "\t";
        }
        return inde;
    }
}
