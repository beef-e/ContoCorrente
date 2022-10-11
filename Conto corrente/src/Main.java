import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //DICHIARO TRE CORRENTISTI INIZIALI PER IL FUNZIONAMENTO DEL PROGRAMMA
        Correntista correntista1=new Correntista();
        Correntista correntista2=new Correntista();
        Correntista correntista3=new Correntista();

        System.out.println("Benvenuto. Seleziona la voce del menù");
        System.out.println("1) Login \n2) Crea nuovo conto");
        Scanner risposta = new Scanner(System.in);
        int answ = risposta.nextInt();

        switch (answ){
            case 1:
                System.out.println("Inserire il codice utente");
                Scanner codice=new Scanner(System.in);
                int Ucod= codice.nextInt();
                //finché Ucod non è uguale a correntista[i].codice
                System.out.println("Inserire il PIN");
        }
    }


}