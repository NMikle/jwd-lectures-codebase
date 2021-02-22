package com.epam.jwd.lecture.generic;

import com.epam.jwd.lecture.model.Figure;

/**
 * Service that stores figures and acts like an array
 *
 * @param <T> defines figure this service works with
 */
public interface FigureService<T extends Figure> extends Iterable<T> {

    /**
     * Method is used to retrieve all saved figures
     *
     * @return all found figures
     */
    T[] findAll();

    void save(T figure);

}
