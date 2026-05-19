public class PytanieZamkniete extends Pytanie{
    protected String trescA, trescB, trescC;
    protected char odpowiedzPoprawna;

    @Override
    boolean SprawdzaniePoprawnosci(char odpowiedz) {
        return odpowiedz == odpowiedzPoprawna;
    }

    public PytanieZamkniete(String trescPytania, String nazwaZdjecia, String trescA, String trescB, String trescC, char odpowiedzPoprawna) {
        super(trescPytania, nazwaZdjecia);
        this.trescA = trescA;
        this.trescB = trescB;
        this.trescC = trescC;
        this.odpowiedzPoprawna = odpowiedzPoprawna;
    }
}
