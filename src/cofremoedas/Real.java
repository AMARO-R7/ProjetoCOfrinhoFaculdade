package cofremoedas;

public class Real extends Moeda {


    public Real(double valorMoeda){
        this.valor = valorMoeda;
    }


    @Override
    public void info() {
        System.out.println("Real - "+ valor);

    }

    @Override
    public double converter() {
        return this.valor * 1;
    }

    @Override
    public String getTipo() {
        return "Real";
    }
}
