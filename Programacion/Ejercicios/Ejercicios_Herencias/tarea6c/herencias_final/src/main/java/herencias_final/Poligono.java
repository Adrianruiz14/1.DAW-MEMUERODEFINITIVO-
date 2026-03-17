package herencias_final;

public abstract class Poligono extends Figura{

    private int base;
    private int altura;
    private int numeroLados;


    public Poligono(int id, String color, int base, int altura, int numeroLados) {
        super(id, color);
        this.base = base;
        this.altura = altura;
        this.numeroLados = numeroLados;
    }

    


    @Override
    public String toString() {
        return "Poligono [base=" + base + ", altura=" + altura + ", numeroLados=" + numeroLados + "]";
    }




    public int getBase() {
        return base;
    }


    public void setBase(int base) {
        this.base = base;
    }


    public int getAltura() {
        return altura;
    }


    public void setAltura(int altura) {
        this.altura = altura;
    }


    public int getNumeroLados() {
        return numeroLados;
    }


    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    

    



}
