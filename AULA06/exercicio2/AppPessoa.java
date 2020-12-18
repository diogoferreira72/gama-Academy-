package exercicio2;

public class AppPessoa {
    public static void main(String[] args) {

        Professor prof = new Professor("Emerson", "1998827374", 50000);
        Estudante estu = new Estudante("Diogo", "3214134", "Engenharia");

        System.out.println(prof.toString());
        System.out.println(estu.toString());

    }
}
