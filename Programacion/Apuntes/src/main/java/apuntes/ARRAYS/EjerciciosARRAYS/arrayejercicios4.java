package apuntes.ARRAYS.EjerciciosARRAYS;

public class arrayejercicios4 {
    //---------------------------------ejercicio4---------------------------------
    // Función que recibe un array de char y devuleve la posición en la que se encuentra 
    //el char que se pasa como parámetro o -1 si no está en el array.

    public static void main(String[] args) {
        
        char[] arrayLetras= {'a', 'e', 'i', 'o', 'u', 'b', 'c', 'd'};
        System.out.println("El tamaño del array es " + arrayLetras.length);
        char letraBuscar =  'p';

        int posicion = encontrarLetra(letraBuscar, arrayLetras);
        System.out.println("la posicion es: " + posicion);

    }
    public static int encontrarLetra(char letra, char[] array){
        for (int i = 0; i < array.length; i++) {
            if (letra == array[i]) {
                return i;
                
            }
        } return -1;
       

    }
    
}
