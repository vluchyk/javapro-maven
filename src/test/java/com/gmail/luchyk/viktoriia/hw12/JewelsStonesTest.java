package com.gmail.luchyk.viktoriia.hw12;

import org.junit.Assert;
import org.junit.Test;

public class JewelsStonesTest {
    private JewelsStones jewelsStones = new JewelsStones();

    @Test
    public void numJewelsInStonesExistTest() {
        String jewels = "aA";
        String stones = "aAAbbbbAaccaddA";
        int expected = 7;

        int result = jewelsStones.numJewelsInStones(jewels, stones);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void numJewelsInStonesNotExistTest() {
        String jewels = "fg";
        String stones = "aAAbbbbAaccaddA";
        int expected = 0;

        int result = jewelsStones.numJewelsInStones(jewels, stones);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void numJewelsInStonesDifferentRegisterTest() {
        String jewels = "BC";
        String stones = "aAAbbbbAaccaddA";
        int expected = 0;

        int result = jewelsStones.numJewelsInStones(jewels, stones);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void numJewelsInStonesEmptyJewelsTest() {
        String jewels = "";
        String stones = "aAAbbbbAaccaddA";
        int expected = 0;

        int result = jewelsStones.numJewelsInStones(jewels, stones);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void numJewelsInStonesEmptyStonesTest() {
        String jewels = "aA";
        String stones = "";
        int expected = 0;

        int result = jewelsStones.numJewelsInStones(jewels, stones);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void numJewelsInStonesNullJewelsTest() {
        String jewels = null;
        String stones = "aAAbbbbAaccaddA";
        int expected = 0;

        int result = jewelsStones.numJewelsInStones(jewels, stones);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void numJewelsInStonesNullStonesTest() {
        String jewels = "aA";
        String stones = null;
        int expected = 0;

        int result = jewelsStones.numJewelsInStones(jewels, stones);

        Assert.assertEquals(expected, result);
    }
}