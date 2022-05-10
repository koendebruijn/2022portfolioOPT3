package com.koendebruijn.portfolio.service;

import com.koendebruijn.portfolio.exception.UnableToRentCarException;
import org.jetbrains.annotations.NotNull;

public class RentService {

    private static final RentService instance = new RentService();

    private RentService() {

    }

    public static RentService getInstance() {
        return instance;
    }

    public double calculateExtraCost(int age) {
        if (age < 18)
            throw new UnableToRentCarException("To young to rent a car");

        if (age <= 23)
            return 0.05;

        return 0.0;
    }
}
