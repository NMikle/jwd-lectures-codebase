package com.epam.jwd.lecture.exception;

public class CatReader implements AutoCloseable {

    public Cat[] read() {
        //todo: read from somewhere
        System.out.println("Reading cats...");
//        throw new MeowException("Just exception");
        return new Cat[]{new Cat("Barsik")};
    }

    @Override
    public void close() {
        System.out.println("Closed resource used for reading cats");
        throw new MeowException("Meow exception from close");
    }
}
