package Aula20.MesaCarrinho;

public class Fechado implements Estado{

    Carrinho carrinho;

    public Fechado(Carrinho c){
        carrinho = c;
    }

    @Override
    public void addProduto(String produto) {
        System.out.println("Não aceita novos produtos!");
    }

    @Override
    public void retornar() {
        System.out.println("Carrinho fechado");
    }

    @Override
    public void Cancelar() {
        carrinho.setEstado(new Vazio(carrinho));
        System.out.println("Carrinho vazio");
    }

    @Override
    public void ProximoEstado() {
        carrinho.setEstado(new Vazio(carrinho));
        System.out.println("Carrinho vazio");
    }
}
