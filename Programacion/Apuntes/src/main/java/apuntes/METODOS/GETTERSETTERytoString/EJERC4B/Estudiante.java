package apuntes.METODOS.GETTERSETTERytoString.EJERC4B;

public class Estudiante {

    /* En un nuevo proyecto, llamado tarea 4b+ tu nombre, dentro de un paquete llamado tarea4,
     * implementa una clase llamada Estudiante para gestionar la información de un alumno.

     * ​Atributos (Privados): ​nombre (String), ​idEstudiante (int),
     * ​notaMedia (double, valor entre 0.0 y 10.0) y ​curso (String).
     * ​Encapsulamiento: Proporciona métodos get para todos los atributos
     * y métodos set para notaMedia y curso.
     * ​Constructores: ​Un constructor que inicialice nombre, idEstudiante y curso.
     * La notaMedia debe inicializarse a 0.0.

     * Sobreescribe toString() para mostrar el nombre del estudiante, su ID,
     * el curso y su nota media actual. ​Ejemplo: "Estudiante: Ana Pérez (ID: 101),
     * Curso: 1ESO, Nota Media: 8.5."
     * Un método aprabado() que devuelva true si la notaMedia es mayor o igual a 5.0,
     * y false en caso contrario.

     * Añade una clase con el método main. Crea un par de objetos y
     * prueba los métodos de la clase Estudiante. */


        // Creamos los Atributos PRIVADOS
        private String nombre;
        private int idEstudiante;
        private double notaMedia; // 0.0 - 10.0
        private String curso;


        // Inicializamos los Atributos privados
        // Creamos constructor para inicializar los Atributos privados
        // El constructor siempre va a tener el nombre de la clase creada.
        public Estudiante(String nombre, int Estudiante, String curso){

            this.nombre = nombre;
            this.idEstudiante = Estudiante;
            this.curso = curso;
            this.notaMedia = 0.0; // Se inicializa en 0.0

        }


        // Metodos GET para todos los atributos y metodos SET para notaMedia y curso
        
        // Metodos GET
        // La estructura es: public + (valor del atributo) + (get+nombre del atributo)
        // y dentro un return con el nombre del atributo
        public String getNombre() {
        
            return nombre;
        
        }

        public int getidEstudiante() {
        
            return idEstudiante;
        
        }

        public double getNotaMedia() {
        
            return notaMedia;
        
        }

        public String getCurso() {
        
            return curso;
        
        }


        // Metodos SET
        // La estructura es: public + void + (set+nombre del atributo)
        // y dentro inicializamos el atributo

        public void setNotaMedia(double notaMedia) {
        
            if (notaMedia >= 0.0 && notaMedia <= 10.0) {
            
                this.notaMedia = notaMedia;

            } else {
            
                System.out.println("Error: la nota debe estar entre 0.0 y 10.0");
            
            }

        }

        public void setCurso(String curso) {
        
            this.curso = curso; 

        }


        // Un método aprobado() que devuelva true si la notaMedia es mayor o igual a 5.0, y false en caso contrario
        public boolean aprobado() {

            return this.notaMedia >= 5.0;
        
        }


        // MÉTODO toString
        @Override // Anotación informativa de sobrescritura de método
        public String toString() {

            return "Estudiante: " + nombre + " (ID: " + idEstudiante + "), Curso: "
            + curso + ", Nota Media: " + notaMedia + ".";

        }

}