/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_1;

import java.util.Objects;

public final class Avion extends VehiculoAereo implements Comparable<Avion> {
    private int numeroPasajeros;

    public Avion(String modelo, int numeroPasajeros) {
        super(modelo);
        this.numeroPasajeros = numeroPasajeros;
    }
    

    @Override
    public void acelerar(double velocidad) {
        this.velocidad += velocidad;
    }

    @Override
    public boolean despegar(double altitud) {
        // si es 0 esta en tierra por lo que despega
        if (this.altitud == 0) {
            this.altitud = altitud;
            return true;
        }
        // si no es 0 no despega
        return false;
    }

    @Override
    public int compareTo(Avion otro) {
        return Integer.compare(this.numeroPasajeros, otro.numeroPasajeros);
    }

    @Override
    public String toString() {
        return "Avion -> Velocidad: " + velocidad + ", Altitud: " + altitud + ", Pasajeros: " + numeroPasajeros;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Avion)) return false;
        Avion avion = (Avion) o;
        return numeroPasajeros == avion.numeroPasajeros;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroPasajeros);
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }
}
