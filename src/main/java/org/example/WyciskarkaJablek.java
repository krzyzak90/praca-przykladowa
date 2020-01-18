package org.example;

public class WyciskarkaJablek implements Hortex<Jablko, SokJablkowy> {
    @Override
    public SokJablkowy wyciskaj(Jablko owoc) {
        return new SokJablkowy();
    }
}
