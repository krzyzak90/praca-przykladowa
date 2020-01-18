package org.example;

import java.util.Scanner;

public class GraczCzłowiek implements Gracz {
    @Override
    public Współrzedne nastepnyRuch(Pole[][] plansza) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        return new Współrzedne(x, y);

    }

//    public static void main(String[] args) {
//        Współrzedne ruch = new Gracz().nastepnyRuch(null);
//        System.out.printf("%d %d%n", ruch.getX(), ruch.getY());
//
//    }
}
