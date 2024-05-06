import java.util.ArrayList;
import java.util.List;

public class Cabecera {
    private String tipo;
    private List<Elemento> datos;
    private List<Elemento> tipoInteger;

    private List<Elemento> tipoFloat;


    public Cabecera() {
        datos = new ArrayList<>();
        tipoInteger = new ArrayList<>();
        tipoFloat = new ArrayList<>();
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

    public String imprimirCabecera() {

        String s = "";

        for(Elemento elemento: datos){
            if(elemento.getTipo().equals("INTEGER")){
                tipoInteger.add(elemento);
            }else{
                tipoFloat.add(elemento);
            }
        }

        if(!tipoInteger.isEmpty()){
            for(int i = 0; i < tipoInteger.size() - 1; i++){
                s += tipoInteger.get(i).getId() + ", ";
            }
            s += tipoInteger.get(tipoInteger.size() - 1).getId();
            s += ": INTEGER";
        }
        if(!tipoFloat.isEmpty()){
            if (!tipoInteger.isEmpty()) s += "; ";
            for(int i = 0; i < tipoFloat.size() - 1; i++){
                s += tipoFloat.get(i).getId() + ", ";
            }
            s += tipoFloat.get(tipoFloat.size() - 1).getId();
            s += ": REAL";
        }
        return s;

    }
}
