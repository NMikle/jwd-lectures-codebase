package com.epam.jwd.lecture.serialization;

import com.epam.jwd.lecture.model.Figure;
import com.epam.jwd.lecture.model.Square;

public class CouldNotSerialize {

    private final Square a;

    public CouldNotSerialize() {
        this.a = new Square("a");
    }

    public CouldNotSerialize(Square a) {
        this.a = a;
    }

    public Figure getA() {
        return a;
    }

    @Override
    public String toString() {
        return "CouldNotSerialize{" +
                "a=" + a +
                '}';
    }
}
