package com.epam.jwd.lecture.generic;

import com.epam.jwd.lecture.model.Figure;

import java.util.Arrays;
import java.util.Iterator;

public class UniversalFigureService<T extends Figure> implements FigureService<T> {

    private T[] figures;
    private int amountOfFigures;

    public UniversalFigureService(T[] figures) {
        this.figures = figures.length != 0 ? figures : Arrays.copyOf(figures, 16);
        for (T figure : figures) {
            if (figure != null) {
                amountOfFigures++;
            }
        }
    }

    @Override
    public T[] findAll() {
        return figures;
    }

    @Override
    public void save(T figure) {
        if (amountOfFigures == figures.length) {
            figures = Arrays.copyOf(figures, amountOfFigures + 16);
        }
        figures[amountOfFigures] = figure;
        amountOfFigures++;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int pointer = 0;

            @Override
            public boolean hasNext() {
                return pointer != amountOfFigures;
            }

            @Override
            public T next() {
                return figures[pointer++];
            }
        };
    }
}
