package apuntes.ARRAYS.Ejercicios;

import java.util.Scanner;

public class EjercicioPolindromo {

    /* Crear una funcion que recibe un String lo transforma a array de char y devuelve si 
     * es un palindromo (palabra que se lee igual de izquierda a derecha) solo se usa 1 bucle y 2 indices */

    public static void main(String[] args) {

        // Creamos un Scanner
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario que introduzca una palabra
        System.out.print("Introduce una palabra: ");
        String palabra = teclado.nextLine();

        // Llamamos a la función esPalindromo para comprobar la palabra
        if (esPalindromo(palabra)) {

            // Si devuelve true → es palíndromo
            System.out.println("Es un palíndromo");

        } else {

            // Si devuelve false → no es palíndromo
            System.out.println("No es un palíndromo");

        }

    }


    // Creamos una función que comprueba si una palabra es palíndromo o no
    public static boolean esPalindromo(String palabra) {

        // Convertimos la palabra a minúsculas para que no importe si usa mayúsculas y la transformamos en un array de caracteres
        char[] letras = palabra.toLowerCase().toCharArray();

        // Declaramos los 2 índices:
        // i → empieza desde el inicio
        // j → empieza desde el final 
        int i = 0;
        int j = letras.length - 1;

        // Recorremos con un solo bucle mientras los índices no se crucen
        while (i < j) {

            // Comparamos el carácter de la izquierda con el de la derecha
            if (letras[i] != letras[j]) {
                
                // Si no son iguales, no es palíndromo → devolvemos false
                return false;
            }

            // Avanzamos los índices hacia el centro
            i++;
            j--;
        }

        // Si el bucle termina sin diferencias → la palabra es palíndromo
        return true;
    }

}
