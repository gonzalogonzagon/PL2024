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
            if(elemento.getTipo().equals("INTEGER")){
                tipoInteger.add(elemento);
            }else{
                tipoFloat.add(elemento);
            }
        }
        if(!tipoInteger.isEmpty()){
            s += "\t";
            for(int i = 0; i < tipoInteger.size() - 1; i++){
                s += tipoInteger.get(i).getId() + ", ";
            }
            s += tipoInteger.get(tipoInteger.size() - 1);
            s += ": INTEGER;\n";
        }
        if(!tipoFloat.isEmpty()){
            s += "\t";
            for(int i = 0; i < tipoFloat.size() - 1; i++){
                s += tipoFloat.get(i).getId() + ", ";
            }
            s += tipoFloat.get(tipoFloat.size() - 1);
            s += ": REAL;\n";
        }
        return s;
    }
}
