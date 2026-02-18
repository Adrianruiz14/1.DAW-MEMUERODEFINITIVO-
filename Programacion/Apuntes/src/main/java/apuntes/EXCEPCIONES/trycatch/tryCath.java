package apuntes.EXCEPCIONES.trycatch;

public class tryCath {

    public static void main(String[] args) {
        
        try {

            int resultado = 10 / 0;  // Esto lanzará una ArithmeticException (división por cero)

        } catch (ArithmeticException e) {

            // Aquí capturamos la excepción y manejamos el error
            System.out.println("Error: No se puede dividir por cero.");

        }
        
        System.out.println("El programa continúa ejecutándose después del error.");
    }
}


// MÚLTIPLES EXEPCIONES

class tryCath2 {

    public static void main(String[] args) {

        try {

            String texto = null;
            System.out.println(texto.length());  // Esto lanza una NullPointerException
            
            int[] array = new int[3];
            System.out.println(array[5]);  // Esto lanzará una ArrayIndexOutOfBoundsException

        } catch (NullPointerException e) {

            System.out.println("Error: Intentaste acceder a un objeto nulo.");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Índice fuera de rango.");

        } catch (Exception e) {

            System.out.println("Error desconocido: " + e.getMessage());

        }
        
        System.out.println("El programa continúa ejecutándose.");

    }
    
}

