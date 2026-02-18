package apuntes.ARRAYS.NuVecesRepNum;

// pedir al usuario que meta en un array de posiciones un numero del 1 al 5 de tamaño 10
// y a partir de ese array crear otro que en cada una de las siguientes posiciones un numero total entre 1 y 5 de tamaño 5
// y decir: el 1 se repite X veces.... asi con todos los numeros entre el 1 y el 5

import java.util.Scanner;

public class EjercicioNuRep {

    public static void main(String[] args) {
        
        // Creamos el Scanner
        Scanner teclado = new Scanner(System.in);

        // Preguntamos al usuario por 10 numeros entre 1 y 5
        System.out.println("Introduce 10 numeros entre 1 y 5: ");

        // Declaro e inicializo el array, asignándole el tamaño = 10
        int[] arrayNumeros = new int[10];
        
        // Creo un bucle para que el usuario introduzca los 10 numeros
        for (int i = 0; i < arrayNumeros.length; i++) {
            
            // Creo un sout para ir preguntandole al usuario que vaya poniendo los numeros en cada posicion
            System.out.println("Introduce un numero en la posicion " + i + ": ");
            int num = teclado.nextInt();

            if (num < 1 || num > 5) {
                
                System.out.println("El numero introducido no vale, intentalo de nuevo.");
                int numDeNuevo = teclado.nextInt();

            }

        }


        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }

        
        // Crear excepcion por si el usuario no introduce un numero entre 1 y 5
        
    }

}
