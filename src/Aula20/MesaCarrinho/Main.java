package Aula20.MesaCarrinho;

public class Main {
    public static void main(String[] args) {
        Carrinho compras = new Carrinho();

        compras.addProduto("Pão");
        compras.proximoEstado();
        compras.proximoEstado();
        compras.proximoEstado();
        compras.proximoEstado();
    }
}
