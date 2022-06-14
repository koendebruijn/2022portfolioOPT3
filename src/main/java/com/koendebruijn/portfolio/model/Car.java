package com.koendebruijn.portfolio.model;

public final class Car extends Rentable {
    private static final double INSURANCE_COST_PER_DAY_KG = 0.01;
    private static final double RENT_PRICE_PER_DAY = 50;

    private final String brand;
    private final double weight;

    public Car(String brand, double weight) {
        super();
        this.brand = brand;
        this.weight = weight;
    }

    protected double calculateRent(int daysRented) {
        return RENT_PRICE_PER_DAY * daysRented;
    }

    @Override
    protected double calculateInsurance(int daysRented) {
        double insurancePerDayCost = INSURANCE_COST_PER_DAY_KG * weight;
        return insurancePerDayCost * daysRented;
    }

    public String toString() {
        return String.format("%s (gewicht %,.2fKG)", brand, weight);
    }

    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }
}
