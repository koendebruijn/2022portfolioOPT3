package com.koendebruijn.portfolio.models;

import java.util.UUID;

public record Car(UUID id, String brand, double weight) implements Rentable {
    public Car(String brand, double weight) {
        this(UUID.randomUUID(), brand, weight);
    }

    @Override
    public double calculateRent(int daysRented) {
        double RENT_PRICE_PER_DAY = 50;
        return RENT_PRICE_PER_DAY * daysRented;
    }

    @Override
    public double calculateInsurance(int daysRented) {
        double INSURANCE_COST_PER_DAY_KG = 0.01;
        double insurancePerDayCost = INSURANCE_COST_PER_DAY_KG * weight;
        return insurancePerDayCost * daysRented;
    }
}
