package com.epam.jwd.lecture.model;

public class SpaceshipFactory {

    private final static Human BEST_PILOT_IN_THE_WORLD = new Driver(58L);


    private static Spaceship[] allCreatedSpaceships = new Spaceship[32];
    private static int amountOfSpaceships = 0;

    public static Spaceship buildSpaceship(int weight) {
        final Spaceship spaceship = fetchFromCacheOrCreate(weight);
        return spaceship;
    }

    private static Spaceship fetchFromCacheOrCreate(int weight) {
        for (Spaceship allCreatedSpaceship : allCreatedSpaceships) {
            if (allCreatedSpaceship != null && allCreatedSpaceship.getWeight() == weight) {
                return allCreatedSpaceship;
            }
        }
        final Spaceship spaceship = new Spaceship(weight, buildCrew(), BEST_PILOT_IN_THE_WORLD);
        allCreatedSpaceships[amountOfSpaceships] = spaceship;
        amountOfSpaceships++;
        return spaceship;
    }

    private static Human[] buildCrew() {
        return new Human[0];
    }

}
