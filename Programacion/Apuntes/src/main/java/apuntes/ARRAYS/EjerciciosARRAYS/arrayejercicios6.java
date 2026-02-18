package apuntes.ARRAYS.EjerciciosARRAYS;

import java.util.Scanner;

public class arrayejercicios6 {

    // Función que recibe un String, lo transforma en array de char
    // y devuelve si es un palíndromo (como "oso").
    // Solo se usa un bucle y dos parámetros.
    public static boolean esPalindromo(String palabra) {
        // Convertimos el String a array de caracteres
        char[] letras = palabra.toCharArray();
        // Esta funcion es la que nos transforma cualquier variable de tipo String en un
        // array de char.

        // Recorremos solo hasta la mitad porque de esta forma queremos comprobar que se
        // lee igual al derecho y al reves
        for (int i = 0; i < letras.length / 2; i++) {
            // Comprobamos que el carácter i coincide con su opuesto desde el final
            if (letras[i] != letras[letras.length - 1]) {
                return false; // No es palíndromo
            }
            // Cuando comparas los pares de letras desde los extremos hacia el centro,
            // ya estás comprobando todas las coincidencias.
        }
        return true; // Sí es palíndromo, el programa devuelve un valor desde una función donde fue
                     // llamada

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra;
        // palabra guarda lo q el usuario escribe por teclado.

        do {
            System.out.print("Introduce una palabra: ");
            palabra = teclado.nextLine().toLowerCase(); // toLowerCase --> Pasamos a minúsculas para evitar errar en en el JOptionPane

            if (!esPalindromo(palabra)) {
                System.out.println(palabra + " no es un palíndromo. Intenta de nuevo.\n");
            }
        } while (!esPalindromo(palabra));

        System.out.println(palabra + " es un palíndromo. ¡Bien hecho!");
        
    }
}
