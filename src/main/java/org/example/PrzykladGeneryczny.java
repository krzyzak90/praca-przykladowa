package org.example;

import java.time.LocalDate;

public class PrzykladGeneryczny {
    public static void main(String[] args) {

        Pudelko<LocalDate> pudelkoNaDate = new Pudelko<>(LocalDate.now());
        pudelkoNaDate.setZawartosc(LocalDate.now());
        LocalDate zawartosc = pudelkoNaDate.getZawartosc();
        System.out.println(zawartosc);

    }
}
