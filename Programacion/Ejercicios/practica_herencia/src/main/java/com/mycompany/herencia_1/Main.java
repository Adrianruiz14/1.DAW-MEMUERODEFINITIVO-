/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Lista de VehiculoAereo
        List<VehiculoAereo> vehiculosAereos = new ArrayList<>();
        vehiculosAereos.add(new Avion("Boeing 737", 150));
        vehiculosAereos.add(new Avion("Airbus A320", 180));
        vehiculosAereos.add(new Helicoptero("Apache"));
        vehiculosAereos.add(new Helicoptero("Bell 206"));
        vehiculosAereos.add(new Helicoptero("HOLA"));

        // Mostrar datos
        for (VehiculoAereo va : vehiculosAereos) {
            System.out.println(va);
        }

        // Vehiculo tipo patinete
        Vehiculo v = new Patinete(); // Conversión implícita
        v.acelerar(25); // Método polimórfico

        // Lista de Vehiculo con todos
        List<Vehiculo> vehiculos = new ArrayList<>(vehiculosAereos); // Conversión implícita
        vehiculos.add(v);

        // Acelerar a 100 y mostrar velocidad si es aereo
        System.out.println("Acelerar con los vehiculos y mostrar aereos");
        for (Vehiculo ve : vehiculos) {
            ve.acelerar(100); // Método polimórfico
            if (ve instanceof VehiculoAereo) {
                System.out.println(((VehiculoAereo) ve).modelo   +" Velocidad actual: " + ((VehiculoAereo) ve).getVelocidad()); // Conversión explícita
            }
        }

        System.out.println("\nIntentar despegar y mostrar altitud\n");
        // Intentar despegar y mostrar altitud
        for (Vehiculo ve : vehiculos) {
            if (ve instanceof VehiculoAereo) {
                VehiculoAereo va = (VehiculoAereo) ve; // Conversión explícita
                va.despegar(100);
                System.out.println(((VehiculoAereo) ve).modelo + " Altitud después de despegar: " + va.getAltitud());
            }
        }

        // Filtrar solo aviones
        List<Avion> aviones = new ArrayList<>();
        for (Vehiculo ve : vehiculos) {
            if (ve instanceof Avion) {
                aviones.add((Avion) ve); // Conversión explícita
            }
        }

        // Orden natural
        Collections.sort(aviones);
        System.out.println("Aviones ordenados por número de pasajeros:");
        aviones.forEach(System.out::println);

        // Ordenar por velocidad y altitud
        aviones.sort(Comparator
                .comparingDouble(Avion::getVelocidad)
                .thenComparingDouble(Avion::getAltitud));
        System.out.println("Aviones ordenados por velocidad y altitud:");
        aviones.forEach(System.out::println);
    }
}
