package tarea6_2adrianruiz;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public final class Interino extends Profesor {

    private LocalDate fechaInicio;
    private LocalDate fechaCese;

    public Interino(String nombre, String apellido, String nif, String numeroSeguridadSocial, double salarioBase,
            Especialidades especialidades, double complementoSalarial, LocalDate fechaInicio, LocalDate fechaCese) {
        super(nombre, apellido, nif, numeroSeguridadSocial, salarioBase, especialidades, complementoSalarial);
        this.fechaInicio = fechaInicio;
        this.fechaCese = fechaInicio.plusMonths(6);
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaCese() {
        return fechaCese;
    }

    public void setFechaCese(LocalDate fechaCese) {
        this.fechaCese = fechaCese;
    }

    

    public Interino(String nombre, String apellido, String nif, String numeroSeguridadSocial, double salarioBase,
            Especialidades especialidades, double complementoSalarial) {
        super(nombre, apellido, nif, numeroSeguridadSocial, salarioBase, especialidades, complementoSalarial);
    }

    

    @Override
    public String toString() {
        return "Interino [fechaInicio=" + fechaInicio + ", fechaCese=" + fechaCese + "]";
    }

    public long calcularDiasTrabajados() {



        int diasTrabajados = (int) ChronoUnit.DAYS.between(getFechaInicio(), getFechaCese());

        return diasTrabajados;

        /*
         * ChronoUnit.DAYS.between(...)
         * Esta es la parte inteligente de Java.
         * 
         * No solo resta los números de los días.
         * 
         * Tiene en cuenta cuántos días tiene cada mes (28, 30 o 31) y si el año es
         * bisiesto.
         * 
         * Compara las dos fechas y cuenta cuántas veces ha pasado la medianoche entre
         * ellas.
         */

    }
}
