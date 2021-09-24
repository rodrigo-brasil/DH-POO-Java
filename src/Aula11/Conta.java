package Aula11;

public abstract class Conta {
    private double saldo;

    public Conta(Double saldo) {
        this.saldo = saldo;
    }

    public Conta() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        if (valor >= 0)
            saldo += valor;
    }

    public abstract void saque(double valor);

    public abstract void extrato();
}
