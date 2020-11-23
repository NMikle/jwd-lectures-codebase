package com.epam.jwd.example.route.impl;

import com.epam.jwd.example.route.RouteBuildStrategy;

public class DrivingRoteStrategy implements RouteBuildStrategy {
    @Override
    public String buildRote(String location) {
        return "driving by car to " + location;
    }
}
