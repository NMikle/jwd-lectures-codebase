package com.epam.jwd.lecture.decorator.impl;

import com.epam.jwd.lecture.decorator.api.FigureException;
import com.epam.jwd.lecture.decorator.api.FigurePreProcessor;
import com.epam.jwd.lecture.model.Point;

public class DuplicatePointsPreProcessor implements FigurePreProcessor {
    @Override
    public void preProcess(Point... points) throws FigureException {
        System.out.println("duplicate points check");
        //todo: check on duplicates
    }
}
