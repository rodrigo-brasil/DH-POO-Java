package Aula20.MesaCarrinho;

import java.sql.SQLOutput;

public class Carregando implements  Estado{
    Carrinho carrinho;

    public Carregando(Carrinho c){
        carrinho = c;
    }

    @Override
    public void addProduto(String produto) {
        carrinho.setProdutos(produto);
    }

    @Override
    public void retornar() {
        carrinho.setEstado(new Vazio(carrinho));
        System.out.println("Carrinho Vazio!");
    }

    @Override
    public void Cancelar() {
        carrinho.setEstado(new Vazio(carrinho));
        System.out.println("Carrinho vazio");
    }

    @Override
    public void ProximoEstado() {
        carrinho.setEstado(new Pagando(carrinho));
        System.out.println("Indo para pagamento!");
    }
}
