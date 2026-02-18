package apuntes.ATAJOS;

// ===============================================================
// 📘 DIFERENCIAS ENTRE print() Y println()
// ===============================================================
// 🔹 Autor: [Tu nombre]
// 🔹 Tema: Salida de datos por consola en Java
// 🔹 Objetivo: Entender cómo se muestran los datos con System.out.print y System.out.println
// ===============================================================

public class DiferenciasprintYprintln {
    
    public static void main(String[] args) {
        
        // ============================================================
        // 🔸 System.out.println()
        // ============================================================
        // 👉 Muestra el texto en consola y después realiza un salto de línea.
        // Es decir, el siguiente texto se imprimirá en la línea siguiente.
        //
        // Equivale a escribir:
        // texto + "⏎"   (enter)
        // ============================================================

        System.out.println("Hola usuario, bienvenido");
        System.out.println("A continuación se muestra una cuenta regresiva:");

        // ------------------------------------------------------------
        // 🔹 Ejemplo: Uso de println() dentro de un bucle for
        // ------------------------------------------------------------
        // Muestra los números del 10 al 1, cada uno en una línea nueva.
        for (int i = 10; i >= 1; i--) {
            System.out.println(i); // Cada número se imprime en una línea distinta
        }

        System.out.println("Fin de la primera cuenta regresiva ✅\n");


        // ============================================================
        // 🔸 System.out.print()
        // ============================================================
        // 👉 Muestra el texto en consola SIN salto de línea.
        // Es decir, los siguientes valores se imprimirán uno al lado del otro.
        //
        // Equivale a escribir:
        // texto + "" (sin salto)
        // ============================================================

        System.out.println("Ahora, otra cuenta regresiva (en la misma línea):");

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " "); // imprime todo en una misma línea separado por espacios
        }

        // 👇 Para terminar con un salto de línea después del bucle:
        System.out.println("\nCuenta regresiva terminada 🚀");

    }

}
