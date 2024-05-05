public class Subprograma {
    private Cabecera cabecera;
    private Bloque bloque;
    private String nombre;
    private Variables variables;

    public Subprograma(Bloque bloque, Cabecera cabecera, Variables variables) {
        this.cabecera = cabecera;
        this.bloque = bloque;
        this.variables = variables;
    }

    public Subprograma(){
        cabecera = new Cabecera();
        bloque = new Bloque();
        variables = new Variables();
    }

    public Cabecera getCabecera() {
        return cabecera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Variables getVariables() {
        return variables;
    }

    public String imprimirSubprograma() {
        String s="";
        if(cabecera.getTipo().equals("VOID")){
            s += "procedure " + getNombre();
        }else{
            s += "function " + getNombre();
        }
        if(!cabecera.getDatos().isEmpty()){
            s += "(" + cabecera.imprimirCabecera() + ")";
        }
        if(cabecera.getTipo().equals("VOID")){
            s += ";\n";
        }else{
            s += ": " + cabecera.getTipo() + ";\n";
        }
        s += variables.imprimirVariables() + "\n";
        s+= bloque.imprimirBloque();
        s+= "end;\n";
        return s;
    }
}
