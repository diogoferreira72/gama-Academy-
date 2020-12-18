package uri;

import java.util.Scanner;

public class Uri1001 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Função que captura entradas do teclado
        int a;
        int b;
        int soma;

        a = teclado.nextInt(); // Captura de dados digitados
        b = teclado.nextInt();

        soma = a + b;

        System.out.println("X = " +soma);

        teclado.close();
        

    }
    
}
