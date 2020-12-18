import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * calculado
 */
public class calculado {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double numero1, numero2;
        boolean erro = true;

        
       do{
        try {
            System.out.println("Digite um numero para divisão: ");
            numero1 = teclado.nextInt();
            System.out.println("Digite um numero para divisão: ");
            numero2 = teclado.nextInt();

            System.out.println((double)(numero1/numero2));
            erro = false;

        } catch (InputMismatchException e){
            System.out.println("Entrada invalida");
        } catch(Exception e){
            e.printStackTrace();
        }

        
       }while(erro);
        teclado.close();
    }
}