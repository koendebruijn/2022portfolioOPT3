package com.koendebruijn.portfolio.models;

import java.util.UUID;

public record Drill(UUID id, String brand, String type) implements Rentable {

    public Drill(String brand, String type) {
        this(UUID.randomUUID(), brand, type);
    }
    @Override
    public double calculateRent(int daysRented) {
        final int RENT_PER_DAY = 5;
        return RENT_PER_DAY * daysRented;
    }

    @Override
    public double calculateInsurance(int daysRented) {
        final int INSURANCE_PER_DAY = 1;
        return INSURANCE_PER_DAY * daysRented;
    }
}
