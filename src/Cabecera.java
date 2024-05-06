import java.util.ArrayList;
import java.util.List;

public class Cabecera {
    private String tipo;
    private List<Elemento> datos;
    private List<Elemento> listaInteger;
    private List<Elemento> listaFloat;


    public Cabecera() {
        datos = new ArrayList<>();
        listaInteger = new ArrayList<>();
        listaFloat = new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Elemento> getDatos() {
        return datos;
    }

    public Elemento addElemento(Elemento e){
        datos.add(e);
        return e;
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
