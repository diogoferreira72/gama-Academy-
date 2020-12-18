package exercicio042;

public class relogio {
    private int hora;
    private int minuto;
    private int segundos;

    public relogio(int hora, int minuto, int segundos){

        this.hora = hora;
        this.minuto = minuto;
        this.segundos=segundos;
    }

    public void apresentaHoras(){

        System.out.println(hora+":"+minuto+":"+segundos);
    }

}
