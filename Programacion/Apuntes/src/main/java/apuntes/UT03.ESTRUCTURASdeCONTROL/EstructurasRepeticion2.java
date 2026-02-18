package apuntes.UT03.ESTRUCTURASdeCONTROL;

import java.util.Scanner;

public class EstructurasRepeticion2 {
    
    // Cuenta atras desde 100 a 0 y solo imprimimos los impares

    public static void main(String[] args) {
        
        for (int i = 100; i >= 0; i--) {    // i-- = vamos restando de 1 en 1 hacia atras
            if (i % 2 != 0){
                System.out.println("i: " + i);
            }
        }

        System.out.println("--------------");

        for (int i = 99; i >= 0; i-=2) {    // i-=2 = va restando de 2 en 2
            System.out.println("i: " + i);
        }



        /* Introducir años hasta que se introduzca un bisiesto */

        Scanner teclado = new Scanner(System.in);
        int year;
        
        do {
            System.out.println("Introduce año: ");
            year = teclado.nextInt();    
        } while (!((year % 400 == 0) || ((year % 4 == 0)&&(year % 100 != 0)))); // !( = que cumpla lo contrario asignado a la condicion
        // Tengo una certeza: year es bisiesto



        /* Sumar los numeros que introduce el usuario hasta que introduzca el numero -1. Mostrar la suma */
        
        int dato, suma=0;
       
        do {
            System.out.println("Introduce año: ");
            dato = teclado.nextInt();  
            if (dato != 1) {
                suma += dato;
            }  
            // suma += dato;
        } while (dato != -1);
        System.out.println("La suma total es: " + suma);

        // Otra manera
        do {
            System.out.println("Introduce año: ");
            dato = teclado.nextInt();  
            if (dato == -1) {
                break; // El break corta la ejecucion del bucle y del tiron saca por pantalla
            }  
            suma += dato;
        } while (true);
        System.out.println("La suma total es: " + suma);

        System.out.println("Bucle con continue: --------");
        // Otra manera
        do {
            System.out.println("Introduce año: ");
            dato = teclado.nextInt();
            if (dato == -1) { 
                continue; // Se salta una iteracion pero no termina
            }  
            suma += dato;
        } while (suma != -1);        
        System.out.println("La suma total es: " + suma);

    }

}
