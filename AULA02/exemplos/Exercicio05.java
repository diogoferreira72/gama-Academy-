package exemplos;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senha = "R10p5";
        String senhaUsr;

        System.out.println("Digite sua senha: ");
        senhaUsr = teclado.nextLine();

        if(senhaUsr.equals(senha)){
            System.out.println("Acesso Concedido");

        }else{
            System.out.println("Acesso Negado");
        }

        teclado.close();

    }
}
