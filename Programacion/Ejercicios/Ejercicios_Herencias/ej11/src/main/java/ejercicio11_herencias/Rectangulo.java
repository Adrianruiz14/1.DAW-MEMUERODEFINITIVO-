package ejercicio11_herencias;

public class Rectangulo extends Figura {
    
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    public  double area() {
        return getAltura() * getBase();

    }

}
