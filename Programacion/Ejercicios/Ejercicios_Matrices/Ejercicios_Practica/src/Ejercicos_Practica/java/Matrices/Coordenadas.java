package matrices;

public class Coordenadas {

    private int i, j;

    public Coordenadas(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Coordenadas [i=" + i + ", j=" + j + "]";
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    } 
    
}
