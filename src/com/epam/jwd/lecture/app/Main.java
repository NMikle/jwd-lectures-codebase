package com.epam.jwd.lecture.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String PHONE_REGEX = "[+]375\\s\\((29|25|33|44)\\)\\s\\d{3}-\\d{2}-\\d{2}";

    public static void main(String[] args) {
        String examplePhoneNumber = "Hello, My name is Paul. My phone is: +375 (29) 123-45-67. I'm 99 y. old. +375 (99) 678-45-67 Another phone +375 (33) 678-45-67. Some text.";
        Pattern p = Pattern.compile(PHONE_REGEX);
        Matcher m = p.matcher(examplePhoneNumber);
        boolean b = m.find();
//        System.out.println(m.groupCount());
        System.out.println(b);
        System.out.println(m.group());
        final boolean b1 = m.find();
        System.out.println(m.group());
//        System.out.println(m.start());
//        System.out.println(m.end());
    }
}
