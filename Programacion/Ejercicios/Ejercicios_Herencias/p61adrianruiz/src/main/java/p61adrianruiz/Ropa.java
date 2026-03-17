package p61adrianruiz;

public abstract class Ropa extends Producto implements SeEnvia {

    protected String marca;

    public Ropa(int codigo, double precio, double iva, String descripcion, String marca) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Ropa [marca=" + marca + "]";
    }

}
