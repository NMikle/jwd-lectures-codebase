package com.epam.jwd.example.route.impl;

import com.epam.jwd.example.route.RouteBuildStrategy;

public class WalkingRoteStrategy implements RouteBuildStrategy {
    @Override
    public String buildRote(String location) {
        return "walking to " + location;
    }
}
