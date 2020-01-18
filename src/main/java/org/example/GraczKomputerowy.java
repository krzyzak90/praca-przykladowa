package org.example;

public class GraczKomputerowy implements Gracz {
    @Override
    public Współrzedne nastepnyRuch (Pole[][] plansza) {
        for (int x = 0; x < 3; x++) {
            for (int  y = 0; y < 3; y++) {
                if (plansza[x][y] == Pole.PUSTE) {
                    return new Współrzedne(x, y);
                }
            }
        }
        return null;
    }


}
