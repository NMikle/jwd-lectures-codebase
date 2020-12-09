package com.epam.jwd.lecture.model;

public class Square implements Figure {
    private final String name;

    public Square(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Square: " + name;
    }
}
