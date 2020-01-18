package org.example;

public class Gra {
    private Gracz graczX;
    private Gracz graczO;
    public Gra(boolean graczXkomputer, boolean graczOkomputer) {
        graczX = graczXkomputer ? new GraczKomputerowy() : new GraczCzłowiek();
        graczO = graczOkomputer ? new GraczKomputerowy() : new GraczCzłowiek();
    }
    public void uruchom() {
        Plansza plansza = new Plansza();
        System.out.println("Kółko i Krzyżyk");
        System.out.println("Start!");
        System.out.println(plansza);
        while (true) {
            System.out.println("Kolej gracza X");
            ruch(plansza, graczX,Pole.KRZYŻYK);
            System.out.println(plansza);
            if (plansza.wygrał(Pole.KRZYŻYK)) {
                System.out.println("Gracz X wygrał!");
                break;
            }
            if (plansza.jestPełna()) {
                System.out.println("Plansza jest pełna, remis!");
                break;
            }
            System.out.println("Kolej gracza O");
            ruch(plansza, graczO,Pole.KÓŁKO);
            System.out.println(plansza);
            if (plansza.wygrał(Pole.KÓŁKO)) {
                System.out.println("Gracz O wygrał!");
                break;
            }
            if (plansza.jestPełna()) {
                System.out.println("Plansza jest pełna, remis!");
                break;
            }
        }
        System.out.println("Koniec, dziękuję za grę");
    }
    public boolean ruch(Plansza plansza, Gracz gracz, Pole pole){
        boolean udałoSię = false;
        for (int próba = 0; próba < 3; próba++) {
            try {
                Współrzedne współrzędne = gracz.nastepnyRuch(plansza.obecnyStan());
                udałoSię = plansza.wykonajRuch(współrzędne, pole);
                udałoSię = true;
                break;
            } catch (Exception e) {
                System.out.println("Ruch niepoprawny. Spróbuj jeszcze raz");
            }
        }
        if (!udałoSię) {
            throw new RuntimeException("Gracz X nie umie grać w prostą grę");
        }
        return udałoSię;
    };


}

