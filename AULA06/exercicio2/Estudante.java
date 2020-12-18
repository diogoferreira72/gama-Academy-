package exercicio2;

public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, String telefone, String curso) {
        super(nome, telefone);
        this.curso = curso;

    }

    public String toString() {

        return super.toString() + " " + curso;
    }

}
