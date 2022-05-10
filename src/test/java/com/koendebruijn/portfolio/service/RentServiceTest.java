package com.koendebruijn.portfolio.service;

import com.koendebruijn.portfolio.exception.UnableToRentCarException;
import org.junit.Assert;
import org.junit.Test;

public class RentServiceTest {
    private final RentService underTest = RentService.getInstance();

    // region tests calculateExtraCost()
    @Test
    public void calculateExtraCost_ShouldThrow_AgeUnder18() {
        // Given
        int age = 17;

        // When
        Assert.assertThrows(UnableToRentCarException.class, () -> underTest.calculateExtraCost(age));
    }

    @Test
    public void calculateExtraCost_ShouldGiveExtraCost_Age18() {
        // Given
        int age = 18;
        double expected = 0.05;

        // When
        double extraCosts = underTest.calculateExtraCost(age);

        // Then
        Assert.assertEquals(expected, extraCosts, 0.1);
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
    public void calculateExtraCost_ShouldGiveExtraCost_Age23() {
        // Given
        int age = 23;
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
    // endregion
}