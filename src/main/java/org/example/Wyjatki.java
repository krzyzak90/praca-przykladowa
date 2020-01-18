package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatki {
    public static void main(String[] args) {
        przeksztalc("44");
        tablicaString();





    }

    public static void przeksztalc(String liczba) {
        try {
            int szukana = Integer.parseInt(liczba);
            if (szukana > 100) throw new RuntimeException("Podana wartość nie może być większa niz 100");
            if (szukana % 5 != 0) throw new RuntimeException("Podana wartość musi być podzielna przez 5");
            System.out.println("Wybrałeś: " + liczba);
        } catch (NumberFormatException ae) {
            System.out.println("Podana wartość nie jest liczbą");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void tablicaString() {
        int index;
        String[] tablica = new String[5];
        tablica[0] = "kot";
        tablica[1] = "pies";
        tablica[2] = "lew";
        tablica[3] = "chomik";
        tablica[4] = "rybka";
        String szukana;
        System.out.println("Podaj index");
        boolean a = true;
        while (a)
            try {
                Scanner sc = new Scanner(System.in);
                index = sc.nextInt() - 1;
                szukana = tablica[index];
                System.out.println(szukana);
                a = false;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Nie ma takiego indeksu");
            } catch (InputMismatchException ex1) {
                System.out.println("Podana wartość nie jest liczbą");
            }
    }


}


