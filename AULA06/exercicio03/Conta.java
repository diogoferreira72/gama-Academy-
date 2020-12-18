package exercicio03;

public abstract class Conta {
    private int numeroConta;
    private double saldo;

    public Conta() {

    }

    public Conta(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double qtdDeposito) {
        if (qtdDeposito > 0) {
           saldo = saldo + qtdDeposito;
           return true;
        }
        return false;

    }

    public boolean sacar(double valorSaque) {
        if (valorSaque > 0) {
            saldo = saldo - valorSaque;
            return true;
        }
        return false;

    }

    public String toString() {
        return "Numero da CC: " + numeroConta + " Saldo: " + saldo;
    }

}
