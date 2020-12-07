package com.epam.jwd.lecture.decorator.api;

import com.epam.jwd.lecture.model.Figure;

public interface FigurePostProcessor {

    Figure process(Figure figure) throws FigureException;

}
