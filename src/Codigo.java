import java.util.ArrayList;
import java.util.List;

public class Codigo {

    List<Subprograma> lista_funciones = new ArrayList<>();
    private Variables variables;
    private Bloque bloque;
    private Constantes constantes;

    public Codigo() {
        variables = new Variables();
        bloque = new Bloque();
        constantes = new Constantes();
    }

    public Constantes getConstantes() {
        return constantes;
    }

    public void setConstantes(Constantes constantes) {
        this.constantes = constantes;
    }

    public Variables getVariables() {
        return variables;
    }

    

    public String imprimirCodigo(String nombreArchivo){
        //nombreArchivo es el nombre del programa (el nombre del archivo por defecto)
        String s = "";
        s += "program " + nombreArchivo + ";\n";
        s += constantes.imprimirConstantes();
        for(Subprograma funcion: lista_funciones){
            s += funcion.imprimirSubprograma();
            s += "\n";
        }
        s += variables.imprimirVariables() + "\n";
        s += bloque.imprimirBloque();
        s += "end.";
        return s;
    }
}
