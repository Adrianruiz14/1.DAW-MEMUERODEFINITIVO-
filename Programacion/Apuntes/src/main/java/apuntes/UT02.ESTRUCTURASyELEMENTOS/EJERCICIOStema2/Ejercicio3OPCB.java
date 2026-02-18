package EJERCICIOStema2;

import javax.swing.JOptionPane;

public class Ejercicio3OPCB {
    
    public static void main(String[] args) {
        
        final int NUMERO_HORAS_PROFESOR = 18;
        final int NUMERO_HORAS_GRUPO = 30;

        // Solicitar numero de grupos
        String numeroGrupos =
        JOptionPane.showInputDialog("Introduce el numero de grupos");

        // Pasar el 'String' a numero
        int numeroDeGruposnumero = Integer.parseInt(numeroGrupos);

        // Calculos
        int numeroTotalHoras = numeroDeGruposnumero * NUMERO_HORAS_GRUPO;
        double numeroProfesores = Math.ceil(numeroTotalHoras / NUMERO_HORAS_PROFESOR);
        
        // Solucion
        System.out.println("Numero de grupos: " + numeroGrupos);
        JOptionPane.showMessageDialog(null, "El numero de profesores necesarios es: " + numeroProfesores);

        // TEXT BLOCK
        String texto = "esto es un texto";
        String bloqueTexto = """
                Esto es un texto multilinea, que permite mostrar saltos de linea tabulaciones, etc y tambien valores de variables
                """;;

        String resultadoAlgoritmo = """
                En el IES Mar de Alboran, para dar clase a %s grupos se necesitan %s profesores
                """.formatted(numeroGrupos, numeroProfesores);
        
        System.out.println(resultadoAlgoritmo);

        



    }

}
