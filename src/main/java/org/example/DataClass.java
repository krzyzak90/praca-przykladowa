package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static java.time.format.DateTimeFormatter.ISO_DATE;

public class DataClass {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1990, 7, 9);
        LocalTime timeBirth = LocalTime.of(8, 22, 33);
        LocalDateTime dateTime = LocalDateTime.of(birthDate, timeBirth);
        LocalDateTime.now();

        System.out.println(birthDate);
        System.out.println(timeBirth);
        System.out.println(dateTime);
        System.out.println(LocalDateTime.now());

        LocalDateTime localDateTime = birthDate.atStartOfDay();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = birthDate.atTime(15, 30);
        System.out.println(localDateTime1);

        DayOfWeek dayOfWeek = birthDate.getDayOfWeek();
        System.out.println(dayOfWeek);


        LocalDate plusWeek = birthDate.plus(20, ChronoUnit.WEEKS);
        System.out.println(plusWeek);

//        birthDate.minusYears(20);
        LocalTime localTime1 = timeBirth.plusMinutes(30);
        System.out.println(localTime1);

        Period okres = Period.of(1, 2, 3);
        LocalDate plus = birthDate.plus(okres);
        System.out.println(plus);

        boolean equal = birthDate.isEqual(LocalDate.now());
        boolean after = birthDate.isAfter(LocalDate.now());

        long until1 = birthDate.until(LocalDate.now(), ChronoUnit.WEEKS);
        System.out.println(until1);

        LocalDate nextBirth = LocalDate.of(2020, 7, 9);
        System.out.println("Dni do urodzin ;");
        System.out.println(LocalDate.now().until(nextBirth, ChronoUnit.DAYS));

        LocalDate primaAprilis = LocalDate.of(2019, 4, 1);
        System.out.println("Tygodnie od Primaaprilis");
        System.out.println(primaAprilis.until(LocalDate.now(), ChronoUnit.WEEKS));
        LocalTime godzina = LocalTime.of(16, 00);
        System.out.println("Milisekundy do zakonczenia zajec");
        System.out.println(LocalTime.now().until(godzina, ChronoUnit.MILLIS));


        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime jakasDataiCzas = LocalDateTime.of(2017, 6, 12, 13, 33);
        String dataJakoTekst = jakasDataiCzas.format(dtf);
        System.out.println(dataJakoTekst);
        LocalDateTime jakasinnaDataiCzas = LocalDateTime.parse("2011-11-02T10:20", dtf);
        System.out.println(jakasinnaDataiCzas);

        String asWeekDate = LocalDate.now().format(DateTimeFormatter.ISO_WEEK_DATE);
        System.out.println(asWeekDate);

        DateTimeFormatter wlasnyFormat = DateTimeFormatter.ofPattern("'Rok:'(uuuu) - 'Miesiac:'(MMMM) - (dd) - (EEEE)");
        LocalDate fajnaData = LocalDate.of(1990, 7, 9);

        String dataDzis = LocalDate.now().format(wlasnyFormat);

        System.out.println(fajnaData.format(wlasnyFormat));
        System.out.println(dataDzis);

        LocalDate dataNowa = LocalDate.parse(dataDzis, wlasnyFormat);

        System.out.println(dataNowa);

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("uuuu_MM");
        String newData = YearMonth.now().format(format2);
        YearMonth data2 = YearMonth.parse(newData, format2);

        System.out.println(newData);
        System.out.println(data2);



    }
}
