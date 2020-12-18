package uri;

import java.util.Scanner;

public class Uni1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo1, qtd1;
        int codigo2, qtd2;
        float valor1, valor2;
        float valorpago1, valorpago2, valortotal;

        codigo1 = teclado.nextInt();
        qtd1 = teclado.nextInt();
        valor1 = teclado.nextFloat();
        codigo2 = teclado.nextInt();
        qtd2 = teclado.nextInt();
        valor2 = teclado.nextFloat();

        valortotal = (qtd1*valor1) + (qtd2*valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valortotal);
     


        teclado.close();

    }
}
