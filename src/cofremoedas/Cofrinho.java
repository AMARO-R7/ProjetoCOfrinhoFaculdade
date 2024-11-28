package cofremoedas;

import java.util.ArrayList;
import java.util.Iterator;


public class Cofrinho { //Construtor do cofrinho
    private String tipoDesejado;


    public String getTipoDesejado() {
        return tipoDesejado;

    }

    private void setTipoDesejado(String tipoEscolhido) {
        this.tipoDesejado = tipoEscolhido;
    }


    private ArrayList<Moeda> listaMoedas = new ArrayList();   //Array de moedas

    public ArrayList<Moeda> getListaMoedas() {
        return listaMoedas;
    }

    public void addMoeda(Moeda moeda) {  //Metodo para adicionar Moedas
        this.listaMoedas.add(moeda);

    }

    public void delMoeda(String tipoDesejado) {  //Metodo para remover moedas
        Iterator <Moeda> iterador = listaMoedas.iterator();
        boolean moedaRemovida = false;

       while(iterador.hasNext()){
           Moeda o = iterador.next();
            if (o.getTipo().equals(tipoDesejado)) {
                iterador.remove();
                moedaRemovida = true;
                System.out.println();
                System.out.println("______________________");
                System.out.println("----Moeda Removida----");
                System.out.println("______________________");
                System.out.println();


            }


       if (!moedaRemovida){
           System.out.println();
           System.out.println("__________________________");
            System.out.println("Falha ao Remover a Moeda.");
           System.out.println("__________________________");
           System.out.println();


       }
        }
    }

    public void listarMoedas() { //Metodo para listar moedas
        System.out.println();
        System.out.println("______________________");
        System.out.println("--------MOEDAS--------");
        for (Moeda o : listaMoedas) {
            System.out.println(o);
        }
        System.out.println("______________________");
        System.out.println();
    }

    double ttCconvertido = 0;

    public double totalConvertido() {
        for (Moeda o : listaMoedas) {
            ttCconvertido = ttCconvertido + o.converter();

        }
        return ttCconvertido;
    }


}


