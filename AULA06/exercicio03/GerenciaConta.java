package exercicio03;

import java.util.ArrayList;

public class GerenciaConta {

    private ArrayList<Conta> listaContas;

    public GerenciaConta() {

        listaContas = new ArrayList<>();

    }

    public void novaContaCorrente(int numeroConta) {

        listaContas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroContaEspecial, double limite) {
        listaContas.add(new ContaEspecial(numeroContaEspecial, limite));
    }

    public void novaContaPoupanca( int numeroContaPoupaca){
        listaContas.add(new ContaPoupanca(numeroContaPoupaca));
    }

    public String exibirSaldo(int numeroConta){

        for (Conta conta : listaContas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta.toString();
            }
        }
        return "Conta não encontrada";
    }

    public boolean sacar(int numeroConta, double valor){

        for (Conta conta : listaContas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta.sacar(valor);
            }
            
        }return false;


        

    }

    public boolean depositar (int numeroConta, double valor){
        for (Conta conta : listaContas) {
            if (conta.getNumeroConta() == numeroConta) {
               return conta.depositar(valor);
            }
        }
        return false;
    }
    
}