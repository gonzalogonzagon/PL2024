public class Subprograma {
    private Cabecera cabecera;
    private Bloque bloque;
    private String nombre;
    private Variables variables;

    public Subprograma(Bloque bloque, Cabecera cabecera, Variables variables) {
        this.bloque = bloque;
        this.cabecera = cabecera;
        this.variables = variables;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String imprimirSubprograma() {
        String s="";
        s+= "function " + getNombre() + "(" + cabecera.imprimirCabecera() + "): " + cabecera.getTipo() + ";\n";
        s += variables.imprimirVariables() + "\n";
        s+= bloque.imprimirBloque();
        s+= "end;\n";
        return s;
    }
}
