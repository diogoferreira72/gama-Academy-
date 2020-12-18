package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int valor;
        int qtd100, qtd50, qtd20, qtd10, qtd5, qtd2, qtd1;
        int dif1, dif2, dif3, dif4, dif5, dif6;

        valor = teclado.nextInt();

        qtd100 = valor/100;
        dif1 = valor % 100;

        qtd50 = dif1/50;
        

        qtd20 = dif1/20;
       

        qtd10 = dif1/10;
        

        qtd5 = dif1/5;
        
        
        qtd2 = dif1/2;
      

        qtd1 = dif1/1;


        System.out.println(valor);
        System.out.println(qtd100+" nota(s) de R$ 100");
        System.out.println(qtd50+" nota(s) de R$ 50");
        System.out.println(qtd20+" nota(s) de R$ 20");
        System.out.println(qtd10+" nota(s) de R$ 10");
        System.out.println(qtd5+" nota(s) de R$ 5");
        System.out.println(qtd2+" nota(s) de R$ 2");
        System.out.println(qtd1+" nota(s) de R$ 1");



        teclado.close();
    }
    
}
