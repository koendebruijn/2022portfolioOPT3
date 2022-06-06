package com.koendebruijn.portfolio.repository;

import com.koendebruijn.portfolio.models.Drill;

public class DrillRepository extends Repository<Drill> {
    private static final DrillRepository INSTANCE = new DrillRepository();

    private DrillRepository() {
    }

    public static DrillRepository getInstance() {
        return INSTANCE;
    }
}
