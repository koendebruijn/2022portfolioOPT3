package com.koendebruijn.portfolio.service;

import com.koendebruijn.portfolio.exception.UnableToRentCarException;
import com.koendebruijn.portfolio.service.RentService;
import org.junit.Assert;
import org.testng.annotations.Test;

public class RentServiceTest {
    private final RentService underTest = RentService.getInstance();

    @Test
    public void calculateExtraCost_ShouldThrow_AgeUnder18() {
        // Given
        int age = 17;

        // When
        Assert.assertThrows(UnableToRentCarException.class, () -> underTest.calculateExtraCost(age));
    }

    @Test
    public void calculateExtraCost_ShouldGiveExtraCost_AgeUnder23() {
        // Given
        int age = 21;
        double expected = 0.05;

        // When
        double extraCosts = underTest.calculateExtraCost(age);

        // Then
        Assert.assertEquals(expected, extraCosts, 0.1);
    }

    @Test
    public void calculateExtraCost_ShouldGiveNoExtraCost_AgeOver23() {
        // Given
        int age = 24;
        double expected = 0.00;

        // When
        double extraCosts = underTest.calculateExtraCost(age);

        // Then
        Assert.assertEquals(expected, extraCosts, 0.1);
    }
}