package com.epam.jwd.lecture.app;

import com.epam.jwd.lecture.clone.ToBeCloned;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        ToBeCloned initialObj = initializeObj();

        ToBeCloned clonedObj = initialObj.clone();

        printResults(initialObj, clonedObj);
    }

    private static void printResults(ToBeCloned initialObj, ToBeCloned clonedObj) {
        System.out.println(initialObj == clonedObj);
        System.out.println(initialObj.getMutableField() == clonedObj.getMutableField());
        clonedObj.getMutableField().add("Potato");
//        clonedObj.setMutableField(Collections.singletonList("Potato"));
        System.out.println(clonedObj.getMutableField());
        System.out.println(initialObj.getMutableField());
    }

    private static ToBeCloned initializeObj() {
        final List<String> listOfFood = new ArrayList<>();
        listOfFood.add("Banana");
        listOfFood.add("Apple");

        final Vector<String> anotherList = new Vector<>();
        anotherList.add("First");
        anotherList.add("Second");

        return new ToBeCloned("hey", 12, listOfFood, anotherList);
    }
}
