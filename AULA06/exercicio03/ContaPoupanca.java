package exercicio03;

public class ContaPoupanca extends Conta {
    final double TAXA_OPERACAO = 2;

    public ContaPoupanca(int numeroConta) {
        super(numeroConta);
    }

    @Override
    public boolean sacar(double valorSaque) {

        if (getSaldo() + TAXA_OPERACAO > 0) {
            return super.sacar(valorSaque+TAXA_OPERACAO);
        }
        return false;
    }   

}
