package com.koendebruijn.portfolio.model;

import org.junit.Assert;
import org.junit.Test;

public class PlaneTest {
    private final double DELTA = 1e-15;

    // region testing canTakeoff
    @Test
    public void canTakeoff_ShouldReturnFalse_WithoudPermission() {
        Plane cessna172 = new Plane(1000);
        boolean canTakeoff = cessna172.canTakeoff(10, false);

        Assert.assertFalse(canTakeoff);
    }

    @Test
    public void canTakeoff_ShouldReturnTrue_WhenWeightUnder3500HeadwindUnder50AndHasPermission() {
        Plane cessna172 = new Plane(1000);
        boolean canTakeoff = cessna172.canTakeoff(10, true);

        Assert.assertTrue(canTakeoff);
    }

    @Test
    public void canTakeoff_ShouldReturnFalse_WhenOverWeight() {
        Plane cessna172 = new Plane(4000);
        boolean canTakeoff = cessna172.canTakeoff(10, true);

        Assert.assertFalse(canTakeoff);
    }

    @Test
    public void canTakeoff_ShouldReturnFalse_WhenToMuchHeadwind() {
        Plane cessna172 = new Plane(3000);
        boolean canTakeoff = cessna172.canTakeoff(60, true);

        Assert.assertFalse(canTakeoff);
    }

    @Test
    public void canTakeoff_ShouldReturnFalse_WhenToMuchHeadwindAndOverweight() {
        Plane cessna172 = new Plane(4000);
        boolean canTakeoff = cessna172.canTakeoff(60, true);

        Assert.assertFalse(canTakeoff);
    }

    @Test
    public void canTakeoff_ShouldReturnFalse_WhenToMuchHeadwindAndOverweightAndNoPermission() {
        Plane cessna172 = new Plane(4000);
        boolean canTakeoff = cessna172.canTakeoff(60, false);

        Assert.assertFalse(canTakeoff);
    }

    @Test
    public void canTakeoff_ShouldReturnFalse_WhenToMuchHeadwindAndNoPermission() {
        Plane cessna172 = new Plane(300);
        boolean canTakeoff = cessna172.canTakeoff(60, false);

        Assert.assertFalse(canTakeoff);
    }

    @Test
    public void canTakeoff_ShouldReturnFalse_WhenOverweightAndNoPermission() {
        Plane cessna172 = new Plane(300);
        boolean canTakeoff = cessna172.canTakeoff(60, false);

        Assert.assertFalse(canTakeoff);
    }
    // endregion

    // region testing calculateLandingCosts

    @Test
    public void calculateLandingCosts_PW_1() {
        // given
        Plane plane = new Plane(6000, 2, true);

        // When
        double landingCosts = plane.calculateLandingCosts(true);

        // Then
        Assert.assertEquals(3993, landingCosts, DELTA);
    }

    @Test
    public void calculateLandingCosts_PW_2() {
        // given
        Plane plane = new Plane(5000, 3, true);

        // When
        double landingCosts = plane.calculateLandingCosts(false);

        // Then
        Assert.assertEquals(4537.5, landingCosts, DELTA);
    }

    @Test
    public void calculateLandingCosts_PW_3() {
        // given
        Plane plane = new Plane(4000, 1, false);

        // When
        double landingCosts = plane.calculateLandingCosts(true);

        // Then
        Assert.assertEquals(1300, landingCosts, DELTA);
    }

    @Test
    public void calculateLandingCosts_PW_4() {
        // given
        Plane plane = new Plane(1000, 2, false);

        // When
        double landingCosts = plane.calculateLandingCosts(true);

        // Then
        Assert.assertEquals(1300, landingCosts, DELTA);
    }

    @Test
    public void calculateLandingCosts_PW_6() {
        // given
        Plane plane = new Plane(800, 1, true);

        // When
        double landingCosts = plane.calculateLandingCosts(false);

        // Then
        Assert.assertEquals(121, landingCosts, DELTA);
    }
    // endregion



}