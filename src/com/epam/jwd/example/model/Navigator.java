package com.epam.jwd.example.model;

import com.epam.jwd.example.route.impl.DrivingRoteStrategy;
import com.epam.jwd.example.route.RouteBuildStrategy;
import com.epam.jwd.example.route.impl.WalkingRoteStrategy;

public class Navigator {

    private RouteBuildStrategy strategy;
    private String location;

    public Navigator(String location) {
        this.strategy = new DrivingRoteStrategy();
        this.location = location;
    }

    public String buildRote() {
        return strategy.buildRote(location);
    }

    public void changeToWalking() {
        this.strategy = new WalkingRoteStrategy();
    }

    public void changeToDriving() {
        this.strategy = new DrivingRoteStrategy();
    }

    public RouteBuildStrategy getStrategy() {
        return strategy;
    }
}
