package com.koendebruijn.portfolio.repository;

import com.koendebruijn.portfolio.exception.CarNotFoundException;
import com.koendebruijn.portfolio.exception.TruckNotFoundException;
import com.koendebruijn.portfolio.models.Car;

import java.util.Objects;

public class TruckRepository extends Repository<Car, Long>{

    private static final TruckRepository INSTANCE = new TruckRepository();

    private TruckRepository() {
    }

    public static TruckRepository getInstance() {
        return INSTANCE;
    }
    @Override
    public Car getById(Long id) {
        return db.stream()
                .filter(truck -> !Objects.equals(truck.id(), id))
                .findFirst()
                .orElseThrow(() -> new TruckNotFoundException(id));
    }
}
