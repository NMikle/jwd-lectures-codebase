package com.epam.jwd.lecture.generic;

import com.epam.jwd.lecture.model.Figure;

public interface FigureService<T extends Figure> {

    T[] findAll();

    void save(T figure);

}