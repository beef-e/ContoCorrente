import java.util.Scanner;

public class ContoCorrente {
    int numeroConto;
    int FidoIniziale=3000;
    float FidoRim=FidoIniziale;
    final int n=3;
    float LastMovement[]= new float [n];
    float saldo=100;
    int codIntestatario;
    int bloccato;

    public ContoCorrente(){

    }

    public void menu(){

        int action;

        do {

            System.out.println("Selezionare l'azione desiderata");
            System.out.println("1) Effettua un versamento\n2) Effettua un Prelievo\n3) Visualizza Saldo\n4) Visualizza ultimi movimenti\n5) Esci");
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

                case 5:
                    System.out.println("Uscita in corso\n\n");
                    break;

                default:
                    System.out.println("Si prega di inserire un numero valido\n\n");
                    break;
            }
        }while(action!=5);



    }

    public void SpostaMovimenti(){
        LastMovement[2]=LastMovement[1];
        LastMovement[1]=LastMovement[0];
    }

    public void aggFido(int richiesta){
        if (FidoRim+richiesta>=0){
            float change=saldo+richiesta;
            saldo=0;
            FidoRim=FidoRim+change;
            System.out.println("Prelievo effettuato correttamente\n");
        }else{
            System.out.println("Il movimento non può essere effettuato per mancanza di credito");
        }
    }

    public void FaiVersamento(){
        System.out.print("Si è selezionato di effettuare un versamento\nIl saldo disponibile è di €"+saldo +
                "\nInserire di seguito l'importo che si desidera depositare\n>>>");
        Scanner imp= new Scanner(System.in);
        float vers= imp.nextFloat();
        saldo=saldo+vers;
        SpostaMovimenti();
        LastMovement[0]=vers;
        System.out.println("Versamento effettuato correttamente. Sono attualmente disponibili €"+saldo);
    }

    public void FaiPrelievo(){

        int optprl1=-20;
        int optprl2=-50;
        int optprl3=-100;
        int optprl4=-200;

        System.out.println("Selezionare l'importo che si desidera prelevare\nSono disponibili sul conto €" +saldo);
        System.out.print("1) 20€\n2) 50€\n3) 100€\n4) 200€\n\n>>>");
        Scanner minus=new Scanner(System.in);
        int prelev=minus.nextInt();

        switch (prelev){
            case 1:
                if (saldo+optprl1<0){
                    aggFido(optprl1);
                }else{
                    saldo=saldo+optprl1;
                    SpostaMovimenti();
                    LastMovement[0]=optprl1;
                    System.out.println("Prelievo effettuato correttamente\n");
                }
                break;

            case 2:
                if (saldo+optprl2<0){
                    aggFido(optprl2);
                }else{
                    saldo = saldo + optprl2;
                    SpostaMovimenti();
                    LastMovement[0] = optprl2;
                    System.out.println("Prelievo effettuato correttamente\n");
                }
                break;

            case 3:
                if (saldo+optprl3<0){
                    aggFido(optprl3);
                }else{
                    saldo = saldo + optprl3;
                    SpostaMovimenti();
                    LastMovement[0] = optprl3;
                    System.out.println("Prelievo effettuato correttamente\n");
                }
                break;

            case 4:
                if (saldo+optprl4<0){
                    aggFido(optprl4);
                }else{
                    saldo = saldo + optprl4;
                    SpostaMovimenti();
                    LastMovement[0] = optprl4;
                    System.out.println("Prelievo effettuato correttamente\n");
                }
                break;

            default:
                System.out.println("Qualcosa è andato storto, si prega di riprovare\n");
                break;
        }
    }

    public void VisSaldo(){
        System.out.println("Il saldo disponibile è di €" +saldo);
        System.out.println("Il fido rimanente per questo mese è di €" +FidoRim);
    }

    public void VisMovimenti(){
        System.out.println("Vengono di seguito visualizzati gli ultimi " +n +" movimenti operati sul conto");

        for (int i = 0; i<n; i++){
            if (LastMovement[i]!=0) {
                System.out.println("" + LastMovement[i]);
            }
        }
    }
}
