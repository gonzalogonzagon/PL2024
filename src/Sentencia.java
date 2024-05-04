public class Sentencia {

    private String sent;
    private int indentacion;

    public int getIndentacion() {
        return indentacion;
    }

    public void setIndentacion(int indentacion) {
        this.indentacion = indentacion;
    }

    public Sentencia(String sent) {
        this.sent = sent;
    }

    public String imprimirSentencia(){
        return sent + ";\n";
    }
}
