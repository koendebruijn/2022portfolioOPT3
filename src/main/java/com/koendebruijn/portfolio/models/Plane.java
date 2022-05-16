package com.koendebruijn.portfolio.models;

public record Plane(int weight) {

    public boolean canTakeoff(int headwindSpeed, boolean hasPermission) {
        final int MAX_WEIGHT = 3500;
        final int MAX_HEADWIND_SPEED_KMH = 50;

        return hasPermission && (weight < MAX_WEIGHT) && (headwindSpeed < MAX_HEADWIND_SPEED_KMH);
    }
}
