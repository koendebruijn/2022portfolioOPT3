package com.koendebruijn.portfolio.models;

import java.util.Objects;
import java.util.UUID;

public final class Drill extends Rentable {
    private final UUID id;
    private final String brand;
    private final String type;

    public Drill(UUID id, String brand, String type) {
        this.id = id;
        this.brand = brand;
        this.type = type;
    }

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

    public UUID getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, type);
    }

    @Override
    public String toString() {
        return "Drill[" +
                "id=" + id + ", " +
                "brand=" + brand + ", " +
                "type=" + type + ']';
    }

}
