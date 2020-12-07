package com.epam.jwd.lecture.decorator.impl;

import com.epam.jwd.lecture.decorator.api.FigureFactory;
import com.epam.jwd.lecture.decorator.api.FigurePostProcessor;
import com.epam.jwd.lecture.model.Figure;
import com.epam.jwd.lecture.model.Point;

public class PostProcessingDecorator implements FigureFactory {
    private final FigurePostProcessor[] postProcessors = new FigurePostProcessor[]{new FigureExistencePostProcessor()};

    private final FigureFactory figureFactory;

    public PostProcessingDecorator(FigureFactory figureFactory) {
        this.figureFactory = figureFactory;
    }

    @Override
    public Figure createFigure(String type, Point... points) {
        Figure figure = figureFactory.createFigure(type, points);
        System.out.println("Running PostProcessors");
        for (FigurePostProcessor postProcessor : postProcessors) {
            figure = postProcessor.process(figure);
        }
        return figure;
    }
}
