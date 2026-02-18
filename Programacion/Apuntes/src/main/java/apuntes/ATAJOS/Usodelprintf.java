package apuntes.ATAJOS;

public class Usodelprintf {
    
    public static void main(String[] args) {
        
        // USO del printf:
        // Si queremos mostrar el número 12.3698 de tipo double con 2 DECIMALES:

            System.out.printf("%.2f %n", 12.3698); // = 12,37

            double n = 0; int x = 0;

        /* 
         * El primer % indica que en esa posición se va a escribir un valor. 
         * El valor a escribir se encuentra a continuación de las comillas.
         * .2 indica el número de decimales.
         * La f indica que el número es de tipo float o double.
         * (%n o /n) indica un salto de línea. Con printf podemos usar ambos para hacer un salto de línea.
         */


        // Si queremos escribir el valor de n con 3 DECIMALES:

            n = 1.25036;
            System.out.printf("%.3f %n", n); // = 1,250

        /* 
         * El primer % indica que en esa posición se va a escribir un valor. 
         * El valor a escribir se encuentra a continuación de las comillas.
         * .3 indica el número de decimales.
         * La f indica que el número es de tipo float o double.
         * (%n o /n) indica un salto de línea. Con printf podemos usar ambos para hacer un salto de línea.
         */


        // Para mostrar el SIGNO + en un NÚMERO POSITIVO solamente:
            
            n = 1.25036;
            System.out.printf("%+.3f %n", n); // = +1,250

        /* 
         * El primer % indica que en esa posición se va a escribir un valor. 
         * El valor a escribir se encuentra a continuación de las comillas.
         * Se pone el signo (+) a continuacion.
         * .3 indica el número de decimales.
         * La f indica que el número es de tipo float o double.
         * (%n o /n) indica un salto de línea. Con printf podemos usar ambos para hacer un salto de línea.
         */


        // Si el número a mostrar es un ENTERO (int) se utiliza el caracter d:
         
            x = 10;
            System.out.printf("%d %n", x); // = 10

            // Para mostrarlo con signo (+):
            
                x = 10;
                System.out.printf("%+d %n", x); // = +10

       
        /* 
         * El primer % indica que en esa posición se va a escribir un valor. 
         * El valor a escribir se encuentra a continuación de las comillas.
         * Se pone el signo (+) a continuacion.
         * La d indica que el número es de tipo entero (int).
         * (%n o /n) indica un salto de línea. Con printf podemos usar ambos para hacer un salto de línea.
         */ 


        // Para mostrar VARIAS VARIABLES pondremos tantos % como valores vamos a mostrar. 
        // Las variables se escriben a continuación de las comillas separadas por comas:

            n = 1.25036;
            x = 10;
            System.out.printf("n = %.2f x = %d %n", n, x); // = n = 1,25 x = 10

        /* 
         * indicamos que nuestra variable (n) es = a: %.2f y que (x) es = a: %d
         * El primer % indica que en esa posición se va a escribir un valor. 
         * El valor a escribir se encuentra a continuación de las comillas.
         * Se pone en la (n) una f xq es de tipo double y en la (x) una d xq es de tipo int.
         * (%n o /n) indica un salto de línea. Con printf podemos usar ambos para hacer un salto de línea.
         */ 


        // Cuando hay VARIAS VARIABLES podemos indicar de cual de ellas es el VALOR a mostrar escribiendo 1$, 2$, 3$, ... 
        // indicando que el valor a mostrar es el de la 1ª variable que aparece a continuación de las comillas, de la 2ª, etc.
        // La instrucción anterior la podemos escribir así:
        
            System.out.printf("n = %1$.2f x = %2$d %n", n, x);

        /* Sólo tenemos que añadir el numero despues del % y luego nuestro tipo de valor (en este caso = $)  */


        // Si queremos mostrar el número 123.4567 y su CUADRO ambos con 2 DECIMALES debemos escribir:
          
            n = 123.4567;
            System.out.printf("El cuadrado de %.2f es %.2f\n", n, n*n); // = El cuadro de 123,46 es 15241,56
        
        /* Sólo tenemos que poner nuestro texto y luego la operacion. */


        // printf permite mostrar valores con un ANCHO DE CAMPO DETERMINADO. 
        // Por ejemplo, si queremos mostrar el contenido de n en un ancho de campo de 10 caracteres escribimos:

            n = 1.25036;
            System.out.printf("%+10.2f %n", n); // = bbbbb+1.25 (la b, indica un espacio en blanco, por cada b)
         
        // El 10 indica el TAMAÑO en caracteres que ocupará el número en pantalla. 
        // Se cuentan además de las cifras del número el punto decimal y el signo si lo lleva. 
        // En este caso el número ocupa un espacio de 5 caracteres (3 cifras, un punto y el signo) por lo tanto se añaden 5 espacios en blanco al principio para completar el tamaño de 10.


        // Si queremos que en lugar de espacios en blancos nos muestre el número completando el ancho con ceros escribimos:
            
            System.out.printf("%+010.2f %n", n); // = +000001.25 (sólo hay que añadir un 0 por delante del 10)


                    /* EJERCICIOS DE REPASO */
 
        /* Mostrar el número 1.22 en un ancho de campo de 10 caracteres y con dos decimales.

            double precio = 1.22;
            System.out.printf("%10.2f", precio); // = bbbbbb1.22 (el carácter b indica un espacio en blanco. El número ocupa un espacio total de 10 caracteres incluyendo el punto y los dos decimales.)

            
            Mostrar la cadena "Total:" con un ancho de 10 caracteres y alineada a la izquierda:
            
            System.out.printf("%-10s", "Total:"); // = Total:bbbb (El caracter s indica que se va a mostrar una CADENA de caracteres. El signo - indica alineación a la izquierda.)


            Mostrar la cadena "Total:" con un ancho de 10 caracteres y alineada a la derecha:

            System.out.printf("%10s", "Total:"); // =  bbbbTotal:
        */

    }

}
