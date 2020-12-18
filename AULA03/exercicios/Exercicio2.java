package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero, cont = 0;

        System.out.println("Digite um numero: ");
        numero = teclado.nextInt();

        while (cont <= 10) {
            System.out.println(numero + " x " + cont + " = " + numero * cont);
            cont++;
        }

        teclado.close();
    }

}
