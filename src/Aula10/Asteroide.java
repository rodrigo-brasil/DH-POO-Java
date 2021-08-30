package Aula10;

import java.util.Objects;

public class Asteroide extends Objeto{
    private int dano;

    public Asteroide(int x, int y, char dir, int dano) {
        super(x, y, dir);
        this.dano = dano;
    }

    @Override
    public void irA(int x, int y, char dir) {
        super.irA(x, y, dir);
    }

    @Override
    public String toString() {
        return "Asteroide{" +
                "dano=" + dano +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Asteroide)) return false;
        Asteroide asteroide = (Asteroide) o;
        return dano == asteroide.dano;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dano);
    }
}
