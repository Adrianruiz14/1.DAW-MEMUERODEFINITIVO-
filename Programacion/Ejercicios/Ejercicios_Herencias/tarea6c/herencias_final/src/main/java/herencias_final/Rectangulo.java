package herencias_final;

public final class Rectangulo extends Poligono implements Dibujable, Movible {

     private Point point;

     public Rectangulo(int id, String color, int base, int altura, int numeroLados, Point point) {
        super(id, color, base, altura, numeroLados);
        this.point = point;
    }

     public Point getPoint() {
         return point;
     }

     public void setPoint(Point point) {
         this.point = point;
     }

     

     @Override
    public String toString() {
        return "Rectangulo [point=" + point + "]";
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
     public void dibujar() {
         System.out.println("Dibujando rectángulo [id=" + getId() + ", color=" + getColor() + ", base=" + getBase() + ", altura=" + getAltura() + "] en punto (" + point.getX() + ", " + point.getY() + ")");
     }

    @Override
    public double area() {
        return getBase() * getAltura();
    }

    }