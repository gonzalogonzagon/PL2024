public class Sentencia {

    private String sent;
    private int indentacion;

    public Sentencia(String sent, int indentacion) {
        this.sent = sent;
        this.indentacion = indentacion;
    }

    public int getIndentacion() {
        return indentacion;
    }

    public void setIndentacion(int indentacion) {
        this.indentacion = indentacion;
    }

    public String imprimirSentencia(){
        return sent + ";\n";
    }
}
