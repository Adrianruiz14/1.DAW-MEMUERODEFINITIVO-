package apuntes.ARRAYS.EjerciciosARRAYS;

public class ejerciciofuncionesarrays {
    public static int encontrarLetra(char letra, char[] array){
        for (int i = 0; i < array.length; i++) {
            if (letra == array[i]) {
                return i;
                
            }
        } return -1;
       

    }
}
