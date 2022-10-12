import java.util.Scanner;

public class ContoCorrente {
    int numeroConto;
    int FidoRim;
        //LastMovement
    float saldo=100;
    int codIntestatario;
    int bloccato;

    public ContoCorrente(){

    }

    public void menu(){

        int action;

        System.out.println("Selezionare l'azione desiderata");
        System.out.println("1) Effettua un versamento\n2) Effettua un Prelievo\n3) Visualizza Saldo/Stampa Saldo\n4) Visualizza ultimi movimenti");
        Scanner azione= new Scanner(System.in);
        action= azione.nextInt();

        switch (action){
            case 1:
                FaiVersamento();
                break;

            case 2:
                FaiPrelievo();
                break;

            case 3:
                VisSaldo();
                break;

            case 4:
                VisMovimenti();
                break;

            default:
                System.out.println("Si prega di inserire un numero valido");
                break;
        }


    }

    public void FaiVersamento(){

    }

    public void FaiPrelievo(){
        System.out.println("Selezionare l'importo che si desidera prelevare\nSono disponibili sul conto €" +saldo);
        System.out.println("1) 20€\n2) 50€\n3) 100€\n4) 200€\n\n>>>");
        Scanner minus=new Scanner(System.in);
        int prelev=minus.nextInt();

        switch (prelev){
            case 1:
                saldo=saldo-20;
                System.out.println("Prelievo effettuato correttamente");
                break;

            case 2:
                saldo=saldo-50;
                System.out.println("Prelievo effettuato correttamente");
                break;

            case 3:
                saldo=saldo-100;
                System.out.println("Prelievo effettuato correttamente");
                break;

            case 4:
                saldo=saldo-200;
                System.out.println("Prelievo effettuato correttamente");
                break;

            default:
                System.out.println("Qualcosa è andato storto, si prega di riprovare");
                break;
        }
    }

    public void VisSaldo(){

    }

    public void PrintSaldo(){

    }

    public void VisMovimenti(){

    }
}
