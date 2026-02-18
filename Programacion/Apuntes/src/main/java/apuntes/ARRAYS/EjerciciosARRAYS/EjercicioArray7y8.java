package apuntes.ARRAYS.EjerciciosARRAYS;

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

        int[] arrayInt = new int[30];

        // Declaro el array que voy a usar para almacenar numeros aleatorios
        int[] arrayNumerosAleatorios = new int[10];
        // Este array tiene tamaño diez es decir que son diez huecos "en blanco" preparados para rellenar los huecos con números alatorios 

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
        arrayInt = quitarDuplicados1(arrayNumerosAleatorios);
        String mostrararray = Arrays.toString(arrayInt);

        System.out.println(mostrararray);

        /*
         * // 2. Crear un array sin duplicados
         * int[] sinDuplicados = quitarDuplicados(numeros);
         * 
         * // Mostrar el array sin duplicados
         * System.out.println("Array sin duplicados:");
         * System.out.println(Arrays.toString(sinDuplicados));
         */

    }
    // Funciones

    // MÉTODO 1
    public static int[] crearArrayDeNuAleatorio(int tamanio) {

        if (tamanio <= 0) {
            throw new IllegalArgumentException("El tamaño del array no puede ser <= 0");
        }
        // Atributo de clase (Static) privado, accesible desde todos los métodos de esta
        // clase
        // No accesible desde otras clases

        Random r = new Random();
        int[] arrayTamanio = new int[tamanio];

        // Recorro el array y en cada posición asigno un num aleatorio
        for (int i = 0; i < tamanio; i++) {
            arrayTamanio[i] = r.nextInt(30) + 1; // Números 1 a 30 sin incluir el 0
            // arrayTamanio[i] = r.nextInt(1, 31); Método 2 incluye el 0
        }

        return arrayTamanio;
    }

    // Creamos el método del ejercicio 8
    public static int[] quitarDuplicados1(int[] arrayNumerosAleatorios) {
        // declaramos que el nuevo array va a tener el mismo tamaño que
        // arrayNumerosAleatorios
        int[] nuevo = new int[arrayNumerosAleatorios.length];
        nuevo = arrayNumerosAleatorios;
        // Recorro el array, por cada elemento
        for (int i = 0; i < nuevo.length; i++) {
            for (int j = 0; j < nuevo.length; j++) {
                if (i != j) {
                    if (nuevo[i] == arrayNumerosAleatorios[j]) {
                        nuevo[j] = 0;
                    }

                }
            }
        }
        return nuevo;
    }


    // Función que recibe un array de números y devuelve un array sin duplicados
    public static int[] quitarDuplicadosVico(int[] array) {


        int[] arrayFinal = null;
        int[] arraySinDuplicados = new int[array.length];

        // Recorro el array original (el que viene por parámetro)
        for (int i = 0; i < array.length; i++) {
            // Si el elemento que estoy mirando esta en nuevo array, no lo guardo
            if (!esta(array[i], arraySinDuplicados)) {
                arraySinDuplicados[i] = array[i];
            }
        }
        // Contar los elementios distintops que hay en el nuevo array sin duplicados
        int contador = contarNumeros(arraySinDuplicados);
        arrayFinal = new int[contador];
        int posicion = 0;
        for (int i : arraySinDuplicados) {
            if (i != 0) {
                arrayFinal[posicion++] = i;
            }
        }

        return arrayFinal;
    }

    public static int contarNumeros(int[] array) {
        int contador = 0;
        for (int i : array) {
            if (i != 0) {
                contador++;
            }

        }
        return contador;
    }

    public static boolean esta(int numeroABuscar, int[] arrayDondeBuscar) {
        for (int elemento : arrayDondeBuscar) {
            if (numeroABuscar == elemento) {
                return true;
            }
        }
        return false;
    }

}
