package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double A, B ,C;
        double media;
        
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        media = ((2*A) + (3*B) + (5*C))/ 10;

        System.out.printf("MEDIA = %.1f\n  ",media);


        teclado.close();
    }
    
}
