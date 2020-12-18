package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 1;
        int soma = 0;

        while (numero != 0) {

            System.out.println("Digite um numero: ");
            numero = teclado.nextInt();
            soma = numero + soma;
        }
        System.out.println("A soma é: " + soma);
        teclado.close();
    }

}
