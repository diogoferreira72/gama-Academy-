package uri;

import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero;
        int a=0;

        numero = teclado.nextDouble();

        if(numero>= 0 && numero <=25){
            System.out.println("Intervalo [0,25]");
            a++;

        }
        if(numero>25 && numero <=50){
            System.out.println("Intervalo (25,50]");
            a++;

        }
        if(numero>50 && numero <=75){
            System.out.println("Intervalo (50,75]");
            a++;

        }
        if(numero>75 && numero <=100){
            System.out.println("Intervalo (75,100]");
             a++;

        }
        if(a == 0){
            System.out.println("Fora de intervalo");
        }

        teclado.close();

    }
    
}
