package matrices;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random random = new Random();
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Crea una matriz de números aleatorios entre 1 y 9, de tamaño NxM e imprime el
         * resultado por consola.
         * Pide al usuario un número entre 1 y 9 y comprueba si está o no en la matriz,
         * indicando su fila y columna,
         * para ello crea un método que devuelva la fila y columna donde está o -1 -1 si
         * no está en la matriz.
         * Puedes devolver un array de dos posicione o bien crea una clase Coordenada
         * para guardar las posiciones i, j.
         */

          // EXTRA JUAN CARLOS: ENCUENTRA TODAS LAS POSICIONES DE ESE NUMERO

        int[][] matriz1 = new int[5][5];

        for (int i = 0; i < matriz1.length; i++) {  // Rellena la matriz con aleatorios
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = random.nextInt(1, 10);
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        int[] arrayfinal = buscarPos(matriz1);  // Me traigo el array del método y lo imprimo
        System.out.println(arrayfinal[0] + ", " + arrayfinal[1]);

        ArrayList<Coordenadas> listacoordenadasMain = buscarPosiciones(matriz1); // SE INVOCA, NECESITA LA MATRIZ QUE USÓ EN EL MÉTODO
        System.out.println(listacoordenadasMain);

    }

    public static int[] buscarPos(int[][] matriz1) { // Pido el número, lo busco y si lo encuentor, mando el array con las posiciones 

        System.out.println("Dime el numero que quieres buscar: ");
        int numero = teclado.nextInt();
        int i, j;
        for (i = 0; i < matriz1.length; i++) {
            for (j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] == numero) {
                    return new int[] { i, j };
                }

            }

        }
        throw new IllegalArgumentException("No se encuentra el número solicitado");
    }
    
    
    public static  ArrayList<Coordenadas> buscarPosiciones (int[][] matriz1) {// Pido el número y busco todas las posiciones de ese numero
        // Se crea la clase coordenadas y se usa de referencia en los ArrayList
        System.out.println("Dime el numero que quieres buscar: "); 
        int numero = teclado.nextInt(); 
        ArrayList<Coordenadas> listacoordenadas = new ArrayList<>(); 
        

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] == numero) { 
                    Coordenadas c1 = new Coordenadas(i, j); // Nueva coordenada, PONLA DENTRO PARA K SEAN SIEMPRE DISTINTAS 
                    listacoordenadas.add(c1);} 
            }   
        }
        
        return listacoordenadas;
    }
}