package Spil;

public class BankKonto {

    /**
     * parameters
     */

    //private final int startVærdi = 1000;             // start point
    private int kontoVærdig;                         // current value in the konto
    //private int kontoNummer;

    /**
     *  Construktors: initial the parameters
     */

    public BankKonto(int startPoint){
    kontoVærdig = startPoint;
    }

    public int getKontoVærdig() {
        return kontoVærdig;
    }

    public void setKontoVærdig(int kontoVærdig) {
        this.kontoVærdig = kontoVærdig;
    }

    /**
     * add earned point to the account value, and return new value
     */
    public int indsættePenge(int point){

        kontoVærdig += point ;
        return kontoVærdig ;

    }

    /**
     * withdraw point from the account value, and return new value
     */

    public int hævePenge(int point){
        kontoVærdig -= point ;
        return kontoVærdig;
    }
}
