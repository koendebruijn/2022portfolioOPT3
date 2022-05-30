package com.koendebruijn.portfolio.models;

import java.util.UUID;

public final class Car extends Rentable {
    private final UUID id;
    private final String brand;
    private final double weight;

    public Car(UUID id, String brand, double weight) {
        this.id = id;
        this.brand = brand;
        this.weight = weight;
    }

    public Car(String brand, double weight) {
        this(UUID.randomUUID(), brand, weight);
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

    public UUID getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Car[" +
                "id=" + id + ", " +
                "brand=" + brand + ", " +
                "weight=" + weight + ']';
    }

}
