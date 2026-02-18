package apuntes.UT03.ESTRUCTURASdeCONTROL;

import java.util.Scanner;

public class EstructurasdeSeleccion {
    public static void main(String[] args) {
        
        // Saber si un numero es multiplo de 10
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();

        // Saber si un numero es multiplo de 10
        // de esta forma me sirve por si voy a usar el dato mas adelante, creo la variable y ya la puedo usar despues
        int resto = numero%10;
        if (resto == 0) {
            // Codigo si condicion es true
            System.out.println("Es divisible por 10");
        }
        
        // otra manera, dependiendo si mas adelante vamos a usar el resto o no, en este caso es solo para hacer la condicion, sin crear variable
        if (numero%10 == 0) {
            System.out.println("Es divisible por 10");
        }

        // Saber si una hora tiene formato correcto 24h
        System.out.println("Introduce las horas: ");
        int horas = teclado.nextInt();
        System.out.println("Introduce los minutos: ");
        int minutos = teclado.nextInt();
        System.out.println("Introduce los segundos: ");
        int segundos = teclado.nextInt();

        // ESTRUCTURAS ANIDADAS
        if (horas >= 0 && horas <= 23) {
            // Tengo seguro de que las horas son validas
            System.out.println("Las horas son válidas");
            
            // Tengo seguro de que las horas y los minutos son validos
            if (minutos >= 0 && minutos <= 59) {
                System.out.println("Los minutos son validos");

                if (segundos >= 0 && segundos <= 59) {
                    System.out.println("Todos los datos son validos");
                }

            }            

        }

        // Todas las condiciones en un if
        if ((horas >= 0 && horas <= 23)&&(minutos >= 0 && minutos <= 59)&&(segundos >= 0 && segundos <= 59)) {
            System.out.println("Los datos son correctos");
        } else {
            System.out.println("Algun dato no es correcto");
        }


        // ESTRUCTURAS APILADAS
        if (horas >= 0 && horas <= 23) {
            System.out.println("Las horas son correctas");
        } else {
            System.out.println("Las horas no son correctas");
        }

        if (minutos >= 0 && minutos <= 59) {
            System.out.println("Los minutos son correctos");
        } else {
            System.out.println("Los minutos no son correctos");
        }

        if (segundos >= 0 && segundos <= 59) {
            System.out.println("Los segundos son correctos");
        } else {
            System.out.println("Los segundos no son correctos");
        }

    }
}