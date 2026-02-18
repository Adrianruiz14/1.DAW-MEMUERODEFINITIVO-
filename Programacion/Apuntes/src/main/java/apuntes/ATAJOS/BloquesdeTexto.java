package apuntes.ATAJOS;

// ================================================================
// 📘 BLOQUES DE TEXTO (TEXT BLOCKS) Y FORMATEO DE CADENAS EN JAVA
// ================================================================
// 🔹 Tema: Uso de los *Text Blocks* y de los especificadores de formato
// 🔹 Introducidos en Java 15 (text blocks) y disponibles desde antes (printf)
// ================================================================

public class BloquesdeTexto {

    public static void main(String[] args) {

        // ============================================================
        // 🔸 BLOQUES DE TEXTO (TEXT BLOCKS)
        // ============================================================
        // Los bloques de texto permiten escribir cadenas multilínea
        // de manera más legible, usando comillas triples """.
        //
        // Se usan especialmente para:
        //  - Texto multilínea (mensajes largos)
        //  - HTML, JSON, SQL o fragmentos de código
        // ============================================================

        String texto = """
                Hola,
                este es un bloque de texto en Java.
                Puedes escribir en varias líneas
                sin tener que usar el símbolo de \n
                para saltos de línea.
                """;

        System.out.println("Ejemplo de bloque de texto:");
        System.out.println(texto);


        // ============================================================
        // 🔸 ESPECIFICADORES DE FORMATO (PLACEHOLDERS)
        // ============================================================
        // Los placeholders sirven para insertar valores dentro de cadenas
        // de forma formateada. Se utilizan con printf() o String.format().
        //
        // ------------------------------------------------------------
        // %s → String
        // %d → Enteros (int, long, short, byte)
        // %f → Números decimales (float, double)
        // %.2f → Números decimales con 2 cifras después del punto
        // %b → Booleanos (true / false)
        // %n → Salto de línea (en printf)
        // ------------------------------------------------------------

        String nombre = "Lucía";
        int edad = 22;
        double nota = 8.756;
        boolean aprobado = true;

        // Ejemplo usando printf()
        System.out.printf("Hola %s, tienes %d años.%n", nombre, edad);
        System.out.printf("Tu nota es %.2f y ¿has aprobado?: %b%n", nota, aprobado);

        // Ejemplo usando String.format()
        String mensaje = String.format("Alumno: %s | Edad: %d | Nota: %.1f | Aprobado: %b",
                                        nombre, edad, nota, aprobado);
        System.out.println(mensaje);


        // ============================================================
        // 🔸 COMBINACIÓN: TEXT BLOCK + FORMAT
        // ============================================================
        // Puedes combinar un bloque de texto con placeholders (%)
        // para generar contenido dinámico y formateado.
        String plantilla = """
                ===============================
                📄 INFORME DEL ESTUDIANTE
                ===============================
                Nombre: %s
                Edad: %d
                Nota media: %.2f
                Aprobado: %b
                ===============================
                """;

        String informe = String.format(plantilla, nombre, edad, nota, aprobado);
        System.out.println(informe);

    }

}
