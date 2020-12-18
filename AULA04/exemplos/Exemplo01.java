package exemplos;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = teclado.nextInt();
        parimpar(numero);


        teclado.close();

    }

    public static void parimpar (int i){

        if(i % 2 == 0){
            System.out.println("Numero par"); 
        }
        else{
            System.out.println("Numero Impar");
        }
        
    }
    
}