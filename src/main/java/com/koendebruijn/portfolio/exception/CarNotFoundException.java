package com.koendebruijn.portfolio.exception;

import java.util.UUID;

public class CarNotFoundException extends RuntimeException {
    public CarNotFoundException(UUID id) {
        super(String.format("Car with id: %s not found", id));
    }
}
