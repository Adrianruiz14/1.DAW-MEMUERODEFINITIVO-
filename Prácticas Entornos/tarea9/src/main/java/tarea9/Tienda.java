package tarea9;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {


    private static final double UMBRAL_DESCUENTO = 50.0;
    private static final double TASA_DESCUENTO = 0.90;
    private static final int UMBRAL_STOCK_BAJO = 3;

    private ArrayList<Producto> inventario;
    private Scanner sc;

    public Tienda() {
        inventario = new ArrayList<>();
        sc = new Scanner(System.in);
        cargarDatosPrueba();
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.iniciar();
    }


    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int op = sc.nextInt();
            
            switch (op) {
                case 1:
                    anadirProducto();
                    break;
                case 2:
                    mostrarInventario();
                    break;
                case 3:
                    realizarVenta();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }

    private void mostrarMenu() {
        System.out.println("\n--- TIENDA ---");
        System.out.println("1. Añadir producto");
        System.out.println("2. Mostrar inventario");
        System.out.println("3. Realizar venta");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void cargarDatosPrueba() {
        inventario.add(new Producto("Camiseta", 15.0, 10));
        inventario.add(new Producto("Pantalón", 30.0, 5));
        inventario.add(new Producto("Zapatos", 45.0, 2));
    }

    private void anadirProducto() {
        System.out.print("Nombre del producto: ");
        String nombre = sc.next();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        System.out.print("Stock inicial: ");
        int stock = sc.nextInt();
        
        inventario.add(new Producto(nombre, precio, stock));
        System.out.println("Producto añadido correctamente.");
    }

    private void mostrarInventario() {
        System.out.println("\n--- INVENTARIO ACTUAL ---");
        if (inventario.isEmpty()) {
            System.out.println("No hay productos.");
        } else {
            for (int i = 0; i < inventario.size(); i++) {
                System.out.println(i + ". " + inventario.get(i).toString());
            }
        }
    }


    private void realizarVenta() {
        System.out.println("\n--- VENTA ---");
        System.out.print("Introduzca nombre del producto a vender: ");
        String nombreProd = sc.next();
        
        Producto productoEncontrado = null;
        for (Producto p : inventario) {
            if (p.getNombre().equalsIgnoreCase(nombreProd)) {
                productoEncontrado = p;
                break;
            }
        }
        
        if (productoEncontrado != null) {
            System.out.println("Producto encontrado: " + productoEncontrado.getNombre());
            System.out.println("Precio: " + productoEncontrado.getPrecio() + "€ | Stock: " + productoEncontrado.getStock());
            System.out.print("Cantidad a comprar: ");
            int cant = sc.nextInt();
            
            if (productoEncontrado.getStock() >= cant) {
                double total = cant * productoEncontrado.getPrecio();
                
                if (total > UMBRAL_DESCUENTO) {
                    System.out.println("¡Oferta! Descuento aplicado por compra superior a " + UMBRAL_DESCUENTO + "€");
                    total = total * TASA_DESCUENTO; 
                }
                
                productoEncontrado.setStock(productoEncontrado.getStock() - cant);
                System.out.println("Venta realizada. Total a pagar: " + total + "€");
                

                registrarLog("Venta de " + cant + "x " + productoEncontrado.getNombre() + " registrada.");
                if (productoEncontrado.getStock() < UMBRAL_STOCK_BAJO) {
                    registrarLog("ALERTA DE STOCK BAJO para " + productoEncontrado.getNombre());
                }
                
            } else {
                System.out.println("Error: No hay suficiente stock.");
            }
        } else {
            System.out.println("Error: Producto no encontrado.");
        }
    }


    private void registrarLog(String mensaje) {
        System.out.println("[LOG SYSTEM]: " + mensaje);
    }
}