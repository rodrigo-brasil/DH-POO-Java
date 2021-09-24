package Aula21;

public class Finalizado implements Estado {
    private Reparo reparo;

    public Finalizado(Reparo reparo) {
        this.reparo = reparo;
    }

    @Override
    public void mudarEndereco(String novoEdereco) {
        System.out.println("não é possivel fazer isso nesse estado!");
    }

    @Override
    public void darOrcamento(double base) {
        System.out.println("não é possivel fazer isso nesse estado!");
    }

    @Override
    public void adicionarExtra(double extra) {
        System.out.println("não é possivel fazer isso nesse estado!");
    }

    @Override
    public void estadoSeguinte() {
        System.out.println("Finalizado");
    }
    @Override
    public String toString() {
        return "Finalizado";
    }
}
