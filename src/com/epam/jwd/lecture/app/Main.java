package com.epam.jwd.lecture.app;

import com.epam.jwd.lecture.model.Employee;
import com.epam.jwd.lecture.pattern.Office;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        OutOfMemory Example
//        List<Object> list = new ArrayList<>();
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            System.out.println(i);
//            list.add(new Object());
//        }

//        BigDecimal example
//        System.out.println(1f - 0.9f);
//        final BigDecimal zeroPointNine = new BigDecimal("0.9");
//        System.out.println(BigDecimal.ONE.subtract(zeroPointNine));

//        final Office awesomeOffice = new Office(new BigDecimal("14"), 13, 12, 2, Arrays.asList(new Employee("Petya", 86), new Employee("Elena", 74)), (byte) 8);
        final Office awesomeOffice = Office.builder()
                .area(new BigDecimal("14"))
                .amountOfSeats(13)
                .amountOfTakenSeats(12)
                .amountOfEntrances(2)
                .employees(Arrays.asList(new Employee("Petya", 86), new Employee("Elena", 74)))
                .amountOfWindows((byte) 8)
                .build();

//        Specification awesomeSquaresSpecification = Specification.builder().findFigure(Square.class).withAreaGreaterThan(300).whereNameStartsWith("Awesome").build();

//        List<Square> awesomeSquares = squareService.find(awesomeSquaresSpecification);
        System.out.println(awesomeOffice);
    }
}
