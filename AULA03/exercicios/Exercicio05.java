package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < 10; i++) {

            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }

        }
        System.out.println("Quantidade de Pares: " + contPar);
        System.out.println("Quantidade de Impares: " + contImpar);
        teclado.close();
    }
}
