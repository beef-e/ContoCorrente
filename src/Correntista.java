public class Correntista {
    String nome;
    String cognome;
    int genere;
    String appell="Sig.";
    int codiceUtente;
    int numeroConto;
    int PINConto=161656;

    public Correntista() {

    }

    public void getGenere(){
        if (genere==1){
            appell="Sig.";
        } else if (genere==2) {
            appell="Sig.ra";
        }
    }
}
