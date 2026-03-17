package tarea6_2adrianruiz;

import java.time.LocalDate;

public class Alumno extends Persona {

    private String numeroExpediente;
    private LocalDate fechaBaja;


    public Alumno(String nombre, String apellido, String nif, String numeroExpediente, LocalDate fechaBaja) {
        super(nombre, apellido, nif);
        this.numeroExpediente = numeroExpediente;
        this.fechaBaja = LocalDate.MAX; // Para establecer la fecha maxima que pueda el sistema 
    }


    public String getNumeroExpediente() {
        return numeroExpediente;
    }


    public void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }


    public LocalDate getFechaBaja() {
        return fechaBaja;
    }


    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }


    public Alumno(String nombre, String apellido, String nif) {
        super(nombre, apellido, nif);
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeroExpediente == null) ? 0 : numeroExpediente.hashCode());
        result = prime * result + ((fechaBaja == null) ? 0 : fechaBaja.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alumno other = (Alumno) obj;
        if (numeroExpediente == null) {
            if (other.numeroExpediente != null)
                return false;
        } else if (!numeroExpediente.equals(other.numeroExpediente))
            return false;
        if (fechaBaja == null) {
            if (other.fechaBaja != null)
                return false;
        } else if (!fechaBaja.equals(other.fechaBaja))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Alumno [numeroExpediente=" + numeroExpediente + ", fechaBaja=" + fechaBaja + "]";
    }

    

    

    

    





}
