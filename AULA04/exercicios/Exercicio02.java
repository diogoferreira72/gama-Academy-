package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3;
      
        System.out.println("Digite três numeros: ");
        numero1 = teclado.nextInt();
        numero2 = teclado.nextInt();
        numero3 = teclado.nextInt();

        System.out.println("Maior: " +  maior(numero1, numero2, numero3) );
              
        teclado.close();
    }
    public static int maior (int a, int b, int c) {

        if (a>=b && a>=c) {
            return a;
        } else {
            if(b>=a && b>=c){
                return b;
            }else{
                return c;
            }
            
        }

    }

}
