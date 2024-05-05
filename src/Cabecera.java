import java.util.ArrayList;
import java.util.List;

public class Cabecera {
    private String tipo;
    private List<Elemento> datos;



    public Cabecera() {
        datos = new ArrayList<>();
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

    public String imprimirCabecera(){
        String s = "";
        for (int i = 0; i < datos.size(); i++) {
            s += datos.get(i).getId() + ": " + datos.get(i).getTipo() ;
            if(datos.size() > 1 && (i != datos.size() - 1)){
                s += "; ";
            }
        }
        return s;
    }
}
