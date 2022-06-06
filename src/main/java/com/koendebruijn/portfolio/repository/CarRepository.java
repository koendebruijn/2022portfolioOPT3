package com.koendebruijn.portfolio.repository;

import com.koendebruijn.portfolio.models.Car;

public class CarRepository extends Repository<Car> {

    private static final CarRepository INSTANCE = new CarRepository();

    private CarRepository() {
    }

    public static CarRepository getInstance() {
        return INSTANCE;
    }
}
