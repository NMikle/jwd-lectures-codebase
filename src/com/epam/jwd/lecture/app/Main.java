package com.epam.jwd.lecture.app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
//        final BigDecimal twentyFive = BigDecimal.valueOf(25);
//        final BigDecimal result = twentyFive.divide(BigDecimal.valueOf(24), 2, RoundingMode.DOWN);
//        System.out.println(result);

//        int a = new Integer(4);
//        Integer b = 5;
//        int c = Integer.parseInt("6");
//        Integer d = Integer.valueOf("7");
//        int e = new Integer("8");
//        final Boolean trueOrFalse = new Boolean("tRuE");
//
//        if (new Integer("8") == new Integer("8")) {
//            System.out.println("same");
//        } else {
//            System.out.println("different");
//        }
//
//        if (new Integer("8") <= new Integer("8")) {
//            System.out.println("fewer or equal");
//        } else {
//            System.out.println("greater");
//        }

//        final LocalDateTime now = LocalDateTime.now();
//
//        final LocalDateTime jwdEndsDate = now.plusMonths(2);
//
//        System.out.println(jwdEndsDate);

        String a = "a";
        String b = "a";
        String c = "a";
        String d = "a";

        a = a + b;
        c = a + c;
        d = c + d;

        final String result = new StringBuilder(a).append(b).append(c).append(d).toString();
    }
}
