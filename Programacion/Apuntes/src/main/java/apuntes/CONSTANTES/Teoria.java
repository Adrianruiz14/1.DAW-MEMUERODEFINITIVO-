package apuntes.CONSTANTES;

public class Teoria {

    // Declaración de una constante
    public static final double PI = 3.14159;
    public static final int MAX_INTENTOS = 5;
    public static final String MENSAJE_BIENVENIDA = "¡Bienvenido a la aplicación!";

    public static void main(String[] args) {

        // Uso de constantes en el código
        System.out.println("Valor de PI: " + PI);
        System.out.println("Máximos intentos permitidos: " + MAX_INTENTOS);
        System.out.println(MENSAJE_BIENVENIDA);

    }

}


class Configuracion {
    
    // Constantes para configuración
    public static final String URL_BASE = "https://api.ejemplo.com/";
    public static final int TIEMPO_CONEXION = 5000; // 5000 milisegundos
    public static final boolean USAR_LOGS = true;

    public static void mostrarConfiguracion() {
        
        System.out.println("URL Base: " + URL_BASE);
        System.out.println("Tiempo de conexión: " + TIEMPO_CONEXION + " ms");
        System.out.println("¿Usar logs? " + (USAR_LOGS ? "Sí" : "No"));

    }
    
    public static void main(String[] args) {

        mostrarConfiguracion();

    }

}


