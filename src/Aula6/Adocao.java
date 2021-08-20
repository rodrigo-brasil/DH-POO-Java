package Aula6;

import java.util.Calendar;

public class Adocao {

    private String nome;
    private String raca;
    private double peso;
    private int anoNasc;
    private boolean possuiChip;
    private boolean estaFerido;


    Adocao(String nome, String raca, double peso, int anoNasc) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.anoNasc = anoNasc;
    }

    Adocao(String nome, String raca, double peso, int anoNasc, boolean possuiChip, boolean estaFerido) {
        this(nome, raca, peso, anoNasc);
        this.possuiChip = possuiChip;
        this.estaFerido = estaFerido;
    }

    public boolean estaAptoAdocao() {
        return (peso > 5 && !estaFerido);
    }

    public int getIdade(){
        return Calendar.getInstance().get(Calendar.YEAR) - anoNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public boolean PossuiChip() {
        return possuiChip;
    }

    public void setPossuiChip(boolean possuiChip) {
        this.possuiChip = possuiChip;
    }

    public boolean EstaFerido() {
        return estaFerido;
    }

    public void setEstaFerido(boolean estaFerido) {
        this.estaFerido = estaFerido;
    }


}
