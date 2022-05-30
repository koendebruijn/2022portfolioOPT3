package com.koendebruijn.portfolio.repository;

import com.koendebruijn.portfolio.exception.TruckNotFoundException;
import com.koendebruijn.portfolio.models.Truck;

import java.util.UUID;

public class TruckRepository extends Repository<Truck, UUID>{

    private static final TruckRepository INSTANCE = new TruckRepository();

    private TruckRepository() {
    }

    public static TruckRepository getInstance() {
        return INSTANCE;
    }
    @Override
    public Truck getById(UUID id) {
        return db.stream()
                .filter(truck -> truck.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new TruckNotFoundException(id));
    }
}
