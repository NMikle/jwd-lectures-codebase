package com.epam.jwd.lecture.generic;

import com.epam.jwd.lecture.model.Square;

public class SquareService implements FigureService<Square> {
    @Override
    public Square[] findAll() {
        return new Square[0];
    }

    @Override
    public void save(Square figure) {
    }
}
