package exercicio2;

public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, String telefone, double salario) {
        super(nome, telefone);
        this.salario = salario;

    }

    public String toString() {

        return super.toString() + " " + salario;
    }
}
