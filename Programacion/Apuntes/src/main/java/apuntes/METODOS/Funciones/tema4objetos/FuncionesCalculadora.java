package apuntes.METODOS.Funciones.tema4objetos;

// Esta clase sirve para crear funciones que 
// voy a utilizar en otras clases
public class FuncionesCalculadora {

    public static int sumar(int op1, int op2){
        int resultado;
        resultado = op1 + op2;
        return resultado;
    }

    public static int restar(int op1, int op2) {
        int resultado;
        resultado = op1 - op2;
        return resultado;
    }

    public static int multiplicar(int op1, int op2) {
        int resultado;
        resultado = op1 * op2;
        return resultado;
    }

    // Si queremos devolver double tenemos que forzar que uno de los operandos sea
    // double
    public static double dividir(double op1, double op2) {
        double resultado;
        if (op2 == 0){
            throw new IllegalArgumentException("Op2 es cero");
        }
        resultado = op1 / op2;
        return resultado;
    }
}