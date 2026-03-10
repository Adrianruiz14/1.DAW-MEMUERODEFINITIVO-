package p61adrianruiz;

public final class Pantalon extends Ropa {

    protected String talla;
  

    public Pantalon(int codigo, double precio, double iva, String descripcion, String talla) {
        super(codigo, precio, iva, descripcion, codigo, precio, iva, descripcion);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pantalon{");
        sb.append("talla=").append(talla);
        sb.append('}');
        return sb.toString();
    }

}
