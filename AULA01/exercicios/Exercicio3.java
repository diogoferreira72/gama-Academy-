package exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario;
        double salarioAjustado;

        System.out.println("Digite o seu salário ");
        salario = teclado.nextDouble();
        System.out.println("Você Digitou " + salario);

        salarioAjustado = ((salario)+ ((25*salario)/100));

        System.out.println("O salário ajustado é: "+ salarioAjustado);
    
        teclado.close();

    }
    
}