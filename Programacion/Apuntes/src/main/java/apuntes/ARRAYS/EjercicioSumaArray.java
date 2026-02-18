package apuntes.ARRAYS;

public class EjercicioSumaArray {
    
    // Sumar los elementos de un array y mostrar el resultado
    public static void main(String[] args) {
        
        // Definir un array
        int[] numeros = {5, 10, 15, 20, 25};
        
        // Variable para almacenar la suma
        int suma = 0;

        // Recorrer el array y sumar sus elementos
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // Mostrar el resultado
        System.out.println("La suma de los elementos del array es: " + suma);
    }
}
