package cofremoedas;

public class Dollar extends Moeda {

    private double valorMoeda; // Valor em dóla



    public Dollar( double valorMoeda ){
        this.valor = valorMoeda;
    }



    @Override
    public void info() {

    }

    @Override
    public double converter() {
        return this.valor* 5.81 ;
    }

    @Override
    public String getTipo() {
        return "Dollar";
    }
}