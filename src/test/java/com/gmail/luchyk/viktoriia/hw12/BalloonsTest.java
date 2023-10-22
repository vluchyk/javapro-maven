package com.gmail.luchyk.viktoriia.hw12;

import org.junit.Assert;
import org.junit.Test;

public class BalloonsTest {
    private Balloons balloons = new Balloons();

    @Test
    public void maxNumberOfBalloonsExistTest() {
        String text = "loonbalxballpoon";
        int expected = 2;

        int result = balloons.maxNumberOfBalloons(text);

        Assert.assertEquals(expected, result);
    }
}