// ================================================================
// 📘 ESTRUCTURA BÁSICA DE UN PROGRAMA EN JAVA
// ================================================================

package apuntes.UT01.INTRO;

// ----------------------------------------------------------------
// 🔹 Comentarios en Java
// ----------------------------------------------------------------
// Comentario de una línea: se escribe con //
// Comentario multilínea: se escribe con /* ... */
// Los comentarios sirven para documentar el código y no se ejecutan.


// ----------------------------------------------------------------
// 🔹 Declaración del paquete (opcional)
// ----------------------------------------------------------------
// package nombre_del_paquete;
// El nombre del paquete debe coincidir con el nombre de la carpeta
// donde se encuentra la clase. Si no hay paquete, se deja vacío.


// ----------------------------------------------------------------
// 🔹 Declaración de la clase
// ----------------------------------------------------------------
// La palabra clave 'public' indica que la clase es pública
// El nombre de la clase SIEMPRE debe ser igual al nombre del archivo .java
// Ejemplo: EstructuraPrograma.java  →  public class EstructuraPrograma


public class EstructuraPrograma {

    /* ============================================================
    🔸 MÉTODO PRINCIPAL: main()
    ============================================================
    - Es el punto de entrada del programa.
    - Es el primer método que busca la JVM (Java Virtual Machine)
    al ejecutar un programa.
    - Su sintaxis es SIEMPRE la misma:
    
        public static void main(String[] args)
         * public → se puede acceder desde fuera de la clase.
         * static → no requiere crear un objeto para ejecutarse.
         * void → no devuelve ningún valor.
         * String[] args → es un arreglo de cadenas que puede recibir
        argumentos desde la línea de comandos.*/


    public static void main(String[] args) {

        System.out.println("Vamos a estudiar los tipos de datos y variables");

        // ============================================================
        // 🔹 TIPOS DE DATOS PRIMITIVOS
        // ============================================================
        // Los tipos primitivos son 8 y NO son objetos:
        // byte, short, int, long, float, double, char, boolean

        // ------------------------------------------------------------
        // 🔸 byte → Números enteros pequeños (-128 a 127)
        byte valorByte = 100;
        System.out.println("Valor byte = " + valorByte);

        // ------------------------------------------------------------
        // 🔸 short → Números enteros medianos (-32,768 a 32,767)
        short valorShort;        // Declaración
        valorShort = 1000;       // Asignación
        System.out.println("Valor short = " + valorShort);

        // ------------------------------------------------------------
        // 🔸 int → Enteros más usados (−2,147,483,648 a 2,147,483,647)
        int valorInt = -400;
        System.out.println("Valor int = " + valorInt);

        // ------------------------------------------------------------
        // 🔸 Clase envolvente (Wrapper Class)
        // Cada tipo primitivo tiene una clase que lo representa como objeto:
        // Byte, Short, Integer, Long, Float, Double, Boolean, Character
        Integer valorInteger = 345;
        System.out.println("Valor Integer = " + valorInteger);

        // Algunas propiedades útiles de Integer:
        System.out.println("Valor mínimo de los int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo de los int: " + Integer.MAX_VALUE);
        System.out.println("Tamaño de int en bytes: " + Integer.BYTES);
        System.out.println("Tamaño de int en bits: " + Integer.SIZE);

        // ------------------------------------------------------------
        // 🔸 long → Enteros grandes
        long valorLong = 769L; // se recomienda usar sufijo 'L'
        System.out.println("Valor long = " + valorLong);

        // ------------------------------------------------------------
        // 🔸 float → Números decimales de precisión simple
        // Nota: debe llevar la letra 'f' o 'F' al final
        float valorFloat = 34.5f;
        System.out.println("Valor float = " + valorFloat);

        // ------------------------------------------------------------
        // 🔸 double → Números decimales de doble precisión
        double valorDouble = 34.5;
        System.out.println("Valor double = " + valorDouble);

        // ------------------------------------------------------------
        // 🔸 char → Caracteres individuales (letra, símbolo, número)
        // Usa comillas simples: ' '
        char valorChar = 'J';
        System.out.println("Valor char = " + valorChar);

        // ------------------------------------------------------------
        // 🔸 boolean → Valores lógicos (true / false)
        boolean valorBoolean = false;
        System.out.println("Valor boolean = " + valorBoolean);


        // ============================================================
        // 🔹 TIPO NO PRIMITIVO: String
        // ============================================================
        // Es un objeto que representa una cadena de texto.
        // Usa comillas dobles: " "
        String valorString = "Esto es una cadena de texto";
        System.out.println(valorString);

    }

}
