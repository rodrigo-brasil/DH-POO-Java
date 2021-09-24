package Aula20.MesaCarrinho;

import java.util.ArrayList;

public class Carrinho {

    private Estado estado;
    private ArrayList<String> produtos = new ArrayList<>();

    public void Carrinho(){
        estado = new Vazio(this);
    }

    public void addProduto(String produto){
        estado.addProduto(produto);

    }

    public void retornar(){
        estado.retornar();
    }

    public void Cancelar(){
        estado.Cancelar();

    }

    public void proximoEstado(){
        estado.ProximoEstado();
    }

    public Estado getEstado() {
        return estado;
    }


    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setProdutos(String produtos) {
        this.produtos.add(produtos);
    }

    public void resetarProdutos(){
        produtos.clear();
    }
}
