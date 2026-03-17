package tarea6_2adrianruiz;

public abstract class Profesor extends Empleado {

    private Especialidades especialidades;
    private double complementoSalarial;


    public Profesor(String nombre, String apellido, String nif, String numeroSeguridadSocial, double salarioBase,
            Especialidades especialidades, double complementoSalarial) {
        super(nombre, apellido, nif, numeroSeguridadSocial, salarioBase);
        this.especialidades = especialidades;
        this.complementoSalarial = complementoSalarial;
    }

    // No puedo crear constructor vacio aqui

    public Especialidades getEspecialidades() {
        return especialidades;
    }


    public void setEspecialidades(Especialidades especialidades) {
        this.especialidades = especialidades;
    }


    public double getComplementoSalarial() {
        return complementoSalarial;
    }


    public void setComplementoSalarial(double complementoSalarial) {
        this.complementoSalarial = complementoSalarial;
    }



    

    

    





    




}
