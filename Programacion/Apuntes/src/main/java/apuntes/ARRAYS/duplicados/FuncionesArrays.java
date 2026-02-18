package apuntes.ARRAYS.duplicados;

import java.util.Random;

    /* 8.- Funcion que recibe un array de numeros (array del paso 7) 
     * y devuelve un nuevo array sin duplicados.
     * Main -> 7 y 8.
     */

public class FuncionesArrays {

    // Atributo de clase (static) privado, accesible desde todos los metodos de esta clase
    // NO accesible desde otras clases
    private static Random random = new Random();

    // Funcion que recibe un array de numeros y devuelve un array sin duplicados
    public static int[] quitarDuplicados(int[] array) {

        int[] arrayFinal = null;    // Array sin duplicados y sin ceros
        int[] arraySinDuplicados = new int[array.length]; // Array temporal para ir guardando los numeros sin duplicados

        
        // Recorro el array original (el que viene por parámetro)
        for (int i = 0; i < array.length; i++) {
            
            // Guardo el elemento en array sin duplicados si no esta
            if (!Esta(array[i], arraySinDuplicados)) {
                
                arraySinDuplicados[i] = array[i];

            }

        }
        
        // Contamos los elemetnos distintos que hay en el nuevo array sin duplicados
        int contador = contarNumeros(arraySinDuplicados);
        arrayFinal = new int[contador];  // Creo el array para esa cantidad de numeros
        
        int posicion = 0;
        for (int i : arraySinDuplicados) {
            
            arrayFinal[posicion++] = i;

        }
        
        return arrayFinal; // Devolvemos el array sin duplicados

    }

    public static int contarNumeros(int[] array) {
        
        int contador = 0;

        for (int i : array) {
            
            if (i != 0) {
                
                contador++;

            }

        }

        return contador;

    }

    // Funcion para saber si esta x numero en el array o no
    public static boolean Esta(int numeroABuscar, int[] arrayDondeBuscar) {
        
        for (int elemento : arrayDondeBuscar) {
            if (numeroABuscar == elemento) {
                
                return true;  // Si lo encuentro, devuelvo true 
    
            }
        }

        return false;  // Si no lo encuentro, devuelvo false

    }

    // Funciones que devuelve (generar el array y return)
    // crea un array de tamaño especificado con elementos entre 1 y 30
    // devolver la variable array

    // Si el parametro no es valido se genera una excepcion
    // de tipo IllegalArgumentException

    public static int[] generarArrayAleatorios(int tam) {
        
        // Asi generamos una excepcion que nos pidan. Ahora hay que pasarlo al main:
        // Para pasarlo al main, hay que poner un try catch en el main, nombrando el fallo.
        if (tam <= 0) {
            
            throw new IllegalArgumentException("El tamaño del array no puede ser <= 0.");

        }


        int[] array = new int[tam];

        // Recorro el array y en cada posicion asigno un num aleatorio
        for (int i = 0; i < array.length; i++) {
            
            array[i] = random.nextInt(1, 31);  // numeros entre 1 y 30: (valor ini, valor fin +1)

        }

        return array;

    }


}
