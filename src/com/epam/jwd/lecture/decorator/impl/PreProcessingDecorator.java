package com.epam.jwd.lecture.decorator.impl;

import com.epam.jwd.lecture.decorator.api.FigureFactory;
import com.epam.jwd.lecture.decorator.api.FigurePreProcessor;
import com.epam.jwd.lecture.model.Figure;
import com.epam.jwd.lecture.model.Point;

public class PreProcessingDecorator implements FigureFactory {

    private final FigurePreProcessor[] preProcessors = new FigurePreProcessor[] {new DuplicatePointsPreProcessor()};

    private final FigureFactory figureFactory;

    public PreProcessingDecorator(FigureFactory figureFactory) {
        this.figureFactory = figureFactory;
    }

    @Override
    public Figure createFigure(String type, Point... points) {
        System.out.println("Running PreProcessors");
        for (FigurePreProcessor preProcessor : preProcessors) {
            preProcessor.preProcess(points);
        }
        return figureFactory.createFigure(type, points);
    }

}
