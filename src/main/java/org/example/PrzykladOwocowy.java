package org.example;

public class PrzykladOwocowy {
    public static void main(String[] args) {
        Sad<Jablko> sadJablkowy = new SadJablkowy();
        Hortex<Jablko, SokJablkowy> wyciskarka = new WyciskarkaJablek();
        PaniHalinaZWarzywniaka<SokJablkowy> halinaOdJablek = new HalinaOdJablek();
        ProcesPrzetworczy<Jablko, SokJablkowy> proces = new ProcesPrzetworczy<>(
                sadJablkowy,
                wyciskarka,
                halinaOdJablek
        );
        proces.uruchomProces(299);
        System.out.println(proces.sprawdzKase());
    }

}
