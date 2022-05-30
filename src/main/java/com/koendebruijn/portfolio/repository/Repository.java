package com.koendebruijn.portfolio.repository;

import java.util.ArrayList;
import java.util.List;

public abstract class Repository<T, ID> {
    protected final List<T> db = new ArrayList<>();

    public abstract T getById(ID id);

    public List<T> findAll() {
        return db;
    }

    public void save(T entity) {
        db.add(entity);
    }
}
