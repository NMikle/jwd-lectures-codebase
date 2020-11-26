package com.epam.jwd.example.app;

import com.epam.jwd.example.model.Dog;
import com.epam.jwd.example.pattern.Color;

public class Main {

    public static final void main(String[] args) {
        final Color blue = Color.BLUE;
        System.out.println(Color.valueOf("BLUE").getAge());
        System.out.println(blue.isOld());
        Integer a = 3;
        a.hashCode();
    }

}
