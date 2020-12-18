package exercicios;

import java.util.Scanner;

public class Exercicio4{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            double salarioMinimo;
            double kilowat;
            double custoKilowat;
            double conta;
            double contaDesconto;

            System.out.println("Digite o slário mínimo: ");
            salarioMinimo = teclado.nextDouble();
            
            System.out.println("Digite a quantidade de Kilowatt consumida: ");
            kilowat = teclado.nextDouble();

            custoKilowat = salarioMinimo/500;
            conta = custoKilowat * kilowat;
            contaDesconto = conta * 0.15;

            System.out.println("O valor de cada kilowatt é: R$ " + custoKilowat);
            System.out.println("o Valor a ser pago é: R$ " + conta);
            System.out.println("o Valor a ser pago com desconto é: R$ " + (conta-contaDesconto) );

          teclado.close();

        



    }
    
}
