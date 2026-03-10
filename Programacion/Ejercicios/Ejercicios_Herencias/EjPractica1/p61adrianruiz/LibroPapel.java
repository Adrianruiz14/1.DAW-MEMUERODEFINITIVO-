package p61adrianruiz;

public final class LibroPapel extends Libro{

    protected int numPaginas;

    

    public LibroPapel(int codigo, double precio, double iva, String descripcion, String isbn, int numPaginas) {
        super(codigo, precio, iva, descripcion, isbn);
        this.numPaginas = numPaginas;
    }



    public int getNumPaginas() {
        return numPaginas;
    }



    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }



    @Override
    public String toString() {
        return "LibroPapel [numPaginas=" + numPaginas + "]";
    }
    

    

    

}
