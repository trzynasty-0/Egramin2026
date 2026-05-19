public abstract class Pytanie {
    private String trescPytania;
    private String nazwaZdjecia;
    private boolean czyPoprawna;

    public Pytanie(String trescPytania, String nazwaZdjecia) {
        this.trescPytania = trescPytania;
        this.nazwaZdjecia = nazwaZdjecia;
        czyPoprawna = false;
    }

    abstract boolean SprawdzaniePoprawnosci(char odpowiedz);


}
