package matrices;

import java.util.Random;

public class ej2 {

    /*
     * Crea dos matrices de NxM con números aleatorios entre 1 y 9.
     * En un método que recibe las dos matrices, suma los elementos que ocupan las
     * mismas posiciones en ambas matrices y guarda el resultado en una nueva
     * matriz,
     * en la misma posición y devuelve el resultado. Imprime el resultado.
     */

    public static Random random = new Random();

    public static void main(String[] args) {

        int[][] matriz1 = new int[5][5];
        int[][] matriz2 = new int[5][5];

        for (int i = 0; i < matriz1.length; i++) { // Rellena la matriz con aleatorios
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = random.nextInt(1, 10);
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        for (int i = 0; i < matriz2.length; i++) { // Rellena la matriz con aleatorios
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = random.nextInt(1, 10);
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        int[][] matrizsumadaMain = matrizsumada(matriz1, matriz2);
        System.out.println(matrizsumadaMain);

    }

    public static int[][] matrizsumada(int[][] matriz1, int[][] matriz2) {

        int[][] matriz1copia = matriz1;
        int[][] matriz2copia = matriz2;
        int[][] matrizsumada = new int[5][5];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizsumada[i][j] = matriz1copia[i][j] + matriz2copia[i][j];
                System.out.print(matrizsumada[i][j] + " ");
            }
            System.out.println();
        }

        return matrizsumada;
    }

}
