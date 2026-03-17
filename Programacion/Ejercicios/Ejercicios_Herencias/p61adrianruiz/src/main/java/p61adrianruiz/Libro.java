package p61adrianruiz;

public abstract class Libro extends Producto implements SeEnvia, Comparable<Libro> {

    protected String isbn;

    public Libro(int codigo, double precio, double iva, String descripcion, String isbn) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro [isbn=" + isbn + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        return true;
    }

    @Override
    public void enviar(String Direccion) {
        System.out.println("Producto: " + this.toString() + ", Tipo: Libro, Dirección de envío: " + Direccion);
        // Llama al método toString() que tienes definido unas líneas más arriba.
        // Imprimirá el ISBN del libro.
    }

    @Override
    public int compareTo(Libro otro) {
        return this.isbn.compareTo(otro.isbn);
        

        /*
         * El método compareTo siempre devuelve un número entero que sigue esta regla
         * universal en Java:
          
         * Número negativo: El objeto actual (this) va antes que el objeto comparado
         * (otro).
          
         * Cero (0): Ambos objetos son iguales en términos de orden.
         
         * Número positivo: El objeto actual (this) va después que el objeto comparado (otro).
         */
    }

}
