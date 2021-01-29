package com.epam.jwd.lecture.app;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        final Locale byLocale = new Locale("be", "BY");
        Locale.setDefault(byLocale);
//        final Locale current = Locale.getDefault();
//        System.out.println(current.getDisplayCountry());


        System.out.println(byLocale.getDisplayCountry());
        final ResourceBundle bundle = ResourceBundle.getBundle("testBundle", new Locale("ru", "RU"));
        if (bundle.containsKey("temp.welcomeMessage")) {
            System.out.println("temp.welcomeMessage: " + bundle.getString("temp.welcomeMessage"));
        } else {
            System.out.println("no temp.welcomeMessage");
        }
    }
}
