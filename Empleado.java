abstract class Empleado{
   private String RFC;
   private String Apellidos;
   private String nombres;
public Empleado(String rFC, String apellidos, String nombres) {
    RFC = rFC;
    this.Apellidos = apellidos;
    this.nombres = nombres;
    
}

    public String getRFC() {
    return RFC;
}

public void setRFC(String rFC) {
    RFC = rFC;
}

public String getApellidos() {
    return Apellidos;
}

public void setApellidos(String apellidos) {
    this.Apellidos = apellidos;
}

public String getNombres() {
    return nombres;
}

public void setNombres(String nombres) {
    this.nombres = nombres;
}

    public abstract double ingresos();
    public abstract double calcularBonificacion();
    public abstract double calcularDescuento();
    public abstract double calcularSueldoNeto();

    public void mostrarInformacion() {
        System.out.println("RFC: " + RFC);
        System.out.println("Apellidos: " + Apellidos);
        System.out.println("Nombres: " + nombres);
    }
}

 