package tarea6_2adrianruiz;

public abstract class Empleado extends Persona {

    private String numeroSeguridadSocial;
    private double salarioBase;

    public Empleado(String nombre, String apellido, String nif, String numeroSeguridadSocial, double salarioBase) {
        super(nombre, apellido, nif);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salarioBase = salarioBase;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Empleado(String nombre, String apellido, String nif) {
        super(nombre, apellido, nif);
    }

    public double calcularIRPF() {
        // instanceof significa que contiene Profesor
        if (this instanceof Profesor) {
            return ((Profesor) this).calcularIRPF();
        }

        /*
         * El Casting: ((Profesor)this)
         * Una vez que instanceof confirma que el objeto es un profesor, necesitas
         * "transformarlo" (hacer un cast) para poder acceder a los métodos específicos
         * de esa clase.
         * 
         * Imaginalo como si tuvieras una caja cerrada que dice "Empleado". instanceof
         * es mirar por la rendija y ver que dentro hay un profesor. El casting es abrir
         * la caja para poder usar las herramientas de profesor que hay dentro.
         */
        
        return 0;
    }


}
