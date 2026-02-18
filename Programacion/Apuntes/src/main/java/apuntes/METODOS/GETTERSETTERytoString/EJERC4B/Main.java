package apuntes.METODOS.GETTERSETTERytoString.EJERC4B;

public class Main {

    //DUDA: Los datos se pueden pedir al usuario y no ponerlos tu??

    public static void main(String[] args) {
        
    // Cuando no se especifica constructor en la clase 
    // se crea uno por defecto sin parametros 
    // Crear objetos de Estudiante
    Estudiante estudiante1 = new Estudiante("Ricardo Dominguez", 101, "1DAW");
    Estudiante estudiante2 = new Estudiante("Ingris ", 102, "1DAW");

    // Establecer notas
    estudiante1.setNotaMedia(10.0);
    estudiante2.setNotaMedia(0.1);

    // Imprimir información de los estudiantes
    System.out.println(estudiante1);
    System.out.println(estudiante2);

    // Comprobar si los estudiantes aprobaron
    System.out.println(estudiante1.getNombre() + " aprobado: " + estudiante1.aprobado());
    System.out.println(estudiante2.getNombre() + " aprobado: " + estudiante2.aprobado());
        
    System.out.println(estudiante1);
    System.out.println(estudiante1.aprobado());

    Estudiante[] lista = new Estudiante[2];
    lista[0] = estudiante1;
    lista[1] = new Estudiante("Ricardo Dominguez", 101, "1DAW");
    System.out.println("-----------");
    // Estudiante.aleatorio();
    for (Estudiante estudiante : lista) {

        System.out.println(estudiante);
        System.out.println(estudiante.aprobado());
        
    }

    }

}