package com.epam.jwd.example.model;

public class Spaceship {
    private int weight;
    private Human[] crew;
    private Human pilot;

    Spaceship(int weight, Human[] crew, Human pilot) {
        this.weight = weight;
        this.crew = crew;
        this.pilot = pilot;
    }

    public int getWeight() {
        return weight;
    }

    public Human[] getCrew() {
        return crew;
    }

    public Human getPilot() {
        return pilot;
    }
}
