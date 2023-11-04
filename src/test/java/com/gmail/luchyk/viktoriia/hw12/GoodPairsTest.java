package com.gmail.luchyk.viktoriia.hw12;

import org.junit.Assert;
import org.junit.Test;

public class GoodPairsTest {
    private GoodPairs goodPairs = new GoodPairs();
    @Test
    public void numIdenticalPairsExistTest() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int expected = 4;

        int result = goodPairs.numIdenticalPairs(nums);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void numIdenticalPairsNotExistTest() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int expected = 0;

        int result = goodPairs.numIdenticalPairs(nums);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void numIdenticalPairsEmptyNumsTest() {
        int[] nums = {};
        int expected = 0;

        int result = goodPairs.numIdenticalPairs(nums);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void numIdenticalPairsNullNumsTest() {
        int[] nums = null;
        int expected = 0;

        int result = goodPairs.numIdenticalPairs(nums);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void numIdenticalPairsSameNumberTest() {
        int[] nums = {2, 2, 2, 2, 2};
        int expected = 10;

        int result = goodPairs.numIdenticalPairs(nums);

        Assert.assertEquals(expected, result);
    }
}