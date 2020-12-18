package exercicio01;

/**
 * placar
 */
public class placar {
    private String time1;
    private String time2;
    private int gols1;
    private int gols2;

   public placar(){
       time1 = "Time da casa";
       time2 = "Visitante";

    }
    public placar(String time1, String time2){
        this.time1 = time1;
        this.time2 = time2;
    }

    public placar(String time1, int gols1, String time2, int gols2){
        this.time1 = time1;
        this.gols1 = gols1;
        this.time2 = time2;        
        this.gols2 = gols2;
    }
    
    public String exibirPlacar(){
        //System.out.println(time1 +" "+ gols1 + " x " + gols2 +" "+ time2);
        return time1+" "+ gols1 + " x " + gols2 +" "+ time2;
    }
}