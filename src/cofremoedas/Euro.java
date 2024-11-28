package cofremoedas;

public class Euro extends Moeda {



    public Euro(double valorMoeda){
        this.valor = valorMoeda;
    }


    @Override
    public void info() {

    }

    @Override
    public double converter() {
        return  this.valor * 6.09;
    }

    @Override
    public String getTipo() {
        return "Euro";
    }
}
