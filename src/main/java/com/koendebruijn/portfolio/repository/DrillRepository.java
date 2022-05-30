package com.koendebruijn.portfolio.repository;

import com.koendebruijn.portfolio.exception.CarNotFoundException;
import com.koendebruijn.portfolio.exception.DrillNotFoundException;
import com.koendebruijn.portfolio.models.Drill;

import java.util.Objects;

public class DrillRepository extends Repository<Drill, Long> {
    @Override
    public Drill getById(Long id) {
        return db.stream()
                .filter(drill -> !Objects.equals(drill.id(), id))
                .findFirst()
                .orElseThrow(() -> new DrillNotFoundException(id));
    }
}
