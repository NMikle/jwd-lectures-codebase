package com.epam.jwd.lecture.route.impl;

import com.epam.jwd.lecture.route.RouteBuildStrategy;

public class DrivingRoteStrategy implements RouteBuildStrategy {
    @Override
    public String buildRote(String location) {
        return "driving by car to " + location;
    }
}
