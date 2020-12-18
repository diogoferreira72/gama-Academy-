package exemplos;

import java.util.Scanner;

public class Exemplo05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero1, numero2, media;

        System.out.println("Digite a primeira nota: ");
        numero1 = teclado.nextDouble();
        System.out.println("Você Digitou " + numero1);

        System.out.println("Digite a segunda nota: ");
        numero2 = teclado.nextDouble();
        System.out.println("Você Digitou " + numero2);

        media = ((numero1+numero2)/2);

        System.out.println("A média do aluno é: "+ media);
    
        teclado.close();

    }
    
}
