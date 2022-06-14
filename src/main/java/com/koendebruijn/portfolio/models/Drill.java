package com.koendebruijn.portfolio.models;

public final class Drill extends Rentable {
    public static final int RENT_PER_DAY = 5;
    public static final int INSURANCE_PER_DAY = 1;
    private final String brand;
    private final String type;

    public Drill(String brand, String type) {
        super();
        this.brand = brand;
        this.type = type;
    }

    @Override
    protected double calculateRent(int daysRented) {
        return RENT_PER_DAY * daysRented;
    }

    @Override
    protected double calculateInsurance(int daysRented) {
        return INSURANCE_PER_DAY * daysRented;
    }


    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("%s (type: %s)", brand, type);
    }
}
