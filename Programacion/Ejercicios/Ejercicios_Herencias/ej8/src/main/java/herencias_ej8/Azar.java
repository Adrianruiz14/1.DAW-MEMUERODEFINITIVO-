package herencias_ej8;

import java.util.Random;

public abstract class Azar {
    public Random random = new Random();
    protected int probabilidades;

    public abstract int lanzar();
}