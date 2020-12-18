import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(5);

        System.out.println(lista);
        System.out.println("Quantidade de intens: "+ lista.size());

        for (int i=0; i< lista.size();i++){
            if(lista.get(i)==8){
                System.out.println("Achei a posição"+ i);

            }

        }
        for (Integer item : lista) {
            if(item==8){
                System.out.println("Achei");
            }
            
        }

    }
}