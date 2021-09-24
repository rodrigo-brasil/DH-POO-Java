package Aula21;

public class Main {

    public static void main(String[] args) {
        Reparo liquidificador = new Reparo("liquidificador");

        liquidificador.darOrcamento(50);
        liquidificador.estadoSeguinte();
        liquidificador.adicionarExtras(20);
        liquidificador.adicionarExtras(10);
        liquidificador.estadoSeguinte();
        liquidificador.mudarEndereco("rua: x, casa: 19");
        liquidificador.estadoSeguinte();

    }
}
