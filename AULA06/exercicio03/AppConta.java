package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class AppConta {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int escolha;
        int numeroConta;
        double limite;
        double valorSaque;
        double valorDeposito;

        
        // criação de um Array para criação das contas correntes (várias contas)
        GerenciaConta contas = new GerenciaConta();
        

        do {
            System.out.println("--------Sistema de Contas--====--");
            System.out.println("Escolha sua Opção: ");
            System.out.println("1 - Abrir uma Conta Corrente ");
            System.out.println("2 - Abrir uma Conta Especial ");
            System.out.println("3 - Abrir uma Conta Poupança ");
            System.out.println("4 - Consultar saldo de conta");
            System.out.println("5 - Realizar Saque");
            System.out.println("6 - Realizar Depósito");
            System.out.println("7 - Sair");
            System.out.println("->");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o numero da conta: ");
                    numeroConta = teclado.nextInt();
                    contas.novaContaCorrente(numeroConta);
                    break;

                case 2:
                    System.out.println("Digite o numero da conta especial: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Digite o limete da conta");
                    limite = teclado.nextDouble();
                    contas.novaContaEspecial(numeroConta, limite);

                    break;

                case 3:
                    System.out.println("Criando um anova conta poupança");
                    numeroConta = teclado.nextInt();
                    contas.novaContaPoupanca(numeroConta);

                    break;
                case 4:
                    System.out.println("Digite o numero da conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println(contas.exibirSaldo(numeroConta));

                    break;

                case 5: // Função saque
                    System.out.println("Digite o numero da conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Digite o valor de saque: ");
                    valorSaque = teclado.nextDouble();

                    if(contas.sacar(numeroConta, valorSaque)){
                        System.out.println("Operação realizada");
                    } else{
                        System.out.println("Falha na operacao;");
                    }

                    break;

                case 6: // Função deposito
                    System.out.println("Digite o numero da conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Digite o valor do despoito: ");
                    valorDeposito = teclado.nextDouble();

                    if(contas.depositar(numeroConta, valorDeposito)){
                        System.out.println("Operação realizada");
                    } else{
                        System.out.println("Falha na operação");
                    }
                    break;

            }

        } while (escolha != 7);

        teclado.close();

    }

}
