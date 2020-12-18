package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double salario, imposto;
        
        salario = teclado.nextDouble();

        if(salario>=0 && salario <=2000.00){
            System.out.println("Isento");

        }
        if(salario>2000.00 && salario <=3000.00){
            imposto = salario * 0.08;
            System.out.printf("R$ %.2f",imposto);
            
        }
        if(salario>3000.00 && salario <=4500.00){
            imposto = salario * 0.18;
            System.out.printf("R$ %.2f\n",imposto);
            
        }
        if(salario > 4500.00){
            imposto = salario * 0.28;
            System.out.printf("R$ %.2f\n",imposto);
            
        }

        teclado.close();
    }


    
}
