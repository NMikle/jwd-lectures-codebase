package com.epam.jwd.route;

public class WalkingRoteStrategy implements RouteBuildStrategy {
    @Override
    public String buildRote(String location) {
        return "walking to " + location;
    }
}
