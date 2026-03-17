package herencias_final;

public final class Triangulo extends Poligono{

    private Point point;

    public Triangulo(int id, String color, int base, int altura, int numeroLados, Point point) {
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
        return "Triangulo [point=" + point + "]";
    }

    @Override
    public double area() {
       return getBase() * getAltura() / 2 ;
    }

    



    

    







    



    

}
