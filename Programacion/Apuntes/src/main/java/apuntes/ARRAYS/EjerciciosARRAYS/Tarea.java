package apuntes.ARRAYS.EjerciciosARRAYS;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Tarea {
    /*
     * Le pedimos al usuario que meta en un array de 10 posiciones
     * números de 1 al 5 a partir de este array en una funcion tenemos
     * que obtener un nuevo array que lleve en cada una de las siguientes
     * posiciones el num que hay de cada num(el array llevara en principio
     * 5 huecos) y en el main deberemos imprimir --El num x se repite y veces--
     */
    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {

        boolean salir = true;
        int tam = 0;
        do {
            try {
                System.out.println("Introduce la cantidad de números que quieres: ");
                tam = sc.nextInt();

                if (tam <= 0) {
                    System.out.println("Debes introducir mayor a 0.");
                    salir = false;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un número, sin letras");
                salir = false;
                sc.nextLine();
            }
        } while (!salir);
        int[] array1 = new int[tam];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(1, 100); // Llenamos el array con números del 1 al 5
            /*
             * do {
             * try {
             * 
             * System.out.println("Introduce un número del 1 al 5 para la posición " + i);
             * array1[i] = sc.nextInt();
             * if (array1[i] < 1 || array1[i] > 5) {
             * System.out.println("Debes introducir entre del 1 al 5.");
             * salir = false;
             * }
             * } catch (InputMismatchException ime) {
             * System.out.println("Introduce un número entre del 1 al 5, sin letras");
             * salir = false;
             * sc.nextLine();
             * }
             * } while (!salir);
             */
        }
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();
        arrayContador(array1, tam);
    }

    public static int[] arrayContador(int[] array1, int tam) {

        int[] arrayCont = new int[tam];
        int[] array2 = new int[tam];
        array2 = devolverSinRepetidos(array1, tam);

        for (int i = 0; i < tam; i++) {
            int contador = 0;

            for (int j = 0; j < tam; j++) {
                if (array2[i] == array1[j]) {// Cada vez que un num del array es = a el que tenemos en num sumamos
                                             // contador
                    contador++;
                }
            }
            arrayCont[i] = contador;// Le damos que en la posicion i el valor es las veces que ser
            // osea la el 1 se repite arrayCont[0]veces
            System.out.print("El número " + array2[i] + " sale " + arrayCont[i] + " veces ");
            for (int j = 0; j < contador; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return arrayCont;
    }

    public static int[] devolverSinRepetidos(int[] array1, int tam) {

        int contadorUnicos = 0; // Contador de cuántos valores únicos hay

        int[] unicos = new int[tam]; // Array con 100 espacios

        for (int i = 0; i < array1.length; i++) {
            boolean hay = false; // de base todos son false

            for (int j = 0; j < contadorUnicos; j++) {
                if (unicos[j] == array1[i]) {
                    hay = true; // Si ya está, marcamos “hay = true” y al ponerlo en true no entramos en el if
                                // de abajo por lo que no lo añadimos al array ni sumamos contador
                    break; // Y salimos del bucle i
                }
            }

            if (!hay) {
                unicos[contadorUnicos] = array1[i]; // Lo añadimos al array unicos, en la posición ContadorUnicos
                contadorUnicos++; // contador de unicos
            }
        }

        int[] unicosFinal = new int[contadorUnicos]; // Creamos un array del tamaño segun el contador de unicos

        for (int i = 0; i < contadorUnicos; i++) {
            unicosFinal[i] = unicos[i]; // Copiamos los valores unicos al array unicosFinal
        }
        for (int i = 0; i < unicosFinal.length - 1; i++) {
            for (int j = 0; j < unicosFinal.length - 1 - i; j++) {
                // Si es mayor
                if (unicosFinal[j] > unicosFinal[j + 1]) {
                    // Cambiamos primero el mas grande al ult, luego penult, etc...
                    int temp = unicosFinal[j];
                    unicosFinal[j] = unicosFinal[j + 1];
                    unicosFinal[j + 1] = temp;
                }
            }
        }

        return unicosFinal;
    }

}

///
/// Intentar hacer este ej pero sin cantidad de números
///