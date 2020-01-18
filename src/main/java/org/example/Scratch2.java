package org.example;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scratch2 {

    public static void main(String[] args) {

//        boolean matches = Pattern.matches(
//                "\\d{2}-\\d{3}",
//                "81-170");
//        System.out.println(matches);
//        Pattern regex = Pattern.compile("\\d{2}-\\d{3}");
//
//        Predicate<String> matchPr = regex.asMatchPredicate();
//        boolean test1 = matchPr.test("a81-170");
//
//        Predicate<String> predicate = regex.asPredicate();
//        boolean test2 = predicate.test("a81-170");
//
//        System.out.println(test1);
//        System.out.println(test2);

//        String zdanie = "Ala\t ma kota.\r.\n\t ale \n\n\n nie. ma \t psa";
//        Pattern separator = Pattern.compile("[\\s.]+");
//        String[] slowa = separator.split(zdanie);
//        System.out.println(Arrays.toString(slowa));
//        //{Ala,ma,kota,ale,nie,ma,psa}
//        String zdanie2 = String.join("-", slowa);
//        System.out.println(zdanie2);

//       Pattern emailRegex = Pattern.compile("(?<user>[\\w.]+)@(?<subdomain>\\w+)\\.(?<uberdomain>[a-zA-Z]{2,3})");
//        String emails = "dalfhfilguhsiuhg aniloek98@onet.pl dsafd" +
//                "malyksiaze54@buziaczek.pl sdafsagffsggs  krzysztof.gabka@gmail.com";
//
//        Matcher matcher = emailRegex.matcher(emails);
//        boolean found ;
//        do {
//            found = matcher.find();
//            if (found) {
//                System.out.printf("Dopasowanie %s [%d%d]%n",
//                matcher.group(),
//                matcher.start(),
//                matcher.end());
//
//                System.out.printf("Użytkownik %s [%d:%d]%n",
//                matcher.group("user"),
//                matcher.start("user"),
//                matcher.end("user"));
//
//                System.out.printf("Domena %s [%d:%d]%n",
//                matcher.group(2),
//                matcher.start(2),
//                matcher.end(2));
//
//                System.out.printf("Poddomena %s [%d:%d]%n",
//                matcher.group(3),
//                matcher.start(3),
//                matcher.end(3));
//            }
//        } while (found);


        String text = "Tomasz Lis; 55; 5000zł\nJakub Gąbka; 17;1000000 zł \n  Kamil Durczok ;45; 0zł ";
        Pattern textRegex = Pattern.compile("(?<Name>\\p{L}*\\s\\p{L}*)\\s*;\\s*(?<Age>[0-9]+) *;\\s*(?<Money>[0-9]+ *\\p{L}*)");

        Matcher matcher = textRegex.matcher(text);

        boolean found;
        do {
            found = matcher.find();
            if (found) {

                System.out.printf("Osoba %s [%d:%d]%n",
                        matcher.group("Name"),
                        matcher.start("Name"),
                        matcher.end("Name"));

                System.out.printf("Lat %s [%d:%d]%n",
                        matcher.group("Age"),
                        matcher.start("Age"),
                        matcher.end("Age"));

                System.out.printf("Hajs %s [%d:%d]%n",
                        matcher.group("Money"),
                        matcher.start("Money"),
                        matcher.end("Money"));
            }
        } while (found);


    }
}
