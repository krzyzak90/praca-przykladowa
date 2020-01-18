package org.example;

public class ProcesPrzetworczy<F, S> {
    private Sad<F> sad;
    private Hortex<F,S> hortex;
    private PaniHalinaZWarzywniaka<S> halinka;
    private double kasa = 0.0;

    public ProcesPrzetworczy(Sad<F> sad, Hortex<F, S> hortex, PaniHalinaZWarzywniaka<S> halinka) {
        this.sad = sad;
        this.hortex = hortex;
        this.halinka = halinka;
    }

    public void uruchomProces(int i) {

        for (int x = 0; x < i; x++){
            F owoc = sad.dajOwoca();
            S sok = hortex.wyciskaj(owoc);
            double piniadz = halinka.wezSok(sok);
            kasa += piniadz;
        }
    }
    public double sprawdzKase(){
        return kasa;
    }
}
