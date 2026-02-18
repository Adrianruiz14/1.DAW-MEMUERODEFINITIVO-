import java.util.Random;

import javax.swing.JOptionPane;

public class EjercicioBolitaDesc {
    
    /*
     * Hacemos un menu en el que sale de manera aleatoria una bolita.
     * Dependiendo del color de la bolita se te aplica un porcentaje de descuento:
     * Rojo - 15%
     * Naranja - 25%
     * Azul - 50%
     * Negro - NO hay descuento
     * Y luego la bolita que salga se le aplica el descuento al producto final (1000)
     */

    public static void main(String[] args) {
        // Precio del producto
        double precio = pedirPrecio();

        // Colores disponibles
        String[] colores = {"Rojo", "Naranja", "Azul", "Negro"};
        Random random = new Random();

        // Simulación de la ruleta
        JOptionPane.showMessageDialog(null, "Girando la ruleta...");
        String color = colores[random.nextInt(colores.length)];

        // Descuento según el color
        double descuento = 0;
        if (color.equals("Rojo")) descuento = 0.15;
        else if (color.equals("Naranja")) descuento = 0.25;
        else if (color.equals("Azul")) descuento = 0.50;
        else descuento = 0.0; // Negro

        // Cálculo del precio final
        double precioFinal = precio - (precio * descuento);

        // Mostrar resultado
        String mensaje = "¡La ruleta se detuvo!\n\n"
                + "Color obtenido: " + color
                + "\nDescuento aplicado: " + (descuento * 100) + "%"
                + "\n\nPrecio original: " + precio + " €"
                + "\nPrecio final: " + precioFinal + " €";

        JOptionPane.showMessageDialog(null, mensaje);
    }

    // Método simple para pedir el precio
    public static double pedirPrecio() {
        String texto = JOptionPane.showInputDialog("Introduce el precio del producto:");
        return Double.parseDouble(texto);

    }
    
}
