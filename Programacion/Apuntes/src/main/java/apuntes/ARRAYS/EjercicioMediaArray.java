package apuntes.ARRAYS;

import java.util.Scanner;

public class EjercicioMediaArray {
    
    // Media aritmetica de los numeros de un array.
    
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la cantidad de numeros que quieres que contenga el array: ");
        int cantidad = teclado.nextInt();

        int [] numeros = new int[cantidad];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número para la posición " + i + " : ");
            numeros[i] = teclado.nextInt();
            suma += numeros[i]; // Suma = suma + numeros[i];

        }

        double media = (double) suma / numeros.length;
        System.out.println("La media aritmética de los número del array es: " + media);
     }

} 
