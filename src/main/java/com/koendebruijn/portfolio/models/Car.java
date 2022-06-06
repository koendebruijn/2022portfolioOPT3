package com.koendebruijn.portfolio.models;

public final class Car extends Rentable {
    private final String brand;
    private final double weight;

    public Car(String brand, double weight) {
        super();
        this.brand = brand;
        this.weight = weight;
    }

    protected double calculateRent(int daysRented) {
        double RENT_PRICE_PER_DAY = 50;
        return RENT_PRICE_PER_DAY * daysRented;
    }

    @Override
    protected double calculateInsurance(int daysRented) {
        double INSURANCE_COST_PER_DAY_KG = 0.01;
        double insurancePerDayCost = INSURANCE_COST_PER_DAY_KG * weight;
        return insurancePerDayCost * daysRented;
    }

    @Override
    public String getDisplayName() {
        return String.format("%s (gewicht %,.2fKG)", brand, weight);
    }

    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }
}
