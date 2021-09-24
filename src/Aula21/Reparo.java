package Aula21;

public class Reparo {

    private Estado estado;

    private String nomeItem;
    private String endereco;
    private double custo;

    public Reparo(String item){
        nomeItem = item;
        estado = new Orcamento(this);
        endereco = "Sem endereço cadastrado";
    }

    public Reparo(String item, String endereco){
        this(item);
        this.endereco = endereco;
    }

    public void mudarEndereco(String novoEndereco){
        estado.mudarEndereco(novoEndereco);
    }

    public  void darOrcamento(double base){
        if(base > 0)
        estado.darOrcamento(base);
        else
            System.out.println("valor invalido!");
    }

    public void adicionarExtras(double extra){
        if(extra > 0)
            estado.adicionarExtra(extra);
        else
            System.out.println("Valor invalido!");
    }

    public void estadoSeguinte(){
        System.out.println(toString());
        estado.estadoSeguinte();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void addCusto(double custo) {
        this.custo += custo;
    }

    @Override
    public String toString() {
        return "Produto: " + nomeItem + ", em: " + estado.toString() + ", Custo: "+ custo + ", Envio para: " + endereco;
    }
}
