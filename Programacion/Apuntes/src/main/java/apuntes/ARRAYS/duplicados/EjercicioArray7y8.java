package apuntes.ARRAYS.duplicados;

import java.util.Arrays;
import java.util.Random;

public class EjercicioArray7y8 {
    
    /*
     * Crear una función que devuelve un array de tamaño el que le quiera
     * poner en el parametro con numeros aleatorios entre 1 y 30.
     *
     * Y luego hacer otra funcion que recibe el array anterior y devulve un
     * nuevo array sin duplicados.
     */

    public static void main(String[] args) {

        // Declaro el array que voy a usar para almacenar numeros aleatorios
        int[] arrayNumerosAleatorios = new int[10];

        // Creo el objeto Random
        Random r = new Random();

        // Ahora me toca rellenar el array con números aleatorios
        for (int i = 0; i < arrayNumerosAleatorios.length; i++) {

            // Generar un número aleatorio entre 1 y 30
            arrayNumerosAleatorios[i] = r.nextInt(30) + 1;

        }

        // Mostrar el array sin duplicados
        System.out.println("Array de numeros aleatorios de tamanio 10:");
        System.out.println(Arrays.toString(arrayNumerosAleatorios));

        /*// 2. Crear un array sin duplicados
        int[] sinDuplicados = quitarDuplicados(numeros);

        // Mostrar el array sin duplicados
        System.out.println("Array sin duplicados:");
        System.out.println(Arrays.toString(sinDuplicados));*/

    }


    // MÉTODO 1
    public static int[] crearArrayDeNuAleatorio(int tamanio) {

        Random r = new Random();
        int[] arrayTamanio = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            arrayTamanio[i] = r.nextInt(30) + 1;  // Números 1 a 30
        }

        return arrayTamanio;
    }

    
    // MÉTODO 2
    public static int[] quitarValoresDuplicados(int[] array) {

        int[] temp = new int[array.length]; // Temporal para únicos
        int contador = 0; // Cuántos números únicos llevo

        // Recorro el array original
        for (int i = 0; i < array.length; i++) {

            int numeroActual = array[i];
            boolean repetido = false;

            // Revisar si ya está en temp
            for (int j = 0; j < contador; j++) {
                if (temp[j] == numeroActual) {
                    repetido = true; // Está repetido
                    break;
                }
            }

            // Si no está repetido, lo guardo
            if (!repetido) {
                temp[contador] = numeroActual;
                contador++;
            }
        }

        // Crear array final sin huecos sobrantes
        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = temp[i];
        }

        return resultado;

    }

}

