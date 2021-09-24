package Aula11;

public class Corrente extends Conta {

    private double chequeEspecial;

    public Corrente(Double saldo, double chequeEspecial) {
        this(saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public Corrente(Double saldo) {
        super(saldo);
    }

    public Corrente() {
        super();
    }

    @Override
    public void saque(double valor) {
        if(valor >=0 && valor <= (chequeEspecial + this.getSaldo()))
            if(this.getSaldo() - valor < 0){
                double resto = valor - this.getSaldo();
                setSaldo(0);
                chequeEspecial -= resto;
            }else{
                setSaldo(getSaldo() - valor);
            }
    }

    @Override
    public void extrato() {
        System.out.println("Seu saldo Atual é : "+getSaldo()+ " \n Seu cueque especial é :"+ chequeEspecial);
    }

}
