package com.koendebruijn.portfolio.service;

public class RentService {

    private static final RentService instance = new RentService();

    private RentService() {

    }

    public static RentService getInstance() {
        return instance;
    }

    public double calculateExtraCost(int age) {
        return 0.0;
    }
}
