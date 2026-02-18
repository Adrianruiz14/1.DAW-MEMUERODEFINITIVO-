package matrices;

import java.util.Random;
import java.util.Scanner;

public class ej4 {

    public static Random random = new Random();
    public static Scanner teclado = new Scanner(System.in);

    /*
     * Implementa una aplicación que genere matrices de NxN (cuadrada) con números
     * aleatorios entre 0 y 1. Se debe poder imprimir la matriz en consola y
     * debe haber un método que busque dentro de la matriz las coordenadas de
     * la primera casilla que encuentre cuyo valor sea cero y esté rodeada de
     * unos en todas las casillas de su alrededor.
     */

    public static void main(String[] args) {

        int fila;
        int columna;
        int[][] matriz;

        do {

            fila = random.nextInt(10, 20);
            columna = random.nextInt(10, 20);

        } while (fila != columna);

        matriz = new int[fila][columna];
        for (int i = 0; i < matriz.length; i++) { // Rellena la matriz con aleatorios
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(0, 2);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------Inicio de la Busqueda--------");
        buscador(matriz);

    }

    public static void buscador(int[][] matriz) {
        boolean encontrado = false;

        // Empezamos en 1 y terminamos en length-1 para no salirnos de los bordes
        // -------IMPORTANTE-----------
        // MARCO DE SEGURIDAD -> EVITAR LOS BORDES YA QUE COMPROBANDO EL ADYACENTE DEL K
        // ESTÁ EN EL BORDE SE COMPRUEBA ESTE TAMBIÉN.
        for (int i = 1; i < matriz.length ; i++) {
            for (int j = 1; j < matriz[i].length ; j++) {
    
                // Verificamos si la casilla actual es 0
                if (matriz[i][j] == 0) {
                    // Verificamos los 8 vecinos (arriba, abajo, lados y diagonales)
                        
                    }
                  
                    if (matriz[i - 1][j - 1] == 1 && matriz[i - 1][j] == 1 && matriz[i - 1][j + 1] == 1 &&
                            matriz[i][j - 1] == 1 && matriz[i][j + 1] == 1 &&
                            matriz[i + 1][j - 1] == 1 && matriz[i + 1][j] == 1 && matriz[i + 1][j + 1] == 1) {

                        System.out.println("Encontrado. Posición: Fila " + i + ", Columna: " + j);
              
                    }
                }
            }
        

        if (encontrado == false) {
            System.out.println("No se encontró ningún 0 rodeado de 1.");
        }
    }
}
