package com.example.egzamin2026;

public abstract class Pytanie {
    protected String trescPytania;
    protected int nazwaZdjecia;
    protected boolean czyPoprawna;

    public Pytanie(String trescPytania, int nazwaZdjecia) {
        this.trescPytania = trescPytania;
        this.nazwaZdjecia = nazwaZdjecia;
        czyPoprawna = false;
    }

    abstract boolean SprawdzaniePoprawnosci(char odpowiedz);


}
