package com.epam.jwd.lecture.decorator.impl;

import com.epam.jwd.lecture.decorator.api.FigureFactory;
import com.epam.jwd.lecture.model.Figure;
import com.epam.jwd.lecture.model.Point;

public class ConcreteFigureFactory implements FigureFactory {

    @Override
    public Figure createFigure(String type, Point... points) {
        //todo: switch with figure creation
        System.out.println("Creating figure");
        return null;
    }

}
