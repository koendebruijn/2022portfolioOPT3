package com.koendebruijn.portfolio.service;

import com.koendebruijn.portfolio.exception.UnableToRentCarException;

public class RentService {

    private static final RentService instance = new RentService();

    private RentService() {

    }

    public static RentService getInstance() {
        return instance;
    }

    public double calculateExtraCost(int age) {
        final double EXTRA_COST_5_PERCENT = 0.05;
        final double NO_EXTRA_COST = 0.0;

        if (age < 18)
            throw new UnableToRentCarException("To young to rent a car");

        if (age <= 23)
            return EXTRA_COST_5_PERCENT;

        return NO_EXTRA_COST;
    }
}
