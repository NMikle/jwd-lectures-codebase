package com.epam.jwd.lecture.app;

import com.epam.jwd.lecture.exception.Cat;
import com.epam.jwd.lecture.exception.MeowException;

public class Main {

    public static void main(String[] args) {
        final Cat cat = new Cat();
        try {
            System.out.println("in try block");
            cat.sayMeow(-1);
        } catch (MeowException | NoSuchMethodException e) {
            System.out.println("in catch block");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("after try/catch");
    }

}
