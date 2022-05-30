package com.koendebruijn.portfolio.exception;

public class TruckNotFoundException extends RuntimeException {
    public TruckNotFoundException(Long id) {
            super(String.format("Truck with id: %d not found", id));
    }
}
