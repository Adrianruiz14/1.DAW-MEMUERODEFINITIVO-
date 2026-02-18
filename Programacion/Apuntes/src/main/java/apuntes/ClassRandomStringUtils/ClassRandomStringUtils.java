package apuntes.ClassRandomStringUtils;

public class ClassRandomStringUtils {

    public static void main(String[] args) {
        
        // MÉTODOS PRINCIPALES (instancia) — (documentación)
        // Genera una cadena aleatoria de longitud exacta
        // String next(int count);

        // Genera cadena aleatoria de longitud exacta, especificando si puede incluir letras y/o dígitos
        // String next(int count, boolean letters, boolean numbers);

        // Genera cadena aleatoria de longitud exacta usando un arreglo dado de caracteres
        // String next(int count, char... chars);

        // Genera cadena aleatoria usando rango de caracteres definido + flags letters/numbers
        // String next(int count, int start, int end, boolean letters, boolean numbers);

        // Variante extendida: rango + flags + conjunto de chars personalizados
        // String next(int count, int start, int end, boolean letters, boolean numbers, char... chars);

        // Variante usando String como conjunto de caracteres
        // String next(int count, String chars);

        // Solo letras (alfabéticas), longitud fija
        // String nextAlphabetic(int count);

        // Solo letras (alfabéticas), longitud aleatoria entre min (inclusive) y max (exclusive)
        // String nextAlphabetic(int minLengthInclusive, int maxLengthExclusive);

        // Letras + dígitos (alfanumérico), longitud fija
        // String nextAlphanumeric(int count);

        // Letras + dígitos (alfanumérico), longitud aleatoria entre min (inclusive) y max (exclusive)
        // String nextAlphanumeric(int minLengthInclusive, int maxLengthExclusive);

        // Caracteres ASCII imprimibles (valores ASCII 32–126), longitud fija
        // String nextAscii(int count);

        // ASCII imprimible, longitud aleatoria entre min (inclusive) y max (exclusive)
        // String nextAscii(int minLengthInclusive, int maxLengthExclusive);

        // Caracteres “graph” — ASCII visibles excepto espacios/control, longitud fija
        // String nextGraph(int count);

        // Caracteres “graph”, longitud aleatoria entre min (inclusive) y max (exclusive)
        // String nextGraph(int minLengthInclusive, int maxLengthExclusive);

        // Solo dígitos (numéricos), longitud fija
        // String nextNumeric(int count);

        // Solo dígitos, longitud aleatoria entre min (inclusive) y max (exclusive)
        // String nextNumeric(int minLengthInclusive, int maxLengthExclusive);

        // Caracteres imprimibles (POSIX [:print:], incluye visibles + espacios), longitud fija
        // String nextPrint(int count);

        // Caracteres imprimibles, longitud aleatoria entre min (inclusive) y max (exclusive)
        // String nextPrint(int minLengthInclusive, int maxLengthExclusive);



        // Métodos “antiguos” / deprecated (estáticos) — (documentación)
        /* @Deprecated
        static String random(int count);

        @Deprecated
        static String random(int count, boolean letters, boolean numbers);

        @Deprecated
        static String random(int count, int start, int end, boolean letters, boolean numbers, char[] chars, Random random);

        @Deprecated
        static String random(int count, String chars);

        @Deprecated
        static String randomAlphabetic(int count);
        @Deprecated
        static String randomAlphabetic(int minLengthInclusive, int maxLengthExclusive);

        @Deprecated
        static String randomAlphanumeric(int count);
        @Deprecated
        static String randomAlphanumeric(int minLengthInclusive, int maxLengthExclusive);

        @Deprecated
        static String randomAscii(int count);
        @Deprecated
        static String randomAscii(int minLengthInclusive, int maxLengthExclusive);

        @Deprecated
        static String randomGraph(int count);
        @Deprecated
        static String randomGraph(int minLengthInclusive, int maxLengthExclusive);

        @Deprecated
        static String randomNumeric(int count);
        @Deprecated
        static String randomNumeric(int minLengthInclusive, int maxLengthExclusive);

        @Deprecated
        static String randomPrint(int count);
        @Deprecated
        static String randomPrint(int minLengthInclusive, int maxLengthExclusive);
        */



        // EJEMPLOS DE USO (comentados para evitar dependencias externas)
        // // Cadena alfanumérica (letras + dígitos), longitud 12
        // // String s1 = RandomStringUtils.secure().nextAlphanumeric(12);

        // // Solo letras, longitud 8
        // // String s2 = RandomStringUtils.secure().nextAlphabetic(8);

        // // Solo dígitos (por ejemplo, PIN), longitud 6
        // // String pin = RandomStringUtils.secure().nextNumeric(6);

        // // ASCII imprimible, longitud 15
        // // String s3 = RandomStringUtils.secure().nextAscii(15);

        // // Cadena con conjunto personalizado de caracteres
        // // String custom = RandomStringUtils.secure().next(10, 'A','B','C','1','2','3');

    }

}
