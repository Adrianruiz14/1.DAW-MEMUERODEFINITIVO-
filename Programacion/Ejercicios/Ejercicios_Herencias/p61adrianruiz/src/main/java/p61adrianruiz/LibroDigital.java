package p61adrianruiz;

public final class LibroDigital extends Libro implements Descarga {

    protected int numKBytes;

    public LibroDigital(int codigo, double precio, double iva, String descripcion, String isbn, int numKBytes) {
        super(codigo, precio, iva, descripcion, isbn);
        this.numKBytes = numKBytes;
    }

    public int getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(int numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override
    public String toString() {
        return "LibroDigital [numKBytes=" + numKBytes + "]";
    }

    @Override
    public void descargar() {
        System.out.println("http://tunombre.daw/" + this.hashCode());
        // El hashCode lo que hace aquí es identificar como única la instancia para la memoria
    }

}
