package com.epam.jwd.lecture.block;

public class B extends A {
    static {
        System.out.println("static in B");
    }

    {
        System.out.println("instance in B");
    }

    public B() {
        System.out.println("constructor in B");
    }
}
