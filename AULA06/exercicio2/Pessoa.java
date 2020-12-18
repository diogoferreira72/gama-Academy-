package exercicio2;

public class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Pessoa() {

    }

    public String toString() {
        return nome + " " + telefone;

    }

}
