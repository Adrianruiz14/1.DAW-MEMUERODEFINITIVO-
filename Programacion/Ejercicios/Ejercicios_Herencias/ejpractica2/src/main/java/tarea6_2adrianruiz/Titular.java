package tarea6_2adrianruiz;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public final class Titular extends Profesor {

    private LocalDate fechaJubilacion;



    public Titular(String nombre, String apellido, String nif, String numeroSeguridadSocial, double salarioBase,
            Especialidades especialidades, double complementoSalarial, LocalDate fechaJubilacion) {
        super(nombre, apellido, nif, numeroSeguridadSocial, salarioBase, especialidades, complementoSalarial);
        this.fechaJubilacion = fechaJubilacion;
    }

    public LocalDate getFechaJubilacion() {
        return fechaJubilacion;
    }

    public void setFechaJubilacion(LocalDate fechaJubilacion) {
        this.fechaJubilacion = fechaJubilacion;
    }

    

    public Titular(String nombre, String apellido, String nif, String numeroSeguridadSocial, double salarioBase,
            Especialidades especialidades, double complementoSalarial) {
        super(nombre, apellido, nif, numeroSeguridadSocial, salarioBase, especialidades, complementoSalarial);
    }

    

    @Override
    public String toString() {
        return "Titular [fechaJubilacion=" + fechaJubilacion + "]";
    }

    public boolean pedirProrroga(int meses){

        String amplicacion_Jubilacion_String = JOptionPane.showInputDialog
        ("Introduzca el número de meses que quieres amplicar la jubilación");

        int amplicacion_Jubilacion = Integer.parseInt(amplicacion_Jubilacion_String);

        LocalDate limite = LocalDate.of(2030, 1, 1);

        LocalDate fecha_Ampliada =  getFechaJubilacion().plusMonths(amplicacion_Jubilacion);

        if (fecha_Ampliada.isAfter(limite)) { return false;
            
        } else return true;
        

    }


}
