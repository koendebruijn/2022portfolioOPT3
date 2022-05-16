package com.koendebruijn.portfolio.models;

public class Plane {
    private int weight;

    public Plane(int weight) {
        this.weight = weight;
    }

    public boolean canTakeoff(int headwindSpeed, boolean hasPermission) {
        throw new UnsupportedOperationException();
    }

    public int getWeight() {
        return weight;
    }
}
