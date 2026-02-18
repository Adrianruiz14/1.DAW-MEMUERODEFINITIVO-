// ================================================================
// 📘 OPERACIONES ARITMÉTICAS, RELACIONALES Y LÓGICAS EN JAVA
// ================================================================
// 🔹 Aprenderás:
//    - Operaciones básicas (+, -, *, /, %)
//    - Problemas comunes con división entera
//    - Operadores relacionales y lógicos
//    - Métodos útiles de la clase Math
// ================================================================

public class OperacionesAritmeticas {

    public static void main(String[] args) {

        // ============================================================
        // 🔸 OPERACIONES ARITMÉTICAS BÁSICAS
        // ============================================================
        int num1 = 100;
        int num2 = 201;

        // Suma
        int suma = num1 + num2;
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de sumar " + num1 + " más " + num2 + " es " + suma);

        // Resta
        int resta = num1 - num2;
        System.out.println("La resta es: " + resta);

        // Multiplicación
        int multiplicacion = num1 * num2;
        System.out.println("La multiplicación es: " + multiplicacion);

        // División
        int division = num2 / num1;
        System.out.println("La división es: " + division);

        // ------------------------------------------------------------
        // ⚠️ Cuidado con las divisiones entre enteros
        // ------------------------------------------------------------
        int a = 5;
        int b = 2;
        double c = a / b; // División entera → 5/2 = 2, sin decimales
        System.out.println("Resultado de 5 / 2 (entero): " + c);

        // ✅ Para obtener decimales:
        double c2 = a / (double) b;
        System.out.println("Resultado de 5 / 2 (decimal): " + c2);

        // ------------------------------------------------------------
        // ⚠️ División entre cero
        // ------------------------------------------------------------
        b = 0;
        // System.out.println("División entre 0: " + (a / b)); // ❌ Error en tiempo de ejecución: ArithmeticException


        // ============================================================
        // 🔸 OPERADORES RELACIONALES
        // ============================================================
        System.out.println("\n--- Operadores Relacionales ---");
        int x = 5, y = 3;

        System.out.println("x != y → " + (x != y));  // true, 5 no es igual a 3
        System.out.println("x == y → " + (x == y));  // false, 5 no es igual a 3
        System.out.println("x >= y → " + (x >= y));  // true, 5 es mayor que 3
        System.out.println("x <= y → " + (x <= y));  // false, 5 no es menor o igual a 3


        // ============================================================
        // 🔸 OPERADORES LÓGICOS
        // ============================================================
        System.out.println("\n--- Operadores Lógicos ---");
        boolean p = true;
        boolean q = false;

        // Negación
        System.out.println("!p → " + (!p));  // false

        // AND lógico (&&)
        System.out.println("p && q → " + (p && q));  // false, ambos deben ser true

        // OR lógico (||)
        System.out.println("p || q → " + (p || q));  // true, basta con uno true

        // Ejemplo combinado
        System.out.println("(p && !q) → " + (p && !q));  // true


        // ============================================================
        // 🔸 OPERADOR MÓDULO (%)
        // ============================================================
        System.out.println("\n--- Operador Módulo ---");
        int resto = 10 % 3;
        System.out.println("10 % 3 = " + resto);  // Resultado: 1 (porque 10 / 3 = 3 y sobra 1)


        // ============================================================
        // 🔸 MÉTODOS DE LA CLASE Math
        // ============================================================
        System.out.println("\n--- Métodos de la clase Math ---");
        double num = 5.3;
        System.out.println("Math.ceil(" + num + ") → " + Math.ceil(num));   // Redondea hacia arriba → 6.0
        num = 5.7;
        System.out.println("Math.floor(" + num + ") → " + Math.floor(num)); // Redondea hacia abajo → 5.0
        num = 5.5;
        System.out.println("Math.round(" + num + ") → " + Math.round(num)); // Redondea al más cercano → 6


        // ============================================================
        // 🔸 RESUMEN DE OPERADORES
        // ============================================================
        System.out.println("\n--- Resumen ---");
        System.out.println("Operadores aritméticos: +, -, *, /, %");
        System.out.println("Operadores relacionales: >, <, >=, <=, ==, !=");
        System.out.println("Operadores lógicos: &&, ||, !");

    }
    
}
