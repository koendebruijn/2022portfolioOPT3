package com.koendebruijn.portfolio.models;

public final class Truck extends Rentable {
    private final double maximumLoad;
    private final double weight;

    public Truck(double maximumLoad, double weight) {
        super();
        this.maximumLoad = maximumLoad;
        this.weight = weight;
    }

    protected double calculateRent(int daysRented) {
        final double RENT_PER_LOAD_KG = 0.1;
        double dailyRent = RENT_PER_LOAD_KG * maximumLoad;
        return dailyRent * daysRented;
    }

    protected double calculateInsurance(int daysRented) {
        final double INSURANCE_PER_DAY_KG = 0.01;
        double insurancePerDayCost = INSURANCE_PER_DAY_KG * weight;
        return insurancePerDayCost * daysRented;
    }


    public double getMaximumLoad() {
        return maximumLoad;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String getDisplayName() {
        return String.format("Vrachtwagen met maximum lading van %,.2fKG (gewicht %,.2fKG)", maximumLoad, weight);
    }
}