package p61adrianruiz;

public abstract class Ropa extends Producto implements SeEnvia {

    protected int codigo;
    protected double precio;
    protected double IVA;
    protected String descripcion;

    public Ropa(int codigo, double precio, double iva, String descripcion, int codigo2, double precio2, double iVA2,
            String descripcion2) {
        super(codigo, precio, iva, descripcion);
        codigo = codigo2;
        precio = precio2;
        IVA = iVA2;
        descripcion = descripcion2;
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


    public double getIVA() {
        return IVA;
    }


    public void setIVA(double iVA) {
        IVA = iVA;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public String toString() {
        return "Ropa [codigo=" + codigo + ", precio=" + precio + ", IVA=" + IVA + ", descripcion=" + descripcion + "]";
    }

    @Override
    public void enviar(String Direccion) {
        System.out.println("Producto: " + this.toString() + ", Tipo: Ropa, Dirección de envío: " + Direccion);
    }

    
    




    
}



    


