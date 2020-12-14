package com.epam.jwd.lecture.model;

public class Square implements Figure, Comparable<Square> {
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

    @Override
    public int compareTo(Square otherSquare) {
        return this.name.compareTo(otherSquare.name);
    }

    public static int comparingByNames(Square o1, Square o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getName(), o2.getName());
    }
}
