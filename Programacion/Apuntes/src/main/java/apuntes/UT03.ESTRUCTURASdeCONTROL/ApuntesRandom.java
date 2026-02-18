package apuntes.UT03.ESTRUCTURASdeCONTROL;

// Apuntes sobre Random en Java
// Importamos la clase Random del paquete java.util
import java.util.Random;

public class ApuntesRandom {

    public static void main(String[] args) {

        // 1️⃣ Crear un objeto de tipo Random
        Random random = new Random(); 

        // 2️⃣ Generar un número entero aleatorio (puede ser positivo o negativo)
        int numeroEntero = random.nextInt();
        System.out.println("Número entero aleatorio: " + numeroEntero);

        // 3️⃣ Número entero entre 0 y 9
        int numero0a9 = random.nextInt(10); // 0 inclusive, 10 exclusive
        System.out.println("Número aleatorio entre 0 y 9: " + numero0a9);

        // 4️⃣ Número decimal entre 0.0 y 1.0
        double numeroDecimal = random.nextDouble();
        System.out.println("Número decimal aleatorio (0.0 - 1.0): " + numeroDecimal);

        // 5️⃣ Número float entre 0.0 y 1.0
        float numeroFloat = random.nextFloat();
        System.out.println("Número float aleatorio (0.0 - 1.0): " + numeroFloat);

        // 6️⃣ Número long aleatorio
        long numeroLong = random.nextLong();
        System.out.println("Número long aleatorio: " + numeroLong);

        // 7️⃣ Boolean aleatorio (true o false)
        boolean valorBooleano = random.nextBoolean();
        System.out.println("Boolean aleatorio: " + valorBooleano);

        // 8️⃣ Número aleatorio en un rango específico, por ejemplo entre 5 y 15
        int min = 5;
        int max = 15;
        int numeroRango = random.nextInt(max - min + 1) + min; 
        System.out.println("Número aleatorio entre " + min + " y " + max + ": " + numeroRango);

        // 9️⃣ Generar un decimal entre 0 y X, por ejemplo 0 a 50
        double decimalHasta50 = random.nextDouble() * 50;
        System.out.println("Número decimal aleatorio entre 0 y 50: " + decimalHasta50);

        // 🔹 Usar semilla para reproducibilidad
        Random randomConSeed = new Random(12345); // Siempre generará los mismos números
        System.out.println("Número con semilla: " + randomConSeed.nextInt(100));

        // ✅ Fórmula general para un rango [min, max]:
        // random.nextInt(max - min + 1) + min
    }
}
