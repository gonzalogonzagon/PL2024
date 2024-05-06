import java.util.ArrayList;
import java.util.List;

public class Codigo {

    List<Subprograma> lista_funciones = new ArrayList<>();
    Subprograma main;
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

    public Subprograma addSubprograma(Subprograma s){
        lista_funciones.add(s);
        return s;
    }


    public String imprimirCodigo(String nombreArchivo){
        //nombreArchivo es el nombre del programa (el nombre del archivo por defecto)
        String s = "";
        s += "program " + nombreArchivo + ";\n";
        s += constantes.imprimirConstantes();
        if(!constantes.getDatos().isEmpty()){
            s += "\n";
        }
        for(Subprograma funcion: lista_funciones){
            if(!funcion.getNombre().equals("main")){
                s += funcion.imprimirSubprograma();
                //s += "\n";
            }else{
                main = funcion;
            }
        }
        s += main.getVariables().imprimirVariables();
        s += "begin\n";
        s += main.getBloque().imprimirBloque();
        s += "end.";
        return s;
    }
}