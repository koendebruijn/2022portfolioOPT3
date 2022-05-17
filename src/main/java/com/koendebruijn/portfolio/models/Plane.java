package com.koendebruijn.portfolio.models;

public record Plane(int weight, int passengers, boolean isDutch) {

    public Plane(int weight) {
        this(weight, 1, false);
    }

    public boolean canTakeoff(int headwindSpeed, boolean hasPermission) {
        final int MAX_WEIGHT = 3500;
        final int MAX_HEADWIND_SPEED_KMH = 50;

        return hasPermission &&
                        (this.weight < MAX_WEIGHT) &&
                        (headwindSpeed < MAX_HEADWIND_SPEED_KMH);
    }

    public double calculateLandingCosts(boolean needsToHandleLuggage) {
        double landingCosts = 100;

        if (weight >= 1000 && weight < 5000) {
            landingCosts = 500;
        }

        if (weight >= 5000) {
            landingCosts = 2500;
        }

        if (passengers > 2) {
            final double EXTRA_PASSENGERS_MULTIPLIER = 1.5;
            landingCosts *= EXTRA_PASSENGERS_MULTIPLIER;
        }

        if (needsToHandleLuggage) {
            final int HANDLE_LUGGAGE_COST = 800;
            landingCosts += HANDLE_LUGGAGE_COST;
        }

        if (isDutch) {
            final double BTW_PERCENTAGE = 1.21;
            landingCosts *= BTW_PERCENTAGE;
        }

        return landingCosts;
    }
}
