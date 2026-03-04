package ejercicio11_herencias;

public class Triangulo extends Figura {

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    public double area() {
        return getAltura() * getBase() / 2;

    }

}
