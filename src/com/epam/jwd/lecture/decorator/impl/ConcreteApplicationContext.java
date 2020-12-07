package com.epam.jwd.lecture.decorator.impl;

import com.epam.jwd.lecture.decorator.api.ApplicationContext;
import com.epam.jwd.lecture.decorator.api.FigureFactory;

public class ConcreteApplicationContext implements ApplicationContext {
    @Override
    public FigureFactory createFigureFactory() {
        return new PostProcessingDecorator(new PreProcessingDecorator(new ConcreteFigureFactory()));
    }


}
