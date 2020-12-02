package com.epam.jwd.lecture.block;

public class A {


    static {
        System.out.println("static in A");
    }

    {
        System.out.println("instance in A");
    }

    public A() {
        System.out.println("constructor in A");
    }

}
