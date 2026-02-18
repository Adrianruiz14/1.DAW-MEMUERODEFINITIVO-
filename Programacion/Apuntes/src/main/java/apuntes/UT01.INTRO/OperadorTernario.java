// ================================================================
// 📘 OPERADOR TERNARIO EN JAVA
// ================================================================
// 🔹 Tema: Uso del operador condicional ternario ( ? : )
// 🔹 Permite escribir expresiones condicionales en una sola línea,
//    funcionando como una versión compacta del if/else.
// ================================================================

import java.util.Scanner; // Importación necesaria para usar la clase Scanner

public class OperadorTernario {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // ------------------------------------------------------------
        // 🔸 Ejemplo 1: Comprobación de edad
        // ------------------------------------------------------------
        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine(); // Limpiamos el buffer

        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        String resultado;


        // ------------------------------------------------------------
        // 🧩 Versión 1 - Condicional IF clásico
        // ------------------------------------------------------------
        if (edad >= 18) {
            System.out.println("Hola " + nombre + ", puedes votar");
        } else {
            System.out.println("Hola " + nombre + ", no puedes votar");
        }


        // ------------------------------------------------------------
        // 🧩 Versión 2 - IF/ELSE que asigna un valor a una variable
        // ------------------------------------------------------------
        if (edad >= 18) {
            resultado = "puedes votar";
        } else {
            resultado = "no puedes votar";
        }
        System.out.println("Hola " + nombre + ", " + resultado);


        // ------------------------------------------------------------
        // 🧩 Versión 3 - Uso del OPERADOR TERNARIO
        // ------------------------------------------------------------
        // Sintaxis:
        //  resultado = (condición) ? valor_si_verdadero : valor_si_falso;
        resultado = (edad >= 18) ? "puedes votar" : "no puedes votar";
        System.out.println("Hola " + nombre + ", " + resultado);


        // ------------------------------------------------------------
        // 🧩 Ejemplo 2: Saber si una letra es vocal
        // ------------------------------------------------------------
        System.out.println("Introduce una letra: ");
        String letraTxt = teclado.nextLine(); // Lee el texto completo

        System.out.println("La palabra es: " + letraTxt);
        System.out.println("El tamaño de la palabra es: " + letraTxt.length());

        // Extraemos el primer carácter de la palabra
        char letra = letraTxt.charAt(0);
        System.out.println("La letra es: " + letra);

        // Versión if/else
        String esVocal;
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            esVocal = "es vocal";
        } else {
            esVocal = "no es vocal";
        }

        // Versión con operador ternario (más corta)
        esVocal = (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
                    ? "es vocal"
                    : "no es vocal";

        System.out.println("La letra '" + letra + "' " + esVocal);


        // ------------------------------------------------------------
        // 🧩 Ejemplo 3: Saber el mayor de tres números
        // ------------------------------------------------------------
        System.out.println("Introduce num1: ");
        int num1 = teclado.nextInt();

        System.out.println("Introduce num2: ");
        int num2 = teclado.nextInt();

        System.out.println("Introduce num3: ");
        int num3 = teclado.nextInt();

        // Versión con if/else
        int mayor;
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El número mayor (versión if/else) es: " + mayor);

        // Versión con operador ternario anidado
        mayor = (num1 > num2 && num1 > num3)
                    ? num1
                    : (num2 > num1 && num2 > num3)
                        ? num2
                        : num3;

        System.out.println("El número mayor (versión ternaria) es: " + mayor);

    }
    
}
