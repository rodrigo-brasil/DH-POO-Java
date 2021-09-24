package Aula19;

public class TesteFabricaCarro {
    public static void main(String[] args) {
       FabricaDeCarroSingleton fabrica = FabricaDeCarroSingleton.getInstance();

        System.out.println(fabrica.criarCarroFiat());
        System.out.println(fabrica.criarCarroFiat());
        System.out.println(fabrica.gerarRelatorio());
    }
}
