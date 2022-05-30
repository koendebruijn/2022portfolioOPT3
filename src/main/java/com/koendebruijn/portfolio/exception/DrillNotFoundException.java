package com.koendebruijn.portfolio.exception;

import java.util.UUID;

public class DrillNotFoundException extends RuntimeException {
    public DrillNotFoundException(UUID id) {
        super(String.format("Car with id: %s not found", id));
    }
}
