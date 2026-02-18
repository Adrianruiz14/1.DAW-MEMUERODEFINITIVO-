package apuntes.ARRAYS.duplicados;

import java.util.Arrays;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        int tam = 0;
        int[] arrayMain = null;
        boolean salir = false;

        Scanner teclado = new Scanner(System.in);

        do {
            
            System.out.println("Introduce el tamaño del array: ");

            // Aqui es donde llamamos a la excepcion
            try {
                
                tam = teclado.nextInt();
                arrayMain = FuncionesArrays.generarArrayAleatorios(tam);
                salir = true;

            } catch (IllegalCallerException iae) {  // En esta condicion, ponemos el tipo de excepcion y luego su nombre que son siempre las iniciales de cada excepcion
                
                System.out.println(iae.getMessage());   // nombramos a la excepcion y la sacamos por mensaje en pantalla como un aviso.
                // salir = false;

            } catch (InputMismatchException ime) {  // Ponemos esta otra excepcion para que el usuario no ponga letras.
                
                System.out.println("Por favor, no pongas letras...");
                
                // Limpiamos el buffer (lo aplicamos cuando ya hemos puesto la letra y nos genera el errord)
                teclado.next();

            }


        } while (!salir);

        // Para mostrar el array generado
        System.out.println(Arrays.toString(arrayMain));
        System.out.println("----------------------");
        FuncionesArrays.quitarDuplicados(arrayMain);

        

    }

}
