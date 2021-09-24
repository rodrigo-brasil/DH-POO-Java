package Aula21;

public class EmReparo implements Estado{
    private Reparo reparo;

    public EmReparo(Reparo reparo) {
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
        reparo.addCusto(extra);
    }

    @Override
    public void estadoSeguinte() {
        reparo.setEstado(new Envio(reparo));
    }
    @Override
    public String toString() {
        return "Reparação";
    }
}
