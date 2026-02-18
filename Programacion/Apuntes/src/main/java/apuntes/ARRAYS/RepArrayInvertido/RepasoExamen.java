package apuntes.ARRAYS.RepArrayInvertido;

// Funciones en misma y distinta clase, para parámetro.
// Hacer un array con una función que reciba el array y haga una copia
// del array original y otra función que haga una copia del original, pero invertido.

import java.util.Arrays;

public class RepasoExamen {

    /* Hacer un array con una función que reciba el array y haga una copia
    del array original y otra función que haga una copia del original pero invertido. */

    // Función que recibe un array y devuelve una copia exacta
    public static int[] copiarArray(int[] original) {

        // Aqui declaramos que el array de copia tiene el mismo tamaño que el original 
        int[] copia = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            
            copia[i] = original[i];

        }

        return copia;

    }

    // Función que recibe un array y devuelve una copia invertida
    public static int[] copiarArrayInvertido(int[] original) {
        
        int[] invertido = new int[original.length];
        
        for (int i = 0; i < original.length; i++) {

            invertido[i] = original[original.length - 1 - i];

        }

        return invertido;

    }

    public static void main(String[] args) {

        int[] array = {5, 2, 3, 10, 20};

        int[] copia = copiarArray(array);
        int[] copiaInvertida = copiarArrayInvertido(array);

        System.out.println("Original:  " + Arrays.toString(array));
        System.out.println("Copia:     " + Arrays.toString(copia));
        System.out.println("Invertido: " + Arrays.toString(copiaInvertida));

    }

}

