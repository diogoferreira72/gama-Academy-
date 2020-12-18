package exemplos;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c;

        System.out.println("Informe o tamanho de A: ");
        a = teclado.nextInt();
        System.out.println("Informe o tamanho de B: ");
        b = teclado.nextInt();
        System.out.println("Informe o tamanhos de C: ");
        c = teclado.nextInt();

        if (a > b + c || b > c + a || c > a + b) {
            System.out.println("Não é um triangulo");

        } else {

            if (a == b && b == c) {
                System.out.println("Triangulo equilátero");
            } else {
                if (a == b || b == c || a == c) {
                    System.out.println("Triangulo Isóceles");
                } else {
                    System.out.println("Triangulo Escaleno");
                }

            }

        }

        teclado.close();
    }

}
