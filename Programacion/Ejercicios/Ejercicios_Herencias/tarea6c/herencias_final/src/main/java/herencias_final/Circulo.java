package herencias_final;

public class Circulo extends Figura implements Movible, Dibujable {

    private int longitudRadio;

    private Point point;

    
    public Circulo(int id, String color, int longitudRadio, Point point) {
        super(id, color);
        this.longitudRadio = longitudRadio;
        this.point = point;
    }

    public int getLongitudRadio() {
        return longitudRadio;
    }

    public void setLongitudRadio(int longitudRadio) {
        this.longitudRadio = longitudRadio;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    

    @Override
    public String toString() {
        return "Circulo [longitudRadio=" + longitudRadio + ", point=" + point + "]";
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando círculo: id=" + getId() + ", color=" + getColor() + ", radio=" + longitudRadio);
    }

    @Override
    public void moverIzqui(int x) {
        this.point.setX(this.point.getX() - x);
    }

    @Override
    public void moverDerecha(int x) {
        this.point.setX(this.point.getX() + x);
    }

    @Override
    public void moverArriba(int y) {
        this.point.setY(this.point.getY() + y);
    }

    @Override
    public void moverAbajo(int y) {
        this.point.setY(this.point.getY() - y);
    }

    @Override
    public double area() {
        return Math.PI * longitudRadio * longitudRadio;
    }

}
