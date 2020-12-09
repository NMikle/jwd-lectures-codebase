package com.epam.jwd.lecture.app;

import com.epam.jwd.lecture.model.Square;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Square> figures = new ArrayList<>();
        figures.add(new Square("A"));
        figures.add(new Square("B"));
        figures.add(new Square("C"));
        Iterator<Square> figureIterator = figures.iterator();
        while (figureIterator.hasNext()) {
            Square square = figureIterator.next();
            figures.remove(square);
        }
    }

}
