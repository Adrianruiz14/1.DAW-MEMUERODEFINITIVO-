package tarea6_2adrianruiz;

public class Direccion {

    private String calleNumero;
    private String codPostal;
    private String poblacion;


    public String getCalleNumero() {
        return calleNumero;
    }

    public void setCalleNumero(String calleNumero) {
        this.calleNumero = calleNumero;
    }

    public String getCodPostal() {
        return String.format("%05d", codPostal);
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public Direccion() {
    }

    

}
