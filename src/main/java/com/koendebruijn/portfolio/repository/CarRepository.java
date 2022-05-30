package com.koendebruijn.portfolio.repository;

import com.koendebruijn.portfolio.exception.CarNotFoundException;
import com.koendebruijn.portfolio.models.Car;

import java.util.Objects;

public class CarRepository extends Repository<Car, Long> {

    @Override
    public Car getById(Long id) {
        return db.stream()
                .filter(c -> !Objects.equals(c.id(), id))
                .findFirst()
                .orElseThrow(() -> new CarNotFoundException(id));
    }
}
