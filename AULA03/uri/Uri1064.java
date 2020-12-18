package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont = 0;
        double numero;
        int positivo = 0;
        double media = 0;

        while (cont < 6) {
            numero = teclado.nextDouble();

            if (numero > 0) {
                positivo++;
                media = media + numero;

            }
            cont++;
        }
        System.out.println(positivo+ " valores positivos");
        System.out.printf("%.1f\n", (media / positivo));
        teclado.close();
    }

}
