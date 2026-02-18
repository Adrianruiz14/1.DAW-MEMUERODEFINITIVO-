// ================================================================
// 📘 LECTURA DE DATOS POR TECLADO EN JAVA
// ================================================================
// 🔹 Tema: Uso de la clase Scanner
// 🔹 Permite leer datos introducidos por el usuario desde el teclado.
// 🔹 Pertenece al paquete java.util, por eso se debe importar.
// ================================================================

import java.util.Scanner; // Importación necesaria para usar la clase Scanner

// ----------------------------------------------------------------
// 🔸 Nombre de la clase principal
// ----------------------------------------------------------------
public class LecturaDatosScanner {

    public static void main(String[] args) {

        // ============================================================
        // 🔹 CREACIÓN DE UN OBJETO SCANNER
        // ============================================================
        // Para leer datos, necesitamos crear un objeto de tipo Scanner
        // que reciba como parámetro la entrada estándar del sistema:
        // System.in  → representa el teclado.
        Scanner teclado = new Scanner(System.in);


        // ------------------------------------------------------------
        // 🔸 Lectura de un número entero (int)
        // ------------------------------------------------------------
        System.out.println("Introduce tu edad: ");

        // El método nextInt() lee un número entero introducido por el usuario.
        // ⚠️ Si el usuario introduce texto en lugar de un número, lanzará una excepción.
        int edad = teclado.nextInt();

        System.out.println("Tu edad es: " + edad);


        // ------------------------------------------------------------
        // ⚠️ Importante: limpiar el buffer
        // ------------------------------------------------------------
        // Después de leer números con nextInt(), queda un salto de línea (\n)
        // en el buffer del teclado.  
        // Si a continuación queremos leer una cadena de texto (nextLine),
        // debemos limpiar ese salto con una llamada extra a nextLine().
        System.out.println("Introduce tu nombre: ");

        teclado.nextLine(); // Limpia el salto de línea pendiente del buffer


        // ------------------------------------------------------------
        // 🔸 Lectura de una cadena de texto (String)
        // ------------------------------------------------------------
        // El método nextLine() lee una línea completa de texto (incluye espacios).
        String nombre = teclado.nextLine();


        // ------------------------------------------------------------
        // 🔸 Mostrar los datos combinados
        // ------------------------------------------------------------
        System.out.println("Te llamas " + nombre + " y tienes " + edad + " años.");

    }

}
