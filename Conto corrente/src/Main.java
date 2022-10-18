import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Correntista correntista1 = new Correntista();
        ContoCorrente conto1= new ContoCorrente();
        int answ;

        do {
            System.out.println("Benvenuto. Seleziona la voce del menù");
            System.out.println("1) Login \n2) Crea nuovo conto (Non disponibile)");
            Scanner risposta = new Scanner(System.in);
            answ = risposta.nextInt();

            switch (answ) {
                case 1:
                    System.out.println("Inserire il PIN");
                    Scanner codice = new Scanner(System.in);
                    int tent = codice.nextInt();
                    if (tent == correntista1.PINConto) {
                        conto1.menu();
                        answ=0;
                    }else{
                        System.out.println("Si prega di inserire un numero valido");
                        answ=2;
                    }
                    break;

                case 2:
                    System.out.println("La funzione non è al momento disponibile. Si prega di riprovare più tardi");
                    break;

                default:
                    System.out.println("Il numero inserito non è valido");
                    break;
            }


        } while (answ != 1);
    }
}