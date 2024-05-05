import java.util.ArrayList;
import java.util.List;

public class Variables {
    private List<Elemento> datos;

    public Variables(){
        datos = new ArrayList<>();
    }

    public List<Elemento> getDatos() {
        return datos;
    }

    public void anadirElemento(Elemento elemento){
        datos.add(elemento);
    }

    public String imprimirVariables(){
        String s = "";
        if(!datos.isEmpty()){
            s += "var\n";
        }
        for(Elemento elemento: datos){
            s += "\t";
            s += elemento.getId() + ": " + elemento.getTipo() + ";\n";
        }
        return s;
    }
}
