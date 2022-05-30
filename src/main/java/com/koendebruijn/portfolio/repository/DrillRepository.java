package com.koendebruijn.portfolio.repository;

import com.koendebruijn.portfolio.exception.DrillNotFoundException;
import com.koendebruijn.portfolio.models.Drill;

import java.util.Objects;
import java.util.UUID;

public class DrillRepository extends Repository<Drill, UUID> {
    private static final DrillRepository INSTANCE = new DrillRepository();

    private DrillRepository() {
    }

    public static DrillRepository getInstance() {
        return INSTANCE;
    }

    @Override
    public Drill getById(UUID id) {
        return db.stream()
                .filter(drill -> drill.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new DrillNotFoundException(id));
    }
}
