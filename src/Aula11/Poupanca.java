package Aula11;

public class Poupanca extends Conta {

    double taxajuros;

    @Override
    public void saque(double valor) {
        if (valor >= 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque feito com sucesso!");
        } else {
            System.out.println("Valor indisponivel");
        }
    }

    @Override
    public void extrato() {
        System.out.println("Seu saldo Atual é : " + getSaldo() + " \n Seu dinheiro rende :" + taxajuros);
    }
}
