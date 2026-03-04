package herencias_ej8;
    
public class Moneda extends Azar {

        public int lanzar(){
        int lanzamiento_dado = random.nextInt(1, 3);
        return lanzamiento_dado;
    }

}


