package com.koendebruijn.portfolio.models;

import java.util.UUID;

public final class Truck extends Rentable {
    private final UUID id;
    private final double maximumLoad;
    private final double weight;

    public Truck(UUID id, double maximumLoad, double weight) {
        this.id = id;
        this.maximumLoad = maximumLoad;
        this.weight = weight;
    }

    public Truck(double maximumLoad, double weight) {
        this(UUID.randomUUID(), maximumLoad, weight);
    }

    public double calculateRent(int daysRented) {
        final double RENT_PER_LOAD_KG = 0.1;
        double dailyRent = RENT_PER_LOAD_KG * maximumLoad;
        return dailyRent * daysRented;
    }

    public double calculateInsurance(int daysRented) {
        final double INSURANCE_PER_DAY_KG = 0.01;
        double insurancePerDayCost = INSURANCE_PER_DAY_KG * weight;
        return insurancePerDayCost * daysRented;
    }

    public UUID getId() {
        return id;
    }

    public double getMaximumLoad() {
        return maximumLoad;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Truck[" +
                "id=" + id + ", " +
                "maximumLoad=" + maximumLoad + ", " +
                "weight=" + weight + ']';
    }

}