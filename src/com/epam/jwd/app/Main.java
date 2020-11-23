package com.epam.jwd.app;

import com.epam.jwd.model.Driver;
import com.epam.jwd.model.Human;
import com.epam.jwd.model.Navigator;

public class Main {
    public static void main(String[] args) {
        final Navigator navigator = new Navigator("Los Angeles");
        System.out.println(navigator.buildRote());
        navigator.changeToWalking();
        System.out.println(navigator.buildRote());
        Human[] c = new Driver[]{};
        for (Human i : c) {
            System.out.println(i);
        }
    }
}
