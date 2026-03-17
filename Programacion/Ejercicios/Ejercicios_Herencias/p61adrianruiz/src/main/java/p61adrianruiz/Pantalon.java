package p61adrianruiz;

public final class Pantalon extends Ropa {

    private String talla;

    public Pantalon(String talla, int codigo, double precio, double iva, String descripcion, String marca) {
        super(codigo, precio, iva, descripcion, marca);
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

    @Override
    public void enviar(String direccion) {
        System.out.println("Enviando pantalón talla " + talla + " a " + direccion);
    }
}
