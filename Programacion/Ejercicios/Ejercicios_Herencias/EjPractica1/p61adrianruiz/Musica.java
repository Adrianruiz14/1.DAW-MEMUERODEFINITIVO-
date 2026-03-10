package p61adrianruiz;

public final class Musica extends Producto{

    protected String grupo;

    public Musica(int codigo, double precio, double iva, String descripcion, String grupo) {
        super(codigo, precio, iva, descripcion);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Musica [grupo=" + grupo + "]";
    }

    
    

}
