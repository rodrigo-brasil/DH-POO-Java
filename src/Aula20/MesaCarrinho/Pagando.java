package Aula20.MesaCarrinho;

public class Pagando implements Estado{

    Carrinho carrinho;

    public Pagando(Carrinho c){
        carrinho = c;
    }

    @Override
    public void addProduto(String produto) {
        System.out.println("Não aceita novos produtos!");
    }

    @Override
    public void retornar() {
        carrinho.setEstado(new Carregando(carrinho));
        System.out.println("Voltando para Carregando!");
    }

    @Override
    public void Cancelar() {
        carrinho.setEstado(new Vazio(carrinho));
        System.out.println("Carrinho vazio");
    }

    @Override
    public void ProximoEstado() {
        carrinho.setEstado(new Carregando(carrinho));
        System.out.println("Voltando para Carregando!");
    }
}
