package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int pares = 0;
        int impar = 0;
        double somaPares = 0;
        int numero;
        int porcentoImpar = 0;
        double media;

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite um numero: ");
            numero = teclado.nextInt();

            if (numero % 2 == 0) {
                pares++;
                somaPares = somaPares + numero;

            }else{
                impar++;
            }
           
        }
       
        System.out.println("A media de pares é: "+ ((double)somaPares / pares));
        System.out.println("A porcentagem de ímpares é: " + ((double) impar/10));

        teclado.close();
    }

}
