package Aula20.MesaCarrinho;

public class Vazio implements Estado {
    Carrinho carrinho;

    public Vazio(Carrinho c) {
        carrinho = c;
        carrinho.resetarProdutos();
    }

    @Override
    public void addProduto(String produto) {
        carrinho.setEstado(new Carregando(carrinho));
        carrinho.setProdutos(produto);

    }

    @Override
    public void retornar() {
        System.out.println("Voltar pra onde?");
    }

    @Override
    public void Cancelar() {
        System.out.println("Vazio!");
    }

    @Override
    public void ProximoEstado() {
        carrinho.setEstado(new Carregando(carrinho));
    }
}
