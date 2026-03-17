package tarea6_2adrianruiz;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Academia {

    private String nombre;
    private Direccion direccion_Academia;
    private ArrayList<Alumno> listaAlumnos;
    private ArrayList<Empleado> listaempleados;

    public Academia(String nombre, Direccion direccion_Academia, ArrayList<Alumno> listaAlumnos,
            ArrayList<Empleado> empleado) {
        this.nombre = nombre;
        this.direccion_Academia = direccion_Academia;
        this.listaAlumnos = listaAlumnos;
        this.listaempleados = empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion_Academia() {
        return direccion_Academia;
    }

    public void setDireccion_Academia(Direccion direccion_Academia) {
        this.direccion_Academia = direccion_Academia;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public ArrayList<Empleado> getEmpleado() {
        return listaempleados;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.listaempleados = empleado;
    }

    @Override
    public String toString() {
        return "Academia [nombre=" + nombre + ", direccion_Academia=" + direccion_Academia + ", listaAlumnos="
                + listaAlumnos + ", empleado=" + listaempleados + "]";
    }

    public void contratarEmpleado(Empleado empleado) {

        LocalDate fechaJubilacion = LocalDate.now().plusYears(40);

        String nombre_Empleado = JOptionPane.showInputDialog("Introduzca su nombre");
        String apellido_Empleado = JOptionPane.showInputDialog("Introduzca su primer apellido");
        String nif_Empleado = JOptionPane.showInputDialog("Introduzca su nif");
        String tipo = JOptionPane.showInputDialog("¿Es titular o interino? (T/I)");
        double salarioBase = 1900.25;
        double complemento_Salarial = 200;

        Especialidades[] opciones = Especialidades.values();

        /*
         * ¿Qué hace?: Mira tu Enum Especialidades y mete Profesor_Secundaria y
         * Profesor_Tecnico dentro de un Array (una lista fija).
         * 
         * Resultado: Ahora la variable opciones tiene todos los valores posibles de tu
         * Enum.
         */

        Especialidades especialidadSeleccionada = (Especialidades) JOptionPane.showInputDialog(
                null, // 1. Componente padre (null = centrado en pantalla)
                "Seleccione la especialidad:", // 2. El mensaje que lee el usuario
                "Título de la ventana", // 3. El título de arriba (tú pusiste null, saldría vacío)
                JOptionPane.QUESTION_MESSAGE, // 4. El icono (un interrogante azul)
                null, // 5. Un icono personalizado (null = el de defecto)
                opciones, // 6. ¡LA CLAVE! El array de opciones (crea el desplegable)
                opciones[0] // 7. La opción seleccionada por defecto (la primera)
        );

        /*
         * El problema: JOptionPane es genérico, puede devolver un String, un número o
         * un objeto. Por eso, siempre devuelve un tipo Object.
         * 
         * La solución: Como tú sabes que lo que hay dentro de ese desplegable son tus
         * Especialidades, le pones el nombre entre paréntesis delante para decirle a
         * Java:
         * "Confía en mí, lo que el usuario elija conviértelo al tipo Especialidades".
         */

        if (tipo != null && tipo.trim().equalsIgnoreCase("T")) {

            Empleado empleado00 = new Titular(nombre_Empleado, apellido_Empleado, nif_Empleado,
                    nif_Empleado, salarioBase, especialidadSeleccionada, complemento_Salarial, fechaJubilacion);
            listaempleados.add(empleado00);
        }

        /*
         * El método .trim() es como una "peluquería" para tus cadenas de texto
         * (Strings). Su función es eliminar todos los espacios en blanco que sobran al
         * principio y al final de lo que el usuario haya escrito.
         * 
         * ¿Para qué sirve exactamente?
         * Cuando usas JOptionPane, el usuario es impredecible. Imagina que te pide:
         * "¿Es titular o interino? (T/I)".
         * 
         * El usuario escribe: " T " (un espacio, la T y otro espacio).
         * 
         * Sin .trim(), Java comparará " T " con "T" y dirá que no son iguales.
         * 
         * Con .trim(), Java limpia los espacios y se queda solo con "T"
         * 
         * El trim() viene de la propia clase de String, no hace falta crearlo
         */
    }

    public void matricularAlumno(Alumno alumno) {

            String nombre = JOptionPane.showInputDialog("Introduzca su nombre");
            String apellido = JOptionPane.showInputDialog("Introduzca su primer apellido");
            String nif = JOptionPane.showInputDialog("Introduzca su nif");
            String expediente = JOptionPane.showInputDialog("Introduzca su número de expediente");
            LocalDate fechaBajaAlumno = LocalDate.now().plusYears(1);
            alumno = new Alumno(nombre, apellido, nif, expediente, fechaBajaAlumno);
        
            listaAlumnos.add(alumno);
        
    }

}
