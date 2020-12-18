public class GerenciaAnimal {
    private ArrayList<> animais = new ArrayList<>();

    public GerenciaAnimal (){

        animais = new ArrayList<>();
    }

    public void novoAnimal(String nome, String raca, String cor, int anoNas, String nomeProp, String telefone){

        animais.add (new Animal(String nome, String raca, String cor, int anoNas, String nomeProp, String telefone))
    }


}
