package com.epam.jwd.lecture.app;

import com.epam.jwd.lecture.decorator.api.ApplicationContext;
import com.epam.jwd.lecture.decorator.api.FigureFactory;
import com.epam.jwd.lecture.decorator.impl.ConcreteApplicationContext;
import com.epam.jwd.lecture.model.Point;

public class Main {

    public static void main(String[] args) {
        final ApplicationContext applicationContext = new ConcreteApplicationContext();


        final FigureFactory figureFactory = applicationContext.createFigureFactory();
        figureFactory.createFigure("type", new Point());
    }


}
