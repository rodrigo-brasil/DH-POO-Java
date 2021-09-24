package Aula11;

public class Cliente {

    private int numeroCliente;
    private String sobrenome;
    private String cpf;
    private Conta conta;

    public Cliente(int numeroCliente, String sobrenome, String cpf, Conta conta) {
        this.numeroCliente = numeroCliente;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.conta = conta;
    }
}
