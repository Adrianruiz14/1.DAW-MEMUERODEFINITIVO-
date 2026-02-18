package apuntes.ATAJOS;

import javax.swing.JCheckBox;

import javax.swing.JOptionPane;

public class JOptionPaneEjemplo {
    
    public static void main(String[] args) {
        
        // Se importa la clase: javax.swing.JOptionPane;

        /* CONSTANTES */
        // Gracias a las CONSTANTES, podemos ponerle titulo a la ventana de error que le solicitamos al usuario.
        // Estas variantes las podemos aplicar a cualquiera de los tipos.
           
            /* ERROR_MESSAGE
             * INFORMATION_MESSAGE
             * WARNING_MESSAGE
             * QUESTION_MESSAGE
             * PLAIN_MESSAGE...
             */
        
        // EJ: Para la ventana de advertencia tan solo debemos escribir el siguiente código: (la diferencia con el anterior es que le adicionamos 2 parámetros mas...)
            
            JOptionPane.showMessageDialog(null, "Este es un mensaje de Advertencia", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);


        /* TIPOS */

        // JOptionPane.showMessageDialog.
        // Nos genera una ventana de dialogo, con la cual podemos presentar al usuario un mensaje simple. EJ:
            
            JOptionPane.showMessageDialog(null,"Es un mensaje Simple de Información"); // El 2º parámetro (x, este) es el mensaje que queremos presentar.

        

        // JOptionPane.showInputDialog.
        // Sirve para solicitar el ingreso de datos, por defecto presenta una ventana simple similar a las anteriores pero con un campo de texto para ingresar información.......
        // Por defecto podemos obtener el dato ingresado mediante un String, sin embargo podemos recibir datos numéricos y posteriormente hacer la conversión. EJ:

            int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un" + " numero para multiplicarlo por 2"));

        // EJ2:

            Object color = JOptionPane.showInputDialog(null,"Seleccione Un Color", "COLORES", JOptionPane.QUESTION_MESSAGE, null,
            new Object[] { "Seleccione","Amarillo", "Azul", "Rojo" },"Seleccione");
        


        // JOptionPane.showConfirmDialog.
        /* Nos muestra una ventana de confirmación donde por defecto se cargan 3 botones "Si", "No", "Cancelar".
         * Es muy útil cuando realizamos operaciones delicadas donde siempre es importante que el usuario confirme.
         * También es muy común encontrarla cuando queremos cerrar sesión o salir de nuestra aplicación por medio de un evento determinado. EJ: */

            int resp=JOptionPane.showConfirmDialog(null,"Usas mucho el JOptionPane?");
            if (JOptionPane.OK_OPTION == resp){
                System.out.println("Selecciona opción Afirmativa");
            } else {
                System.out.println("No selecciona una opción afirmativa");
            }   // Le podemos aplicar las siguientes constantes: YES_OPTION, NO_OPTION, OK_OPTION, CANCEL_OPTION, CLOSED_OPTION



            // JOptionPane.showOptionDialog.
            // Es un único método que posee todos los parámetros requeridos para su configuración. EJ:

                JCheckBox chec=new JCheckBox("Prueba");
      
                int seleccion = JOptionPane.showOptionDialog( null,"Seleccione una opcion", "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,// null para icono por defecto.
                new Object[] { "opcion 1", "opcion 2", "opcion 3",chec },"opcion 1");
                    
                if (seleccion != -1){
                        System.out.println("seleccionada opcion " + (seleccion + 1));
                }
                if (chec.isSelected()){
                    System.out.println("Selecciona el Chec");
                }

            // Nos crea una ventana de dialogo con diferentes opciones definidas en un array de objetos.
            // Podemos pasarle diferentes componentes gráficos y el los mostrará sin inconveniente....


    }

    public static String showInputDialog(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showInputDialog'");
    }

}
