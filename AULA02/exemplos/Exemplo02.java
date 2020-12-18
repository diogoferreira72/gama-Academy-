package exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, prestacao, emprestimo;

        salario = teclado.nextDouble();
        prestacao = teclado.nextDouble();

            emprestimo = salario * 0.3;

                if(prestacao <= emprestimo){
                System.out.println("Empréstimo Liberado");
            }
            else{
                System.out.println("Emprestimo Negado");
            }
            
        teclado.close();
    }
}
