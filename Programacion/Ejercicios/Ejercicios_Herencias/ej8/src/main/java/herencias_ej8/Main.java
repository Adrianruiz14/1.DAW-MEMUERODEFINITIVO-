package herencias_ej8;

/* 
8.- Suponiendo la siguiente clase:
public abstract class Azar{
protected int posibilidades;
public abstract int lanzar();
}
Crea la clase Dado, especialización de la clase Azar. El método lanzar() de la clase Dado devolverá un número aleatorio entre 1 y 6.
Crea la clase Moneda, especialización de la clase Azar. El método lanzar() de la clase Moneda devolverá un número aleatorio entre 1 y 2. 

->Especialización es lo mismo que la herencia, añadir hijos al padre.
*/

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
      int lanzamiento_dado_Main;
      int lanzamiento_moneda_Main;
      Dado dado_Main = new Dado();
      Moneda moneda_Main = new Moneda();
      String eleccion = JOptionPane.showInputDialog("Quieres tirar un dado o una moneda");
      String eleccion_comosea = eleccion.toUpperCase();

      switch (eleccion_comosea) {
        case "DADO":
            lanzamiento_dado_Main = dado_Main.lanzar();
             JOptionPane.showMessageDialog(null, "Has sacado un " + lanzamiento_dado_Main);
            break;

        case "MONEDA":
            lanzamiento_moneda_Main = moneda_Main.lanzar();
             JOptionPane.showMessageDialog(null, "Has sacado un " + lanzamiento_moneda_Main);
            break;
      
        default:
            JOptionPane.showMessageDialog(null, "No has seleccionado una opción válida");
            break;
      }
    }
}