package cofremoedas;

public abstract class Moeda {

     protected double valor ;

     public abstract void info();

     public abstract double converter();

     public abstract String getTipo();

    public String toString() {
        return getTipo() +"  --  " + valor ;
    }


    }


