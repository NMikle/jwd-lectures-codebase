package com.epam.jwd.lecture.decorator.api;

import com.epam.jwd.lecture.model.Figure;
import com.epam.jwd.lecture.model.Point;

public interface FigureFactory {
    Figure createFigure(String type, Point... points);
}
