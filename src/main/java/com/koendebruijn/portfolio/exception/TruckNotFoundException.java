package com.koendebruijn.portfolio.exception;

import java.util.UUID;

public class TruckNotFoundException extends RuntimeException {
    public TruckNotFoundException(UUID id) {
            super(String.format("Truck with id: %s not found", id));
    }
}
