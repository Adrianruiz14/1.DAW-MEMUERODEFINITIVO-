package apuntes.ARRAYS;

import java.util.Scanner;

public class EjercicioContNumArray {
    
    // Contar número de veces que aparece un número en un array
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // Definir un array de ejemplo
        int[] numeros = {3, 7, 3, 2, 9, 3, 5, 7, 3};

        // Pedir al usuario el número a buscar
        System.out.print("Introduce el número que quieres contar: ");
        int numeroBuscado = teclado.nextInt();

        // Variable para contar las apariciones
        int contador = 0;

        // Recorrer el array y contar cuántas veces aparece el número
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                contador++;
            }
        }

        // Mostrar el resultado
        System.out.println("El número " + numeroBuscado + " aparece " + contador + " veces en el array.");

    }
    
}
