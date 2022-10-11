import java.util.Scanner;

public class ContoCorrente {
    int numeroConto;
    int FidoRim;
        //LastMovement
    float saldo;
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

    }

    public void VisSaldo(){

    }

    public void PrintSaldo(){

    }

    public void VisMovimenti(){

    }
}
