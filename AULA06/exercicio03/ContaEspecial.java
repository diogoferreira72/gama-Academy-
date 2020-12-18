package exercicio03;

public class ContaEspecial  extends Conta{
    double limite;

    public ContaEspecial(int numeroConta, double limite){
        super(numeroConta);
        this.limite = limite;

    }
    
    @Override
    public boolean sacar(double valorSaque) {
        if(valorSaque <= getSaldo()+limite){
           return super.sacar(valorSaque);
        }
        return false;
    }

}
