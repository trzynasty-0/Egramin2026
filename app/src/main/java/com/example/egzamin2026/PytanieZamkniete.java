package com.example.egzamin2026;

public class PytanieZamkniete extends Pytanie{
    private String trescA, trescB, trescC;
    private char odpowiedzPoprawna;

    @Override
    boolean SprawdzaniePoprawnosci(char odpowiedz) {
        return odpowiedz == odpowiedzPoprawna;
    }

    public PytanieZamkniete(String trescPytania, int nazwaZdjecia, String trescA, String trescB, String trescC, char odpowiedzPoprawna) {
        super(trescPytania, nazwaZdjecia);
        this.trescA = trescA;
        this.trescB = trescB;
        this.trescC = trescC;
        this.odpowiedzPoprawna = odpowiedzPoprawna;
    }

    public String getTrescA() {
        return trescA;
    }

    public String getTrescB() {
        return trescB;
    }

    public String getTrescC() {
        return trescC;
    }
}