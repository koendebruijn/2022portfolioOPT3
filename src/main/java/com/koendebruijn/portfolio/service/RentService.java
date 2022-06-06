package com.koendebruijn.portfolio.service;

import com.koendebruijn.portfolio.models.Rentable;
import com.koendebruijn.portfolio.repository.CarRepository;
import com.koendebruijn.portfolio.repository.DrillRepository;
import com.koendebruijn.portfolio.repository.Repository;
import com.koendebruijn.portfolio.repository.TruckRepository;

import java.util.ArrayList;
import java.util.List;

public class RentService {

    private static final RentService instance = new RentService();
    private final List<Repository<? extends Rentable>> repositories = List.of(
            CarRepository.getInstance(),
            DrillRepository.getInstance(),
            TruckRepository.getInstance()
    );

    private RentService() {}

    public static RentService getInstance() {
        return instance;
    }

    public List<Rentable> getAllRentable() {
        List<Rentable> rentable = new ArrayList<>();
        repositories.forEach(repository -> rentable.add((Rentable) repository.findAll()));
        return rentable;
    }

}
