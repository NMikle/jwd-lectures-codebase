package com.epam.jwd.route;

public class DrivingRoteStrategy implements RouteBuildStrategy {
    @Override
    public String buildRote(String location) {
        return "driving by car to " + location;
    }
}
