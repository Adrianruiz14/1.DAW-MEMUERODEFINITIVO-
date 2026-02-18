// ================================================================
// 📘 INFERENCIA DE TIPOS EN JAVA
// ================================================================
// 🔹 Tema: Uso de la palabra reservada 'var'
// 🔹 Desde Java 10, se permite declarar variables con 'var'.
// 🔹 El compilador INFIERA automáticamente el tipo de dato,
//    según el valor (literal) que se le asigne.
// ================================================================

package apuntes.UT01.INTRO;

public class InferenciaTipos {

    public static void main(String[] args) {

        // ------------------------------------------------------------
        // 🔸 ¿Qué es la inferencia de tipos?
        // ------------------------------------------------------------
        // Es la capacidad del compilador para determinar el tipo
        // de una variable en función del valor que se le asigna.
        // Ejemplo:
        //    var numero = 10;
        // El compilador entiende que 'numero' es un int.


        // ------------------------------------------------------------
        // 🔸 Uso de la palabra reservada 'var'
        // ------------------------------------------------------------
        // Reglas importantes:
        // 1️⃣ 'var' solo se puede usar dentro de métodos, bucles o bloques.
        // 2️⃣ No se puede declarar una variable 'var' sin inicializarla.
        //    Ejemplo:  var x;  ❌  → Error de compilación.
        // 3️⃣ Una vez inferido el tipo, la variable se comporta
        //    exactamente como si hubiera sido declarada con ese tipo.
        // 4️⃣ No cambia de tipo aunque se reasigne su valor.
        //    Ejemplo: si se infiere int, no se puede luego poner un double.


        // ------------------------------------------------------------
        // 🟢 Ejemplos de inferencia de tipos
        // ------------------------------------------------------------

        // Se infiere que es un 'int' (literal entero)
        var ocho = 8; 
        ocho = 10; // ✅ permitido (int → int)
        // ocho = 10.5; ❌ Error: ya fue inferido como int

        System.out.println("Tipo inferido para 'ocho' → int");
        System.out.println("Valor de ocho: " + ocho);

        // ------------------------------------------------------------
        // Se infiere un 'long'
        // Nota: los literales long deben llevar sufijo 'l' o 'L'
        var diez = 10L;
        System.out.println("Tipo inferido para 'diez' → long");
        System.out.println("Valor de diez: " + diez);

        // ------------------------------------------------------------
        // Se infiere un 'char' (por usar comillas simples)
        var letra = 'a';
        System.out.println("Tipo inferido para 'letra' → char");
        System.out.println("Valor de letra: " + letra);

        // ------------------------------------------------------------
        // Se infiere un 'float' (literal con sufijo 'f' o 'F')
        var valorFloat = 45.8f;
        System.out.println("Tipo inferido para 'valorFloat' → float");
        System.out.println("Valor de valorFloat: " + valorFloat);

        // ------------------------------------------------------------
        // Se infiere un 'double' (literal decimal por defecto)
        var valorDouble = 45.8;
        System.out.println("Tipo inferido para 'valorDouble' → double");
        System.out.println("Valor de valorDouble: " + valorDouble);

        // ------------------------------------------------------------
        // ⚠️ IMPORTANTE
        // ------------------------------------------------------------
        // - 'var' no es un tipo de dato, es una forma de declarar variables
        //   cuyo tipo se deduce automáticamente.
        // - No se puede usar 'var' para parámetros de métodos ni para campos de clase.
        // - No se recomienda abusar de 'var', ya que puede restar legibilidad al código.

    }
    
}
