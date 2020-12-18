public class Proprietario {
    private String nome;
    private String telefone;

    public Proprietario(String nome, String telefone){

        this.nome = nome;
        this.telefone = telefone;
    }

    public String toString(){

        return nome + "-" + telefone;
    }

}



