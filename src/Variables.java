import java.util.ArrayList;
import java.util.List;



public class Variables {
    private List<Elemento> datos;

    private List<Elemento> tipoInteger;

    private List<Elemento> tipoFloat;


    public Variables(){
        datos = new ArrayList<>();
        tipoInteger = new ArrayList<>();
        tipoFloat = new ArrayList<>();
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
            if(elemento.getTipo() == "Integer"){
                tipoInteger.add(elemento);
            }else{
                tipoFloat.add(elemento);
            }
        }
        if(!tipoInteger.isEmpty()){
            for (Elemento elemento : datos) {
                s += elemento.getId() + ", ";
            }
            s += ": INTEGER;\n";
        }
        if(!tipoFloat.isEmpty()){
            for (Elemento elemento : datos) {
                s += elemento.getId() + ", ";
            }
            s += ": REAL;\n";
        }
        return s;
    }
}
