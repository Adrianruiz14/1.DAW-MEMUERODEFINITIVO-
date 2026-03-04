package herencias_ej8;

public class Dado extends Azar {

    public int lanzar(){
        int lanzamiento_dado = random.nextInt(1, 7);
        return lanzamiento_dado;
    }

}