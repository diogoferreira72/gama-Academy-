package exercicio03;

public class ContaCorrente extends Conta {
    final double TAXA_DEPOSITO = 0.1;
    
    public ContaCorrente(int numeroConta){
        super(numeroConta);
                           
    }

    @Override
    public boolean sacar(double valorSaque) {
        if(valorSaque <= getSaldo()){
            return super.sacar(valorSaque);
        } 
        return false;
    }
    
    @Override
    public boolean depositar(double valorDeposito) {
       return super.depositar(valorDeposito - TAXA_DEPOSITO);
    }
}
