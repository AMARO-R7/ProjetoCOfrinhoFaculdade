package cofremoedas;

import java.util.Scanner;


public class Menu {
    private Scanner scan;
    private Cofrinho cofre;
    public String tipoEscolhido;



    public Menu() {   //Contrutor do menu
        scan = new Scanner(System.in);
        cofre = new Cofrinho();
        tipoEscolhido = null;

    }

    Moeda moeda = null;

    private void menuAdicionar() {  //Menu de Opçoes para adicionar Moedas
        System.out.println();
        System.out.println("-----------------");
        System.out.println("Escolha A Moeda :");
        System.out.println("1-Real");
        System.out.println("2-Dollar");
        System.out.println("3-Euro");
        System.out.println("-----------------");

        String escolhaAdicionar = scan.next();

        switch (escolhaAdicionar) {

            case "1":
                System.out.print("Qual valor da moeda ? R$");
                moeda = new Real(scan.nextDouble());
                if (moeda != null) {
                    cofre.addMoeda(moeda);
                    System.out.println();
                    System.out.println("___________________");
                    System.out.println("Moeda Adicionada !");
                    System.out.println("___________________");
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("_________________________");
                    System.out.println("Erro ao adicionar á moeda.");
                    System.out.println("_________________________");
                    System.out.println();
                }

                break;

            case "2":
                System.out.print("Qual valor da moeda ? $");
                moeda = new Dollar(scan.nextDouble());
                if (moeda != null) {
                    cofre.addMoeda(moeda);
                    System.out.println();
                    System.out.println("___________________");
                    System.out.println("Moeda Adicionada !");
                    System.out.println("___________________");
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("_________________________");
                    System.out.println("Erro ao adicionar á moeda.");
                    System.out.println("_________________________");
                    System.out.println();
                }
                break;


            case "3":
                System.out.print("Qual valor da moeda ? €");
                moeda = new Euro(scan.nextDouble());
                if (moeda != null) {
                    cofre.addMoeda(moeda);
                    System.out.println();
                    System.out.println("___________________");
                    System.out.println("Moeda Adicionada !");
                    System.out.println("___________________");
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("_________________________");
                    System.out.println("Erro ao adicionar á moeda.");
                    System.out.println("_________________________");
                    System.out.println();
                }
                break;

            default:
                System.out.println();
                System.out.println("___________________________");
                System.out.println("!!! ERRO OPÇÃO INVALIDA !!!");
                System.out.println("___________________________");
                System.out.println();
                infoMenu();
                break;
        }
    }

    public void menuRemover() { //Menu de Opçoes para remover Moedas

        System.out.println();
        System.out.println("-----------------");
        System.out.println("Escolha A Moeda :");
        System.out.println("1-Real");
        System.out.println("2-Dollar");
        System.out.println("3-Euro");
        System.out.println("-----------------");

        String escolhaRemover = scan.next();


        switch (escolhaRemover) {

            case "1":
                tipoEscolhido = "Real";
                cofre.delMoeda(tipoEscolhido);
                break;

            case "2":
                tipoEscolhido = "Dollar";
                cofre.delMoeda(tipoEscolhido);
                break;


            case "3":
                tipoEscolhido = "Euro";
                cofre.delMoeda(tipoEscolhido);
                break;

            default:
                System.out.println("!!! ERRO OPÇÃO INVALIDA !!!");
                infoMenu();
                break;
        }

    }




        public void infoMenu () { //Menu Principal


            System.out.println("--------------------COFRE--------------------");
            System.out.println("1-Adicionar Moeda :");
            System.out.println("2-Remover Moeda:");
            System.out.println("3-Listar Moedas:");
            System.out.println("4-Calcular valor total convertido para real:");
            System.out.println("0-Encerrar");
            System.out.println("---------------------------------------------");

            String escolha = scan.next();


            switch (escolha) {

                case "1":
                    menuAdicionar();
                    infoMenu();
                    break;

                case "2":
                    menuRemover();
                    infoMenu();
                    break;

                case "3":
                    System.out.println();
                    cofre.listarMoedas();
                    infoMenu();
                    break;

                case "4":
                    double ttConvertido = cofre.totalConvertido();
                    System.out.println();
                    System.out.println("_____________________________________");
                    System.out.printf("|Total de moedas em reais é R$ %.2f |\n", ttConvertido);
                    System.out.println("-------------------------------------");
                    System.out.println();
                    infoMenu();
                    break;



                case "0":
                    System.out.println("Encerrando .....");
                    break;


                default:
                    System.out.println("!!! ERRO OPÇÃO INVALIDA !!!");
                    infoMenu();
                    break;



            }
        }

}
