package com.epam.jwd.lecture.decorator.impl;

import com.epam.jwd.lecture.decorator.api.FigureException;
import com.epam.jwd.lecture.decorator.api.FigurePostProcessor;
import com.epam.jwd.lecture.model.Figure;

public class FigureExistencePostProcessor implements FigurePostProcessor {
    @Override
    public Figure process(Figure figure) throws FigureException {
        System.out.println("Checking figure existence");
        if (!exists(figure)) {
            throw new FigureNotExistsException("Figure does not exist");
        }
        return figure;
    }

    private boolean exists(Figure figure) {
        return true; //todo: implementation
    }
}
