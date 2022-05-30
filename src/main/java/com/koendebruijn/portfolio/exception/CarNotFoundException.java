package com.koendebruijn.portfolio.exception;

public class CarNotFoundException extends RuntimeException {
    public CarNotFoundException(Long carId) {
        super(String.format("Car with id: %d not found", carId));
    }
}
