package apuntes.ARRAYS.EjerciciosARRAYS;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicioarrays9 {
    private static Scanner teclado = new Scanner(System.in);

    // pedir al usuario que meta en un array de posiciones del 1 al 5 de tamaño 10
    // y a partir de ese array crear otro que en cada una de las siguientes
    // posiciones un número
    // total entre 1 y 5 de tamaño 5
    // y decir: el 1 se repite x veces ... así con todos los números entre el 1 y el
    // 5

    public static void main(String[] args) {
        // Declaramos el tamaño del nuevo array
        int tam = 10;
        int[] array1 = new int[tam];

        // El booleano se utiliza principalmente para salir de los bucles.

        // && --> y
        // || --> o

        // Recorrer el array decimos que tam = a array1.length porque ambas significan
        // el tamaño.
        for (int i = 0; i < array1.length; i++) {
            boolean control = false;

            do {
                try {
                    System.out.println("Introduce el número para la posición " + i);

                    array1[i] = teclado.nextInt();
                    if (array1[i] >= 1 && array1[i] <= 5) {
                        // LLenamos el array.
                        control = true;

                    }

                } catch (InputMismatchException ime) {

                    System.out.println("ERROR, número no correspondido");
                    teclado.nextLine();
                }

            } while (!control);

        }
        // Imprimimos el array en corchetes.
        System.out.println(Arrays.toString(array1));
        // for each --> Se puede utilizar para recorrer un array sin modificar los
        // valores.
        // InputMismatchException --> Esta excepción aparece cuando el programa espera
        // un tipo de dato,
        // pero el usuario introduce otro diferente (Pasa muchisimo con scanner)
        // Array IndexOutOfBounds --> Ocurre cuando intentas acceder a una posiciónde un array que no existe.
        
        // System.out.println(Arrays.toString(arraySolicitado));

        teclado.close();
    }
}