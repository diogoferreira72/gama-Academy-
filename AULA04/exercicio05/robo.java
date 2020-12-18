package exercicio05;

public class robo {
    private int norte, sul, leste, oeste;
    private int x, y;

    public robo(int altura, int largura) {
        setLimite(altura, largura);
    }

    public void setLimite(int altura, int largura) {
        if (altura > 0 && largura>0) {
            norte = altura;
            sul = -(altura);
            leste = -(largura);
            oeste = largura;
        }else{
            System.out.println("Limite invalido");
        }
        System.out.println("Tamanho: "+ altura+"x"+ largura);
    }

    public void movimentar(int x, int y){
        
        if(this.x + x < norte){
            this.x = this.x+x;
        }else{

        }



    }
}
