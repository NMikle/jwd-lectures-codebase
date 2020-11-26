package com.epam.jwd.lecture.route.impl;

import com.epam.jwd.lecture.route.RouteBuildStrategy;

public class WalkingRoteStrategy implements RouteBuildStrategy {
    @Override
    public String buildRote(String location) {
        return "walking to " + location;
    }
}
