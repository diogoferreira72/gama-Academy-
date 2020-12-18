package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int count = 0;
        int numero;
        int par=0;
        int impar=0;
        int positivo=0;
        int negativo=0;

        while (count < 5) {
            numero = teclado.nextInt();

            if(numero > 0){
                positivo++;
            }else{
                negativo++;
            }
        
            if(numero % 2 == 0){
                par++;
            }else{
                impar++;
            }
            count++;
        }

        System.out.println(par+" valor(es) par(es)");
        System.out.println(impar+" valor(es) impar(es)");
        System.out.println(positivo+" valor(es) positivo(s)");
        System.out.println(negativo+"valor(es) negativo(s)");



        teclado.close();
    }

}
