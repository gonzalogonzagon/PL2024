import java.util.ArrayList;
import java.util.List;

public class Constantes { //Lista de constantes
    private List<Elemento> datos = new ArrayList<>();

    public void anadirElemento(Elemento elemento){
        datos.add(elemento);
    }

    public List<Elemento> getDatos() {
        return datos;
    }

    public String imprimirConstantes(){
        String s = "";
        if(!datos.isEmpty()){
            s += "const\n";
        }
        for(Elemento elemento: datos){
            s += "\t";
            s += elemento.getId() + "= " + elemento.getValor() + ";\n";
        }
        return s;
    }
}
