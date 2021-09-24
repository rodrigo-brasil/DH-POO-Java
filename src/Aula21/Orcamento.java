package Aula21;

public class Orcamento implements Estado {
    private Reparo reparo;

    public Orcamento(Reparo reparo) {
        this.reparo = reparo;
    }

    @Override
    public void mudarEndereco(String novoEdereco) {
        System.out.println("não é possivel fazer isso nesse estado!");
    }

    @Override
    public void darOrcamento(double base) {
        reparo.setCusto(base);
    }

    @Override
    public void adicionarExtra(double extra) {
        System.out.println("não é possivel fazer isso nesse estado!");
    }

    @Override
    public void estadoSeguinte() {
        reparo.setEstado(new EmReparo(reparo));
    }

    @Override
    public String toString() {
        return "Orçamento";
    }
}
