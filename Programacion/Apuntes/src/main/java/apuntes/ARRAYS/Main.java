package apuntes.ARRAYS;

import java.util.Random;
import java.util.Scanner;

public class Main {

    // Atributo de clase privado accesible por todos los métodos
    // de la clase Main
    private static final Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        // Características
        /*
         * Son estructuras de datos complejas y permiten
         * almacenar datos del mismo tipo
         * Todos los arrays son estáticos -> no se redimensionan autom.
         * Hay que crearlos con un tamaño inicial
         * Siempre van de 0 a tamaño-1 (posiciones)
         */

        // Declarar array de int []
        int[] arrayInt;
        // Inicialización del array para 10 números
        arrayInt = new int[10];
        // Para almacenar datos en el array tenemos que
        // usar las posiciones
        // posicion 0 el número 8
        arrayInt[0] = 8;
        arrayInt[3] = 9;
        arrayInt[3] = 11;

        // Recuperar el valor de una posición del array
        System.out.println("El array en la posicion 1 tiene " + arrayInt[3]);

        // IMPORTANTE - NO SALIRSE DE LAS POSICIONES
        // ArrayIndexOutOfBounds (0-tam-1)
        arrayInt[9] = 6;

        //
        System.out.println("El tamaño del array " + arrayInt.length);

        // Bucle que recorre todas las posiciones del array
        // for (int i = 0; i < arrayInt.length; i++) {
        // System.out.println(arrayInt[i]);
        // }

        // Random para rellenar el array aleatoriamente entre 100 y 200
        Random random = new Random();
        // random.nextInt(100,201);
        // Rellena el array con números aleatorios
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(100, 201);
        }

        // Mostrar el array
        imprimirArray(arrayInt);

        // Usuario de qué tamaño quires el array
        // int tamanio = 5;
        System.out.println("¿Qué tamaño quieres?");
        int tam = tec.nextInt();

        int[] array2 = rellenarArray(tam);
        // Mostrar el array
        System.out.println("Array del usuario -----------");
        imprimirArray(array2);
    }

    // Método que recibe el tamaño del array.
    // Crea el array, lo rellena con valores por teclado
    // y devuelve el array relleno

    public static int[] rellenarArray(int tamanio) {
        int[] array = new int[0];
        if (tamanio > 0) {
            array = new int[tamanio];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor para pos " + i);
            array[i] = tec.nextInt();
        }
        return array;
    }

    // Método que recibe un array y lo imprime por consola
    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + "-");
            } else {
                System.out.println(array[i]);
            }
        }
    }

    {

        // foreach. Recorre todos los elementos del array. No usa indices
        // En cada iteración coge el elemento que toca y lo guarda en la variable que se
        // indica en el bucle.
        // Internamente usa un objeto de tipo Iterator
        // La variable de la parte izquierda es del tipo que contiene el array.
        // En la parte derecha ponemos la estructura de datos (el array a recorrer)
        // El foreach sirve para leer datos no para modificarlos.

        /*for (char letrita : arrayLetras) {
            // 1ª iteración -> letrita <- 'd'
            // 2ª iteración -> letrita <- 't'
            // 3ª iteración -> letrita <- 'p'
            // ... ultima iteración -> letrita <- 'q'

            System.out.println(letrita);

        }*/

        // Un array es un objeto
        // Al declararlo final implica que puede cambiar sus valores
        // pero no puedo reutilizar la variable array

        /*final int[] array = new int[2];
        array[0] = 1;
        array[1] = 2;

        int[] array2 = { 1, 2, 3 };
        array2 = new int[1];
        array = array2;*/

    }
}