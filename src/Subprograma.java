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

    public Subprograma(){
        cabecera = new Cabecera();
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


    public String imprimirSubprograma() {
        String s="";
        if(cabecera.getTipo().equals("VOID")){
            s += "procedure " + getNombre();
        }else{
            s += "function " + getNombre();
        }
        if(!cabecera.getDatos().isEmpty()){
            if(cabecera.getTipo().equals("VOID")){
                s += "(" + cabecera.imprimirCabecera() + ")";
            }else{
                s += "(" + cabecera.imprimirCabecera() + "): ";
            }
        }
        if(cabecera.getTipo().equals("VOID")){
            s += ";\n";
        }else{
            s += cabecera.getTipo() + ";\n";
        }
        s += variables.imprimirVariables() + "\n";
        s+= bloque.imprimirBloque();
        s+= "end;\n";
        return s;
    }
}
