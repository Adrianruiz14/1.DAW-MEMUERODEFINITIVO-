package ejercicio12_herencias;

import java.util.Random;

public abstract class Cuenta extends Cliente {
    public Random random = new Random();
    protected int[] numeroCuenta;
    protected double saldo;
    protected Cliente cliente = new Cliente(getNombre(), getApellido1(), getApellido2(), getDni());
    public abstract void retirar();
    public abstract void actualizarSaldo();



    public Cuenta(String nombre, String apellido1, String apellido2, String dni, int[] numeroCuenta, double saldo,
            Cliente cliente) {
        super(nombre, apellido1, apellido2, dni);
        this.numeroCuenta = rellenar_NumeroCuenta(numeroCuenta);
        this.saldo = 0;
        this.cliente = cliente;
    }
  
    public int[] getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int[] numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int[] rellenar_NumeroCuenta(int[] numeroCuenta){

        int[] numeroCuenta_rellenado = new int[20];

        for (int i = 0; i < numeroCuenta_rellenado.length; i++) {

            numeroCuenta_rellenado[i] = random.nextInt(0, 9);
            
        }

        return numeroCuenta_rellenado;
    }



}
