package com.koendebruijn.portfolio.models;

import org.junit.Assert;
import org.junit.Test;

public class PlaneTest {

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




}