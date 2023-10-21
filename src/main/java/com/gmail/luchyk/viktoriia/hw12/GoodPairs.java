package com.gmail.luchyk.viktoriia.hw12;

import java.util.Arrays;

public class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            while (j < nums.length && nums[i] == nums[j]) {
                result++;
                j++;
            }
        }
        return result;
    }
}
