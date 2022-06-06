package com.koendebruijn.portfolio.repository;

import com.koendebruijn.portfolio.models.Rentable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Repository<T extends Rentable> {
    protected final List<T> db = new ArrayList<>();

    public T getById(UUID id) {
        return db.stream()
                .filter(entity -> entity.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(String.format("Entity with ID: %s not found", id)));
    }

    public List<T> findAll() {
        return db;
    }

    public void save(T entity) {
        db.add(entity);
    }
}
