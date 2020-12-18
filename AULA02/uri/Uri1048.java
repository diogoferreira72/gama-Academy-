package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double salario;
        double novoSalario;

        salario = teclado.nextDouble();

        if(salario >0 && salario <=400){
            
            novoSalario = salario + (salario * 0.15);
            System.out.printf("Novo salario: %.2f\n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n",salario * 0.15);
            System.out.println("Em percentual: 15 %");

        }

        if(salario >400.00 && salario <=800){
            
            novoSalario = salario + (salario * 0.12);
            System.out.printf("Novo salario: %.2f\n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n",salario * 0.12);
            System.out.println("Em percentual: 12 %");

        }   
        if(salario >800.00 && salario <=1200){
            
            novoSalario = salario + (salario * 0.10);
            System.out.printf("Novo salario: %.2f\n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n",salario * 0.10);
            System.out.println("Em percentual: 10 %");

        }   
        if(salario >1200.00 && salario <=2000.00){
            
            novoSalario = salario + (salario * 0.07);
            System.out.printf("Novo salario: %.2f\n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n",salario * 0.07);
            System.out.println("Em percentual: 7 %");

        } 
        if(salario > 20000.00){
            
            novoSalario = salario + (salario * 0.04);
            System.out.printf("Novo salario: %.2f\n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n",salario * 0.04);
            System.out.println("Em percentual: 4 %");

        } 

        teclado.close();
    }
    
}
