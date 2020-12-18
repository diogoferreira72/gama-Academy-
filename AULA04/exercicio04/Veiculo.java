package exercicio04;

public class Veiculo {
    //Atributos

    String modelo;
    String marca;
    Double consumo;

    //Construtor

    Veiculo(String modelo, String marca, Double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    //método de apresentação

    void apresentarModeloMarca(){
        System.out.println("Marca: "+marca+" ,Modelo: "+modelo);
    }

    void apresentaCondumo(){
        System.out.println("Consumo de: "+consumo);        
    }

}
