package EJERCICIOStema2;

import java.util.Scanner;

public class Ejercicio2fecha {
    
    /* Leer año de nacimiento del usuario y mostrar su edad. */

    public static void main(String[] args) {
    
        // Inicializo el scanner
        Scanner teclado = new Scanner(System.in);

        // Saco por pantalla que introduzca el usuario su fecha de nacimiento
        System.out.println("Introduce el ano de nacimiento: ");

        // Inicializo la variable
        int ano = teclado.nextInt();

        // Saco por pantalla
        System.out.println("Tu ano de nacimiento es: " + ano);

        // Inicializo la variable
        int edad = 2025 - ano;

        // Solucion:
        System.out.println("Tu edad es: " + edad);


    }



}
