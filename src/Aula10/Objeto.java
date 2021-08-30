package Aula10;

import java.util.Objects;

public class Objeto {
    private int posx;
    private int posy;
    private char dir;

    public Objeto (int x , int y, char dir){
        posx = x;
        posy = y;
        this.dir = dir;
    }

    public void irA(int x, int y, char dir){
        setDir(dir);
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public int getPosy() {
        return posy;
    }

    public char getDir() {
        return dir;
    }

    public void setDir(char dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "posx=" + posx +
                ", posy=" + posy +
                ", dir=" + dir +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Objeto)) return false;
        Objeto objeto = (Objeto) o;
        return posx == objeto.posx && posy == objeto.posy && dir == objeto.dir;
    }

    @Override
    public int hashCode() {
        return Objects.hash(posx, posy, dir);
    }
}
