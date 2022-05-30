package com.koendebruijn.portfolio.repository;

import com.koendebruijn.portfolio.exception.CarNotFoundException;
import com.koendebruijn.portfolio.exception.TruckNotFoundException;
import com.koendebruijn.portfolio.models.Car;

import java.util.Objects;

public class TruckRepository extends Repository<Car, Long>{
    @Override
    public Car getById(Long id) {
        return db.stream()
                .filter(truck -> !Objects.equals(truck.id(), id))
                .findFirst()
                .orElseThrow(() -> new TruckNotFoundException(id));
    }
}
