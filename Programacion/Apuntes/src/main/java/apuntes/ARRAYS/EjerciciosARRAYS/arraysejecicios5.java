package apuntes.ARRAYS.EjerciciosARRAYS;

public class arraysejecicios5 {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 7, 10, 15, 50, 112 };
        double[] array2 = {5.2, 4.6, 5.9, 1.2, 7.9};

        int opcion = 1; // Cambia este valor para probar casos

        switch (opcion) {
            case 1:
                System.out.println("El valor máximo es: " + devolverValorMaximo(array));
                break;

            case 2:
                System.out.println("El valor mínimo es: " + devolverValorMinimo(array));
                break;

            case 3:
                System.out.println("Array antes: ");
                System.out.println(array2);

                multiplicacionArray(array2, 2.0);

                System.out.println("Array después: ");
                System.out.println(array2);
                break;

            case 4:
                char[] letras = generarArrayLetras(10);
                System.out.println(letras);
                break;

            case 5:
                String[] a1 = {"hola", "mundo"};
                String[] a2 = {"hola", "mundo"};
                System.out.println("¿Son iguales?: " + compararArrays(a1, a2));
                break;
        }
    }

    // Caso 1:
    public static int devolverValorMaximo(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Caso 2:
    public static int devolverValorMinimo(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Caso 3:
    public static void multiplicacionArray(double[] array, double multiplicador) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= multiplicador;
        }
    }

    public static void mostrarArray(double[] array) {
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Caso 4:
    public static char[] generarArrayLetras(int tamaño) {
        char[] arrayLetras = new char[tamaño];
        for (int i = 0; i < tamaño; i++) {
            arrayLetras[i] = (char) (Math.random() * 26 + 'a');
        }
        return arrayLetras;
    }

    // Caso 5:
    public static boolean compararArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }
}
