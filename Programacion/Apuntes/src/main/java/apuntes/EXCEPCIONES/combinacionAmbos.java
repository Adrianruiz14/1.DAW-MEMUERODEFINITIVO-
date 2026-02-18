package apuntes.EXCEPCIONES;

public class combinacionAmbos {

    public static void main(String[] args) {

        try {

            validarEdad(15);  // Prueba con una edad válida
            validarEdad(-1);  // Esto lanzará una excepción

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }

    public static void validarEdad(int edad) {

        if (edad < 0) {

            throw new IllegalArgumentException("La edad no puede ser negativa.");

        } else {

            System.out.println("Edad válida: " + edad);
            
        }

    }

}
