import javax.swing.JOptionPane;

public class EjercicioNuPrimo {
    
    public static void main(String[] args) {

        // Pedir número al usuario con una ventana de entrada
        String num = JOptionPane.showInputDialog(null, "Introduce un número entero:");

        // Convertir el texto introducido a número entero
        int numero;

        try {
            numero = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "❌ Debes introducir un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Comprobar si es primo
        String mensaje;
        if (numero <= 1) {
            mensaje = "El número " + numero + " NO es primo (los primos son mayores que 1).";
        } else {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                mensaje = "El número " + numero + " SÍ es primo.";
            } else {
                mensaje = "El número " + numero + " NO es primo.";
            }
        }

        // Mostrar resultado en una ventana
        JOptionPane.showMessageDialog(null, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
