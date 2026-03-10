package p61adrianruiz;

public abstract class Producto {

    protected int codigo;
    protected double precio;
    protected double iva;
    protected String descripcion;

    public Producto(int codigo, double precio, double iva, String descripcion) {
        this.codigo = codigo;
        this.precio = precio;
        this.iva = iva;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("codigo=").append(codigo);
        sb.append(", precio=").append(precio);
        sb.append(", iva=").append(iva);
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Producto other = (Producto) obj;
        if (codigo != other.codigo) return false;
        if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio)) return false;
        if (Double.doubleToLongBits(iva) != Double.doubleToLongBits(other.iva)) return false;
        if (descripcion == null) {
            if (other.descripcion != null) return false;
        } else if (!descripcion.equals(other.descripcion)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        long temp;
        temp = Double.doubleToLongBits(precio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(iva);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        return result;
    }

}
