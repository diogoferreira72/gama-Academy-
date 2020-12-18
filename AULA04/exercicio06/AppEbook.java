package exercicio06;

public class AppEbook {
    public static void main(String[] args) {
        ebook testeLivro = new ebook("O Senhor dos Aneis", "Tokien", 564);

        testeLivro.mostraCapa();
        testeLivro.avancarPagina();
        testeLivro.avancarPagina();
        testeLivro.irParaPagina(56);
        System.out.println("pagina Atual: "+ testeLivro.exibirPagina());
       

        
    }
    
}
