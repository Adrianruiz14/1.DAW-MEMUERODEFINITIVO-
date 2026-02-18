package apuntes.UT03.ESTRUCTURASdeCONTROL;

import java.util.Scanner;

public class EstructurasRepeticion {
    
    public static void main(String[] args) {
        
        // Todas las estructuras de repeticion tienen 3 partes:
        // Inicializacion de variable de control
        // Condicion que usa la variable de control
        // Actualizacion de la variable de control

        // while (0 a n iteraciones)
        int variableControl = 1; // Inicializacion
        while (variableControl <= 5) { // Condicion
            System.out.println("Hola");
            // System.out.println("Iteracion: " + (++variableControl)); //Asi saldria el dato actualizado, al poner dentro de una instruccion el ++ antes de la variable
            // System.out.println("Iteracion: " + (variableControl++)); //Asi saldria el dato principal, al poner dentro de una instruccion el ++ despues de la variable, sale el dato principal y ya lgo se actualiza el valor
        }


        // do while (1 a n iteraciones)
        // es como el while pero para siempre. Hace una iteracion
        int variableControl12 = 1; // Inicializacion
        do {
            System.out.println("Iteracion: " + variableControl12);
            variableControl12++; // Actualizacion
        } while (variableControl12 < 10); // Condicion



        // for
        // se usa cuando sabemos el numero de iteraciones a realizar
        for (int variableControl13 = 1; variableControl13 < 10; variableControl13++){
            System.out.println("Iteracion: " + variableControl13);
        }


        // Escribe tu nombre hasta que el usuario introduzca un cero
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();

        // while (de 0 a n iteraciones)
        while (numero != 0) {
            System.out.println("Crisss");
            System.out.println("Introduce otro numero: ");
            numero = teclado.nextInt();
        }


    }

}
