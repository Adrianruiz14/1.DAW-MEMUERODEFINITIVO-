package apuntes.ATAJOS;

import java.util.Scanner;

public class ScannerEjemplo {
    
    private static java.util.Scanner tecladoGlobal = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        
        /* Scanner */
        // Importa la clase: java.util.Scanner
        // Para crearlo:

            Scanner teclado = new Scanner(System.in);

        // Y para aplicarlo:

           int num = teclado.nextInt();

        // Dependiendo del tipo de variable que usemos, ponemos:
        /* 
         * teclado.nextLine(); --> para String
         * teclado.next(); --> para una sola palabra (String)
         * teclado.nextInt(); --> para int
         * teclado.nextDouble(); --> para double
         * .......
         */

    }

}
