/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_1;

import java.util.Objects;

public abstract class VehiculoAereo implements Vehiculo {
    protected double velocidad;
    protected double altitud;
    protected String modelo;

    public VehiculoAereo(String modelo) {
        this.modelo = modelo;
        this.velocidad = 0;
        this.altitud = 0;
    }

    public void mostrarModelo() {
        System.out.println("Modelo: " + modelo);
    }

    public abstract boolean despegar(double altitud);

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Velocidad: " + velocidad + ", Altitud: " + altitud;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VehiculoAereo)) return false;
        VehiculoAereo that = (VehiculoAereo) o;
        return Double.compare(that.velocidad, velocidad) == 0 &&
               Double.compare(that.altitud, altitud) == 0 &&
               Objects.equals(modelo, that.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(velocidad, altitud, modelo);
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getAltitud() {
        return altitud;
    }
}