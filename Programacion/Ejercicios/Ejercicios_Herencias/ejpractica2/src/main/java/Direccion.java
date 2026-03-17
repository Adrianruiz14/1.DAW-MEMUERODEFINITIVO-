import tarea6_2adrianruiz.Academia;

public class Direccion  {

    private String calle;
    private String codPostal;
    private String poblacion;

    private Academia academia;

    public Direccion(String calle, String codPostal, String poblacion, Academia academia) {
        this.calle = calle;
        this.codPostal = codPostal;
        this.poblacion = poblacion;
        this.academia = academia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCodPostal() {
        return codPostal;
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

    public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }

}
