package com.koendebruijn.portfolio.models;

import java.util.UUID;

public record Truck(UUID id, double maximumLoad, double weight) implements Rentable {
    @Override
    public double calculateRent(int daysRented) {
        final double RENT_PER_LOAD_KG = 0.1;
        double dailyRent = RENT_PER_LOAD_KG * maximumLoad;
        return dailyRent * daysRented;
    }

    @Override
    public double calculateInsurance(int daysRented) {
        final double INSURANCE_PER_DAY_KG = 0.01;
        double insurancePerDayCost = INSURANCE_PER_DAY_KG * weight;
        return insurancePerDayCost * daysRented;
    }
}