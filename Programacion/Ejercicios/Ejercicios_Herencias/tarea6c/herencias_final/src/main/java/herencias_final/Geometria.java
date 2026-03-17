package herencias_final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Geometria {
    public static void main(String[] args) {
        // 1) Conjunto de figuras (Set) y 2 de cada tipo
        Set<Figura> conjuntoFiguras = new HashSet<>();
        conjuntoFiguras.add(new Circulo(1, "rojo", 3, new Point(0, 0)));
        conjuntoFiguras.add(new Circulo(2, "azul", 5, new Point(1, 2)));
        conjuntoFiguras.add(new Rectangulo(3, "verde", 4, 6, 4, new Point(0, 0)));
        conjuntoFiguras.add(new Rectangulo(4, "amarillo", 2, 8, 4, new Point(2, 3)));
        conjuntoFiguras.add(new Triangulo(5, "rojo", 5, 4, 3, new Point(1, 1)));
        conjuntoFiguras.add(new Triangulo(6, "azul", 6, 4, 3, new Point(2, 2)));

        // 2) Foreach con datos y área
        System.out.println("--- Figuras en el conjunto ---");
        for (Figura f : conjuntoFiguras) {
            System.out.println("id=" + f.getId() + ", color=" + f.getColor() + ", area=" + f.area());
        }

        // 3) Lista a partir del conjunto
        List<Figura> listaFiguras = new ArrayList<>(conjuntoFiguras); // conversión implícita a Collection<Figura>

        // 4) Ordenar por id con Comparator + lambda
        listaFiguras.sort(Comparator.comparingInt(Figura::getId));
        System.out.println("--- Figuras ordenadas por id ---");
        listaFiguras
                .forEach(f -> System.out.println("id=" + f.getId() + ", color=" + f.getColor() + ", area=" + f.area()));

        // 5) Búsqueda binaria por id
        int idBusqueda = 4;
        int pos = Collections.binarySearch(listaFiguras, new Figura(idBusqueda, "") {
            @Override
            public double area() {
                return 0;
            }
        }, Comparator.comparingInt(Figura::getId));
        if (pos >= 0) {
            System.out.println("Figura con id=" + idBusqueda + " encontrada en posición " + pos);
        } else {
            System.out.println("Figura con id=" + idBusqueda + " no encontrada (pos " + pos + ")");
        }

        // 6) Ordenar por color, y si color igual, por id.
        listaFiguras.sort(Comparator.comparing(Figura::getColor).thenComparingInt(Figura::getId));
        System.out.println("--- Figuras ordenadas por color y id ---");
        listaFiguras
                .forEach(f -> System.out.println("id=" + f.getId() + ", color=" + f.getColor() + ", area=" + f.area()));

        // 7) Filtrar Dibujables y Movibles
        List<Dibujable> dibujables = new ArrayList<>();
        List<Movible> movibles = new ArrayList<>();

        for (Figura f : listaFiguras) {
            if (f instanceof Dibujable) {
                dibujables.add((Dibujable) f); // casting explícito
            }
            if (f instanceof Movible) {
                movibles.add((Movible) f); // casting explícito
            }
        }

        // 8) Llamar dibujar de cada Dibujable
        System.out.println("--- Dibujables ---");
        for (Dibujable d : dibujables) {
            d.dibujar();
        }

        // 9) Mover Movibles: rectángulos +2 x, círculos +3 y
        System.out.println("--- Moviendo Movibles ---");
        for (Movible m : movibles) {
            if (m instanceof Rectangulo) {
                ((Rectangulo) m).moverDerecha(2); // cast explícito
            }
            if (m instanceof Circulo) {
                ((Circulo) m).moverArriba(3); // cast explícito
            }
        }

        // Estado tras mover
        listaFiguras.forEach(f -> {
            if (f instanceof Movible) {
                System.out.println("Movible actualizado -> id=" + f.getId() + ", punto=("
                        + ((f instanceof Rectangulo) ? ((Rectangulo) f).getPoint().getX()
                                : ((Circulo) f).getPoint().getX())
                        + ", " + ((f instanceof Rectangulo) ? ((Rectangulo) f).getPoint().getY()
                                : ((Circulo) f).getPoint().getY())
                        + ")");
            }
        });

        // 10) Map de Figura -> Área
        Map<Figura, Double> mapaArea = mapaFiguraArea(conjuntoFiguras);
        System.out.println("--- Mapa Figura -> Área ---");
        mapaArea.forEach((figura, area) -> System.out.println("id=" + figura.getId() + ", area=" + area));
    }

    public static Map<Figura, Double> mapaFiguraArea(Set<Figura> figuras) {
        Map<Figura, Double> resultado = new HashMap<>();
        for (Figura f : figuras) {
            resultado.put(f, f.area());
        }
        return resultado;
    }
}
