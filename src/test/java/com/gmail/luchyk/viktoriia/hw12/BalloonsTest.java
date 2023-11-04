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

    @Test
    public void maxNumberOfBalloonsNotExistTest() {
        String text = "leonbalxballpeen";
        int expected = 0;

        int result = balloons.maxNumberOfBalloons(text);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void maxNumberOfBalloonsInEmptyTextTest() {
        String text = "";
        int expected = 0;

        int result = balloons.maxNumberOfBalloons(text);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void maxNumberOfBalloonsInNullTextTest() {
        String text = null;
        int expected = 0;

        int result = balloons.maxNumberOfBalloons(text);

        Assert.assertEquals(expected, result);
    }
}