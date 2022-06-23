package com.koendebruijn.portfolio.service;

public class RentService {
    private static final RentService INSTANCE = new RentService();

    public static RentService getInstance() {
        return INSTANCE;
    }

    public double calculateExtraCost(int age) {
        final double EXTRA_COST_5_PERCENT = 0.05;
        final double NO_EXTRA_COST = 0.0;

        if (age < 18)
            throw new RuntimeException("To young to rent a car");

        if (age <= 23)
            return EXTRA_COST_5_PERCENT;

        return NO_EXTRA_COST;
    }
}
