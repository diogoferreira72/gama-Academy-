package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int valor, soma =0;
        int cont=1;

        while(cont < 6){
        System.out.println("Digite o valor");
        valor = teclado.nextInt();
        cont++;
        soma = soma + valor;
        }
        
        System.out.println(soma);
        teclado.close();
    }
}
