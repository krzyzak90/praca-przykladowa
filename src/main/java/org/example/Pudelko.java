package org.example;

public class Pudelko<ZAWARTOSC> {
    private ZAWARTOSC zawartosc;

    public Pudelko(ZAWARTOSC zawartosc) {
        this.zawartosc = zawartosc;
    }

    public ZAWARTOSC getZawartosc() {
        return zawartosc;
    }

    public void setZawartosc(ZAWARTOSC zawartosc) {
        this.zawartosc = zawartosc;
    }

}
