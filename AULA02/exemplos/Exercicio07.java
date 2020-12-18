package exemplos;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double salario;

        System.out.println("Digite o salario: ");
        salario = teclado.nextDouble();

        if (salario > 2000.00) {
            System.out.println("30%");
        } else {
            if (salario < 600.00) {
                System.out.println("Isento");

            } else {

                if (salario > 1200) {
                    System.out.println("25%");

                } else {

                    System.out.println("20%");
                }
            }
        }
        teclado.close();
    }

}
