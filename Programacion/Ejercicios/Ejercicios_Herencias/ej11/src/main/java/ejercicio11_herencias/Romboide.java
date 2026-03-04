package ejercicio11_herencias;

public class Romboide extends Figura {

    public Romboide(double base, double altura) {
        super(base, altura);
    }

    public double area() {
        return getAltura() * getBase() / 2;

    }

}
