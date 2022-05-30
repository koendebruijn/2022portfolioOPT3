package com.koendebruijn.portfolio.repository;

import com.koendebruijn.portfolio.exception.CarNotFoundException;
import com.koendebruijn.portfolio.models.Car;

import java.util.Objects;
import java.util.UUID;

public class CarRepository extends Repository<Car, UUID> {

    private static final CarRepository INSTANCE = new CarRepository();

    private CarRepository() {
    }

    public static CarRepository getInstance() {
        return INSTANCE;
    }

    @Override
    public Car getById(UUID id) {
        return db.stream()
                .filter(car -> car.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new CarNotFoundException(id));
    }
}
