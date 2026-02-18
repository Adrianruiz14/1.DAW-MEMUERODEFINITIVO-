package apuntes.UT02.ESTRUCTURASyELEMENTOS.EJERCICIOStema2;

import java.util.Scanner;

public class Ejercicio1notamedia {
    
    /* Leer 5 notas por teclado, calcular media y mostrar. */

    public static void main(String[] args) {

        // Inicializo el scanner
        Scanner teclado = new Scanner(System.in);       // = CLASE
    
        // Saco por pantalla que introduzca el usuario sus 5 notas
        System.out.println("Introduce tus 5 notas: ");  // Tengo que intentar guiar todo lo que pueda al usuario tonto: (introduce tu nota 1: la 2...)

        // Inicializo las variables (como son notas y no se si van a ser numeros enteros o decimales, se usa 'double')
        double nota1 = teclado.nextDouble();    // Cuando el usuario pueda introducir tanto numeros enteros como decimales,
        double nota2 = teclado.nextDouble();    // como no lo sabemos aplicamos siempre un double.
        double nota3 = teclado.nextDouble();
        double nota4 = teclado.nextDouble();
        double nota5 = teclado.nextDouble();

        // Si me dijeran de que la nota1 apareciera en la nota3 y viceversa, seria:
        var aux = nota3;
        nota3 = nota1;      // Aplicamos el 'var aux'
        nota1 = aux;

        // Y lo saco por pantalla
        System.out.println("Nota 1= " + nota1);
        System.out.println("Nota 3= " + nota3);



        // Hago la operacion para saber como sacas la nota media
        // Hay que usar 'lowerCamelCase' para nombrar variables. EJ: extintorContraIncendios.
        double notaMedia = ((nota1 + nota2 + nota3 + nota4 + nota5) / 5);

        // Solucion:
        System.out.println("Tu nota media es: " + notaMedia);   
        
        // Limitamos el numero de decimales
        System.out.printf("La media es %.2f/n", notaMedia); //SOprintf, sirve para limitar el numero de decimal (f = formato, indica que voy a poner 1 decimal)
                                    // el '%.2' sirve para limitar a 2 decimales o el numero que pongamos.
                                    // el '/n' sirve para generar en adelante un salto de linea.
                                    // el '\t' sirve para crear al principio una tabulacion.

                                    /*caracteres de escape (mirarlo)*/


    
        






    }
    

}
