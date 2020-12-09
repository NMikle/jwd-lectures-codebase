package com.epam.jwd.lecture.model;

public class FactoryExample {

    private PreProcessor[] preProcessors;
    private PostProcessor[] postProcessors;

    public Figure create(String type, Point... points) throws NoSuchMethodException {

        for (PreProcessor preProcessor : preProcessors) {
            preProcessor.process(points);
        }
        Figure figure;
        switch (type) {
            case "triangle":
                figure = new Triangle();
                break;
            case "square":
                figure = new Square("name");
                break;
            default:
                throw new NoSuchMethodException("Figure not implemented");
        }
        for (PostProcessor postProcessor : postProcessors) {
            figure = postProcessor.process(figure);
        }
        return figure;
    }

}
