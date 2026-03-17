package tarea6_2adrianruiz;

public enum Especialidades {

    Profesor_Secundaria("Secundaria", 0.25),
    Profesor_Tecnico("Tecnico", 0.23);
    

    private final String nombre;
    private final double IRPF;

    // ¿Por que no me deja escribirlo a mano?
    Especialidades(String nombre, double IRPF) {
        this.nombre = nombre;
        this.IRPF = IRPF;
    }

    // ESCRIBE ESTO A MANO (Los Getters)
    public String getNombre() {
        return nombre;
    }

    public double getIRPF() {
        return IRPF;
    }

    /*Un Enum normal es solo una lista (ROJO, VERDE, AZUL). Pero el tuyo es un Enum inteligente.

    El Nombre y el IRPF: Hemos hecho que cada especialidad (como PROGRAMACION) lleve "mochila".

    El Constructor del Enum: Es el que permite que, cuando tú eliges PROGRAMACION, el programa ya sepa automáticamente que el nombre es "PROGRAMACIÓN" y el IRPF es 10.

    Seguridad: Al usar un Enum en el Profesor, evitas que alguien escriba una especialidad que no existe o un IRPF inventado. El valor está "anclado" a la especialidad. */






    







}
