package com.epam.jwd.example.app;

import com.epam.jwd.example.model.Driver;
import com.epam.jwd.example.model.Navigator;
import com.epam.jwd.example.model.Human;

public class Main {


    public static void main(String[] args) {
        int amountOfRecords = 4;
        final Navigator navigator = new Navigator("Los Angeles");
        System.out.println(navigator.buildRote());
        navigator.changeToWalking();
        System.out.println(navigator.buildRote());
        Human[] c = new Driver[]{};
        printPeople(c);
    }

    private static void printPeople(Human[] c) {
        for (Human i : c) {
            System.out.println(i);
        }
    }
}

class XMLParser {

}
