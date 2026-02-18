package apuntes.ARRAYS.EjerciciosARRAYS;

public class arrayejercicios3 {
    
    //---------------------------------ejercicio3---------------------------------
    // Contar número de veces que aparece un número en un array.


    public static void main(String[] args) {
        int[] numeros = {3, 5, 7, 3, 2, 3, 9, 5, 3};
        int numeroABuscar = 3;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroABuscar) {
                contador++;
            }
        }

        System.out.println("El número " + numeroABuscar + " aparece " + contador + " veces en el array.");
    }
}
