package apuntes.METODOS.Funciones.tema4objetos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Calculadora

        boolean salir = false; // No quiero salir, se repite hasta
        // que el usuario decida salir = true
        Scanner teclado = new Scanner(System.in);
        int opcionElegida;
        int operando1 = 0, operando2 = 0, resultado;
        double resultadoDivision;

        // Repetir
        do {

            // opcionElegida = 0; // Sirve para reiniciar la opción
            mostrarMenu();
            System.out.println("Introduce una opción (1-5): ");

            try {

                opcionElegida = leerEnteroTeclado();

                switch (opcionElegida) {
                    case 1 -> {
                        System.out.println("Opción sumar");
                        operando1 = leerEnteroTeclado();
                        operando2 = leerEnteroTeclado();
                        
                        resultado = FuncionesCalculadora.sumar(operando1, operando2);
                        System.out.println("Resultado " + resultado);

                    }
                    case 2 -> {
                        System.out.println("Opción restar");
                        operando1 = leerEnteroTeclado();
                        operando2 = leerEnteroTeclado();

                        resultado = FuncionesCalculadora.restar(operando1, operando2);
                        System.out.println("Resultado " + resultado);
                    }
                    case 3 -> {
                        System.out.println("Opción multiplicar");
                        operando1 = leerEnteroTeclado();
                        operando2 = leerEnteroTeclado();

                        resultado = FuncionesCalculadora.multiplicar(operando1, operando2);
                        System.out.println("Resultado " + resultado);
                    }
                    case 4 -> {
                        System.out.println("Opción dividir");

                        operando1 = leerEnteroTeclado();
                        operando2 = leerEnteroTeclado();

                        resultadoDivision = FuncionesCalculadora.dividir(operando1, operando2);
                        System.out.println("Resultado " + resultadoDivision);

                    }
                    case 5 -> {
                        System.out.println("Has decidido salir...");
                        System.out.println("Hasta pronto.");
                        salir = true; // Me quiero ir
                    }

                    default -> {
                        System.out.println("Te has equivocado de opción");
                    }
                }

            } catch (InputMismatchException ime) {
                // Hago algo
                System.out.println("No has introducido un número. Intenta de nuevo...");
                teclado.nextLine();
            } catch (IllegalArgumentException iae) {
                System.out.println("No se puede dividir por cero");
            }

        } while (!salir); // mientras no quiera salir
    }

    public static int leerEnteroTeclado(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un número ");
        int numero = tec.nextInt();

        return numero;
    }

    // Función que no retorna valor
    public static void mostrarMenu() {
        String menu = """
                ## Bienvenido a la calculadora ##
                    1.- Sumar
                    2.- Restar
                    3.- Multiplicar
                    4.- Dividir
                    5.- Salir
                    --------------------------
                """;
        System.out.println(menu);
    }

    // Función dentro de la clase Main, se llama sumar
    // Recibe dos parámetros de tipo int
    // Devuelve un valor de tipo int, resultado de la suma de los dos parámetros
    // public implica que puedo usar la función desde cualquier clase de mi proyecto
    // [public|private] [tipo_dato_devuelve|void] nombre_Metodo (tipoDato param1,
    // tipoDato parm2, etc)
    

}