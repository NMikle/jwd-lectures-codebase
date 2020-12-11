package com.epam.jwd.lecture.model;

import java.util.Objects;

public class Square implements Figure {
    private final String name;

    public Square(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Square)) return false;
//
//        Square square = (Square) o;
//
//        return Objects.equals(name, square.name);
//    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Square: " + name;
    }
}
