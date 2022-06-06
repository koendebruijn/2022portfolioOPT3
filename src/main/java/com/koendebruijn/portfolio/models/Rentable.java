package com.koendebruijn.portfolio.models;

import java.util.UUID;

public abstract class Rentable {
    protected boolean isRented = false;
    protected UUID id;

    public Rentable() {
        this.id = UUID.randomUUID();
    }

    protected abstract double calculateRent(int daysRented);

    protected abstract double calculateInsurance(int daysRented);

    public double getTotalCost(int daysRented, boolean isInsured) {
        double costs = calculateRent(daysRented);

        if (isInsured) {
            costs += calculateInsurance(daysRented);
        }

        return costs;
    }

    public boolean isRented() {
        return isRented;
    }

    public UUID getId() {
        return id;
    }

    public abstract String getDisplayName();
}
