/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_1;

public class Helicoptero extends VehiculoAereo {
    private boolean ascendiendo;

    public Helicoptero(String modelo) {
        super(modelo);
        this.ascendiendo = false;
    }

    @Override
    public void acelerar(double velocidad) {
        if (altitud > 1000) {
            this.velocidad += velocidad;
        } else {
            System.out.println(Helicoptero.this.modelo + "No se ha alcanzado la altura mínima para acelerar.");
        }
    }

    @Override
    public boolean despegar(double altitud) {
        if (!ascendiendo) {
            ascendiendo = true;
            this.altitud = altitud;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Helicoptero -> Velocidad: " + velocidad + ", Altitud: " + altitud + ", Ascendiendo: " + ascendiendo;
    }

    public boolean isAscendiendo() {
        return ascendiendo;
    }
}
