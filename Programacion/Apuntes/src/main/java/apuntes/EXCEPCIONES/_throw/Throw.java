package apuntes.EXCEPCIONES._throw;

public class Throw {
    
    public static void main(String[] args) {

        try {

            int edad = -5;

            if (edad < 0) {

                throw new IllegalArgumentException("La edad no puede ser negativa.");
                
            }

            System.out.println("La edad es: " + edad);

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}
