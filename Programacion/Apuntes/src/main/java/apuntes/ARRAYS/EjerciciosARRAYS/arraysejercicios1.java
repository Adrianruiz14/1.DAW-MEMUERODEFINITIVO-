package apuntes.ARRAYS.EjerciciosARRAYS;

public class arraysejercicios1 {
    
    //---------------------------------ejercicio1---------------------------------
    // Sumar los elementos de un array y mostrar el resultdado. 

     public static void main(String[] args) {
       
        int[] numeros = {5, 8, 12, 20, 7, 9};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        System.out.println("La suma de los elementos del array es: " + suma);


     }
}
