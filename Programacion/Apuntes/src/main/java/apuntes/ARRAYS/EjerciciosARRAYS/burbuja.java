package apuntes.ARRAYS.EjerciciosARRAYS;

public class burbuja {
    public static void main(String[] args) {
        // Metodo burbuja

        int[] arrrayDesordenado = new int[10];
        arrrayDesordenado[0] = 5;
        arrrayDesordenado[1] = 3;
        arrrayDesordenado[2] = 6;
        arrrayDesordenado[3] = 1;
        arrrayDesordenado[4] = 7;
        arrrayDesordenado[5] = 10;
        arrrayDesordenado[6] = 4;
        arrrayDesordenado[7] = 9;
        arrrayDesordenado[8] = 8;
        arrrayDesordenado[9] = 2;

        for (int i : arrrayDesordenado) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < arrrayDesordenado.length - 1; i++) {
            for (int j = 0; j < arrrayDesordenado.length - 1 - i; j++) {
                // Si es mayor
                if (arrrayDesordenado[j] > arrrayDesordenado[j + 1]) {
                    // Cambiamos primero el mas grande al ult, luego penult, etc...
                    int temp = arrrayDesordenado[j];
                    arrrayDesordenado[j] = arrrayDesordenado[j + 1];
                    arrrayDesordenado[j + 1] = temp;
                }
            }
        }
        for (int i : arrrayDesordenado) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
