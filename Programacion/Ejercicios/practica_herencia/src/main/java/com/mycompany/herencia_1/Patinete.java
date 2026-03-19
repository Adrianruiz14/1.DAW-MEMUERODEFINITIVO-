/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_1;

public final class Patinete implements Vehiculo {
    @Override
    public void acelerar(double velocidad) {
        System.out.println("El patinete acelera a " + velocidad + " km/h");
    }
}
