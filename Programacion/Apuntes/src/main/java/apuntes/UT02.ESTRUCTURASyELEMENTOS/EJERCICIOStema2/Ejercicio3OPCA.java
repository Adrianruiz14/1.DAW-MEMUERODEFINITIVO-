package EJERCICIOStema2;

import java.util.Scanner;

public class Ejercicio3OPCA {
    
    // Pedir al usuario: el nº de grupos que tiene un instituto.
    // Cada grupo tiene 30h semanales.  (Hay que usar Math. (ceil, floor, round))
    // Cada profesor puede dar como máx. 18h/semana.
    // Calcular el numero de profes que necesito a la semana en el instituto.

    public static void main(String[] args) {

        // Constante = variable que no puede cambiar de valor una vez inicializada. Debo usar 'final'
        final int NUMERO_HORAS_PROFESOR = 18;
        // NUMERO_HORAS_PROFESOR = 20; esto daría error

        // Inicializo el scanner
        Scanner teclado = new Scanner(System.in);
        
        // Le pido al usuario por teclado el número de grupos
        System.out.print("Introduce el número de grupos en el instituto: ");
        int numeroDeGrupos = teclado.nextInt(); 
        System.out.println("Has introducido " + numeroDeGrupos);
        
        // Cada grupo tiene 30 horas semanales
        int horasPorGrupo = numeroDeGrupos * 30;
        System.out.println("El total de horas a cubrir es: " + horasPorGrupo);
        
        // Cada profesor puede dar como máximo 18 horas a la semana
        double numeroProfesores = Math.ceil((double)horasPorGrupo / NUMERO_HORAS_PROFESOR);
        System.out.println("El total de profes es: " + numeroProfesores);

        
    }
}
