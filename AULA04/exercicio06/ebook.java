package exercicio06;

public class ebook {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual = 0;
    
    public ebook(String titulo, String autor, int totalPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas=totalPaginas;
    }

    public void avancarPagina(){
        if(paginaAtual<totalPaginas){
            paginaAtual++;            
        }
        else{
            System.out.println("Invalido");
        }
    }
    public void retrocederPagina(){
        if(paginaAtual>0){
            paginaAtual--;
        }
        else{
            System.out.println("Invalido");
        }
    }
    public void irParaPagina(int numeroPagina){
        if(numeroPagina<=totalPaginas && numeroPagina >= 0){
            paginaAtual = numeroPagina;
        }
    }
    public int exibirPagina(){
        return paginaAtual;

    }
    public void mostraCapa(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Pagina: "+totalPaginas);
    }
}



