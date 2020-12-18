package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();

        if(nome.equals("Diogo")){

            System.out.println("Olá Diogo");

        }else{
            System.out.println("você não é o Diogo");
        }

        teclado.close();

    }
    
}
