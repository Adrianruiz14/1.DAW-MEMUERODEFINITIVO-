package ejercicio12_herencias;

import javax.swing.JOptionPane;

public class CuentaAhorro extends Cuenta {
    protected double tipo_variable;
    protected double comision;

        public CuentaAhorro(String nombre, String apellido1, String apellido2, String dni, int[] numeroCuenta, double saldo,
            Cliente cliente, double tipo_variable, double comision) {
        super(nombre, apellido1, apellido2, dni, numeroCuenta, saldo, cliente);
        this.tipo_variable = tipo_variable;
        this.comision = comision;
    }

        public void actualizarSaldo(){
        double saldo = getSaldo();

        public void retirar(){
        double saldo = getSaldo();
        String saldo_restar_texto = JOptionPane.showInputDialog(null, "Usted tiene " + saldo + " ¿Cuánto deseas retirar");
        int saldo_restar = Integer.parseInt(saldo_restar_texto);

        int saldo_actual = saldo - saldo_restar;
        
        }
    }





}
