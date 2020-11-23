package com.epam.jwd.model;

import com.epam.jwd.route.DrivingRoteStrategy;
import com.epam.jwd.route.RouteBuildStrategy;
import com.epam.jwd.route.WalkingRoteStrategy;

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
