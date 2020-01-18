package org.example;

public class SadJablkowy implements Sad<Jablko> {
    @Override
    public Jablko dajOwoca() {
        return new Jablko();
    }
}