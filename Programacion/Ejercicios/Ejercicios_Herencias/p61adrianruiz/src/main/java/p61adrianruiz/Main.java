package p61adrianruiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        productos.add(new LibroDigital(1, 15.99, 0.21, "Novela de ciencia ficción Adrian aprobando",
                "978-1-234567-89-0", 2048));
        productos.add(new LibroDigital(2, 12.50, 0.21, "Guía de programación para mi", "978-1-234567-90-6", 3072));

        productos.add(new LibroPapel(3, 18.99, 0.21, "Historia de España basado en memuero", "978-1-234567-91-3", 320));
        productos.add(new LibroPapel(4, 22.50, 0.21, "Me muero con esto", "978-1-234567-92-0", 512));

        productos.add(new Pantalon("M", 0, 0, 0, null, null));
        productos.add(new Pantalon("A", 0, 0, 0, null, null));

        productos.add(new Musica(7, 56.9, 0.21, "Disco de BTS", "BTS"));
        productos.add(new Musica(8, 21.9, 0.21, "Disco de Los Chunguitos", "Los Chunguitos"));

        productos.sort((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()));
        // p1, p2 = variables temporable que pillan el precio del primer producto y del
        // segundo para compararlos y luego ordenar la lista por precio
        // Si quiero que sea de mayor a menor, intercambia las posiciones de p1 y p2 y
        // ya

        System.out.println("Lista de productos:");
        for (Producto bucle_Producto : productos) {
            System.out.println(bucle_Producto.toString()); // Ns si es así, no veo la diferencia
        }

        productos.sort((p1, p2) -> Double.compare(p1.getCodigo(), p2.getCodigo()));
        System.out.println("Lista de productos:");
        for (Producto bucle_Producto : productos) {
            System.out.println(bucle_Producto.toString()); // Ns si es así, no veo la diferencia
        }

        // El toString es un metodo polimórifico
        /*
         * Sobrescritura (Override): Cada clase (como tu clase Libro) puede darle su
         * propia "forma" al método. Tú has decidido que el toString() de un Libro
         * devuelva el ISBN, pero el toString() de una Factura podría devolver el
         * importe total.
         *
         * Invocación dinámica: Java decide en tiempo de ejecución qué versión del
         * método ejecutar dependiendo del objeto real que tenga entre manos.
         */
        // ahora buscamos mediante búsqueda binaria
        // A. Buscamos un producto que SÍ existe (por ejemplo, el código 3)
        int codigoExistente = 3;
        // Creamos un objeto "molde" que solo necesita el código para comparar

        Producto moldeExistente = new LibroPapel(codigoExistente, 0, 0, "", "", 0);

        int posEncontrado = Collections.binarySearch(productos, moldeExistente,
                (p1, p2) -> Integer.compare(p1.getCodigo(), p2.getCodigo()));

        System.out.println("Buscando código " + codigoExistente + "...");
        if (posEncontrado >= 0) {
            System.out.println("-> ¡Encontrado! Está en la posición: " + posEncontrado);
        } else {
            System.out.println("-> No encontrado.");
        }

        // B. Buscamos un producto que NO existe (por ejemplo, el código 99)
        int codigoInexistente = 99;
        Producto moldeInexistente = new LibroPapel(codigoInexistente, 0, 0, "", "", 0);

        int posNoEncontrado = Collections.binarySearch(productos, moldeInexistente,
                (p1, p2) -> Integer.compare(p1.getCodigo(), p2.getCodigo()));

        System.out.println("\nBuscando código " + codigoInexistente + "...");
        if (posNoEncontrado >= 0) {
            System.out.println("-> Encontrado en posición: " + posNoEncontrado);
        } else {
            // Si es negativo, no existe.
            System.out.println("-> El producto no existe en la lista. Resultado de la búsqueda: " + posNoEncontrado);
        }

        /*
         * El Comparador: Fíjate que en la lambda ahora usamos Integer.compare en lugar
         * de Double.compare, porque el código es un número entero (int).
         * 
         * El Objeto Molde: Como LibroPapel (o LibroDigital) hereda de Producto, podemos
         * usarlo para crear un objeto rápido que contenga el código que queremos
         * buscar. Los demás datos (precio, iva, etc.) los ponemos a 0 o "" porque no
         * nos importan para esta búsqueda.
         * 
         * La Posición Negativa: Cuando buscas el código 99, verás que posNoEncontrado
         * devuelve un número como -9 o similar.
         * 
         * ¿Por qué? Java te está diciendo:
         * "No lo he encontrado, pero si lo fueras a insertar para que la lista siguiera ordenada, tendrías que ponerlo en la posición X"
         * .
         * 
         * Resumen de la lógica:
         */
        // recolectar todos los libros en una lista aparte
        List<Libro> libros_recolectados = new ArrayList<>();
        for (Producto p : productos) {
            if (p instanceof Libro) {
                libros_recolectados.add((Libro) p);
            }
        }
        System.out.println("\nLista de libros extraída de productos:");
        for (Libro l : libros_recolectados) {
            System.out.println(l.toString());
        }

        libros_recolectados.sort(null); // No entiendo por qué no me carga

    }
}
