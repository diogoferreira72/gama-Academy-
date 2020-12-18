package exercicio01;

public class AppPlacar {
    public static void main(String[] args) {
        
        placar jogo1 = new placar();
        placar jogo2 = new placar("Palmeiras", "Cruzeiro");
        placar jogo3 = new placar("Palmeiras", 3, "Cruzeiro", 2);

        System.out.println(jogo1.exibirPlacar());
        System.out.println(jogo2.exibirPlacar());
        System.out.println(jogo3.exibirPlacar());

        
        
        

    }
    
}
