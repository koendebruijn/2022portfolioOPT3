package com.koendebruijn.portfolio.repository;

import com.koendebruijn.portfolio.model.Truck;

public class TruckRepository extends Repository<Truck>{

    private static final TruckRepository INSTANCE = new TruckRepository();

    private TruckRepository() {
    }

    public static TruckRepository getInstance() {
        return INSTANCE;
    }
}
