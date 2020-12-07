package com.epam.jwd.lecture.decorator.impl;

import com.epam.jwd.lecture.decorator.api.FigureException;

public class FigureNotExistsException extends FigureException {
    public FigureNotExistsException(String message) {
        super(message);
    }
}
