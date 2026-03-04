package matrices;

import javax.swing.JOptionPane;

public class ej3 {

    /*
     * Realiza un programa que permita gestionar los asientos de un avión. El avión
     * tendrá 30 filas y 6 columnas.
     * Se debe permitir reservar un asiento ("R"), o liberarlo ("L"), según su
     * identificador (1A, 3B...), que es un String.
     * Las butacas se identifican mediante su fila (1,2,3,4,5...30) y su columna (A,
     * B, C, D, E, F). A la hora de imprimir el estado de los asientos
     * hay que seguir el siguiente esquema:
     * A B C D ...
     * 1 L R L L
     * 2 R R R L
     * 3 ....
     */

    public static void main(String[] args) {

        // Establecer filas y columnas

        String[][] avion = new String[31][7]; // si hay una LETRA, no puede ser int, tendrá que ser String
        char asiento = 'A';

        // Llenamos las COLUMNAS con las letras
        for (int j = 1; j < avion[0].length; j++) {
            avion[0][j] = asiento + ""; // El + "" convierte el char a String automáticamente, -----MUY
                                        // IMPORTANTE--------
            // ¿POR QUÉ? el operador + y uno de los dos lados es un String, Java
            // automáticamente convierte el otro lado a texto.
            asiento++; // 'A' pasa a ser 'B', etc.
        }
        // Llenamos las filas
        for (int i = 1; i < avion.length; i++) {
            // Matriz es String = i no puede ser int,
            // TIENE QUE SER STRING ------IMPORTANTE----------
            avion[i][0] = i + "";

            // Rellenar el avión

            for (int j = 1; j < avion[i].length; j++) {
                avion[i][j] = "L";
            }
        }

        // Imprimir avión

        System.out.println("----------Estado Actual del Avión------------------------------");

        for (int i = 0; i < avion.length; i++) {
            for (int j = 0; j < avion[i].length; j++) {
                // Si el hueco está vacío (el [0][0]), imprimimos espacio
                if (avion[i][j] == null) {
                    System.out.print("\t"); // \t es para tabular
                } else {
                    System.out.print(avion[i][j] + "\t");
                }
            }
            System.out.println();
        }

          avion = menu(avion);
          System.out.println(" --------------Actualización---------------------");
           for (int i = 0; i < avion.length; i++) {
            for (int j = 0; j < avion[i].length; j++) {
                // Si el hueco está vacío (el [0][0]), imprimimos espacio
                if (avion[i][j] == null) {
                    System.out.print("\t"); // \t es para tabular
                } else {
                    System.out.print(avion[i][j] + "\t");
                }
            }
            System.out.println();
        }

    }

    public static String[][] menu (String[][] avion){

         // MENÚ
    String avionMenu[][] = avion;
    int eleccion = 0;
  
    do{

        String texto = """
                Bienvenido al Menú de reservas del vuelo X:
                ¿Qué desea hacer?
                1.Reservar asiento
                2.Anular asiento
                3.Salir
                """;
        String menu = JOptionPane.showInputDialog(null, texto);
        eleccion = Integer.parseInt(menu);

        if (menu == null) {
            break;
        }

        switch (eleccion) {

            case 1:

   try {

        String opcion1Fila = JOptionPane.showInputDialog("Dígame el número de fila (1-30)");
   
        int fila = Integer.parseInt(opcion1Fila);

        String letraColumna = JOptionPane.showInputDialog("Dígame su columna (A-F)").toUpperCase(); // toUpperCase es pasarlo a mayuscula automaticamente
  

        // Pasarlo de letra a numero, lo siento vico no se me ocurrió nada mejor

        int columna = 0;
        switch (letraColumna) {
            case "A" -> columna = 1;
            case "B" -> columna = 2;
            case "C" -> columna = 3;
            case "D" -> columna = 4;
            case "E" -> columna = 5;
            case "F" -> columna = 6;
            default -> columna = -1; // Letra no válida
        }

        if (columna != -1) {
            avionMenu[fila][columna] = "R";
            System.out.println("------ ASIENTO " + fila + letraColumna + " RESERVADO ------");
        } 

    } catch (NumberFormatException nfe) {
        JOptionPane.showMessageDialog(null, " En la fila debes poner un número.");
    } catch (ArrayIndexOutOfBoundsException aiobe) {
        JOptionPane.showMessageDialog(null, " Esa posición no existe en el avión.");
    }
    break;
           
            case 2:

       try {
        String opcion1Fila = JOptionPane.showInputDialog("Dígame el número de su fila reservada (1-30)");
     
        int fila = Integer.parseInt(opcion1Fila);

        String letraColumna = JOptionPane.showInputDialog("Dígame la letra de su columna reservada (A-F)").toUpperCase(); // toUpperCase es pasarlo a mayuscula automaticamente
   
        // Pasarlo de letra a numero, lo siento vico no se me ocurrió nada mejor
        int columna = 0;
        switch (letraColumna) {
            case "A" -> columna = 1;
            case "B" -> columna = 2;
            case "C" -> columna = 3;
            case "D" -> columna = 4;
            case "E" -> columna = 5;
            case "F" -> columna = 6;
            default -> columna = -1; // Letra no válida
        }

        if (columna != -1) {
            avionMenu[fila][columna] = "L";
            System.out.println("------ ASIENTO " + fila + letraColumna + " NO RESERVADO ------");
        } else {
            JOptionPane.showMessageDialog(null, "La columna " + letraColumna + " no existe.");
        }

    } catch (NumberFormatException nfe) {
        JOptionPane.showMessageDialog(null, " En la fila debes poner un número.");
    } catch (ArrayIndexOutOfBoundsException aiobe) {
        JOptionPane.showMessageDialog(null, " Esa posición no existe en el avión.");
    }    
                break;

            default:
                break;
        }

    }while(eleccion!=3);

    return avionMenu;

}

}
