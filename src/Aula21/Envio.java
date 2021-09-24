package Aula21;

public class Envio implements Estado {
    private Reparo reparo;

    public Envio(Reparo reparo) {
        this.reparo = reparo;
    }

    @Override
    public void mudarEndereco(String novoEdereco) {
        reparo.setEndereco(novoEdereco);
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
        reparo.setEstado(new Finalizado(reparo));
    }
    @Override
    public String toString() {
        return "Pronto para envio";
    }
}
