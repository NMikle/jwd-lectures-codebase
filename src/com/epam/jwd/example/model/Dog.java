package com.epam.jwd.example.model;

public final class Dog {

    public static final int SMALLEST_DOG_AGE = 1;

    private final String name;
    private final int age;

    Dog(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public final String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Dog newInstance(final String name, final int age) {
        return new Dog(name, age);
    }

}
