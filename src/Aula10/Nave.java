package Aula10;

import java.util.Objects;

public class Nave extends Objeto {

    private double velocidade;
    private int vida;


    public Nave(int x, int y, char dir, double velocidade, int vida) {
        super(x, y, dir);
        this.velocidade = velocidade;
        this.vida = vida;
    }

    @Override
    public void irA(int x, int y, char dir) {
        super.irA(x,y,dir);
       int atualX = getPosx();
       int atualY = getPosy();
       if(atualX != x || atualY != y){
           if(atualX > x) {
               setPosx((int) Math.floor(atualX - velocidade));
           }else {
               setPosx((int) Math.floor(atualX + velocidade));
           }
           if(atualY > y) {
               setPosy((int) Math.floor(atualY - velocidade));
           }else {
               setPosy((int) Math.floor(atualY + velocidade));
           }
       }

    }

    public void girar( char dir){
        super.setDir(dir);
    }

    public int restaVida(int valor){
        return vida-valor;
    }

    @Override
    public String toString() {
        return "Nave{" +
                "velocidade=" + velocidade +
                ", vida=" + vida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nave)) return false;
        Nave nave = (Nave) o;
        return Double.compare(nave.velocidade, velocidade) == 0 && vida == nave.vida;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), velocidade, vida);
    }
}
