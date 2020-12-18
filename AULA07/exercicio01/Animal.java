public class Animal {
    private String nome;
    private String raca;
    private String cor;
    private int anoNas;
    private Proprietario proprietario;

    public Animal(String nome, String raca, String cor, int anoNas, String nomeProp, String telefone){
        this.nome = nome;
        this.raca=raca;
        this.cor=cor;
        this.anoNas = anoNas;
        this.proprietario = new Proprietario(nomeProp, telefone);
    }

    public String toString(){
        return nome + " , " + raca +" , "+ cor + " , " + anoNas;
        }

        public String getProprietario(){
            return proprietario.toString();
            
        }


}


