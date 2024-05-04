import java.util.ArrayList;
import java.util.List;

public class Variables {
    private List<Elemento> datos = new ArrayList<>();

    public void anadirElemento(Elemento elemento){
        datos.add(elemento);
    }

    public String imprimirVariables(){
        String s = "";
        if(!datos.isEmpty()){
            s += "var\n";
        }
        for(Elemento elemento: datos){
            s += elemento.getId() + ": " + elemento.getTipo() + ";\n";
        }
        return s;
    }
}
