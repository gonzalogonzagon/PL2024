public class Elemento {

    private String id;
    private String tipo;
    private String valor;

    public Elemento(String id, String tipo, String valor) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    public Elemento(String id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Elemento() {

    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
