package com.epam.jwd.lecture.decorator.api;

import com.epam.jwd.lecture.model.Point;

public interface FigurePreProcessor {
    void preProcess(Point... points) throws FigureException;
}
