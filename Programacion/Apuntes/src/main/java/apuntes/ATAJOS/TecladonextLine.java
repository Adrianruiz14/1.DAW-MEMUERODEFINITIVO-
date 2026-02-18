package apuntes.ATAJOS;

import java.util.Scanner;

public class TecladonextLine {

public class LimpiezaBufferScanner {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        
        // Limpiar el buffer (el salto de línea que queda después de nextInt())
        teclado.nextLine(); // Este nextLine() consume el salto de línea residual

        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();  // Ahora se puede leer correctamente el nombre
        
        System.out.println("Número: " + numero);
        System.out.println("Nombre: " + nombre);
        
    }

}

}
