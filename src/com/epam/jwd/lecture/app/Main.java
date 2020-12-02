package com.epam.jwd.lecture.app;

import com.epam.jwd.lecture.exception.Cat;
import com.epam.jwd.lecture.exception.CatReader;
import com.epam.jwd.lecture.exception.MeowException;

public class Main {

    public static void main(String[] args) {
        try (final CatReader reader = new CatReader()) {
            final Cat[] cats = reader.read();
            for (Cat cat : cats) {
                System.out.println(cat.getName());
            }
        } catch (MeowException e) {
            System.out.println("Catch meow exception");
        }
        System.out.println("after try/catch");
    }

}
