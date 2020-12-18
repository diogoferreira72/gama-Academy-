package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int resultado = 1;

        System.out.println("Digite um numero: ");
        numero = teclado.nextInt();

        while (resultado <= numero) {

            System.out.print(resultado);

            if (resultado * 2 <= numero) {
                System.out.print(", ");
            }

            resultado *= 2;
        }

        teclado.close();
    }

}
