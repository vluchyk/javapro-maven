package com.gmail.luchyk.viktoriia.hw12;

public class JewelsStones {
    public int numJewelsInStones(String jewels, String stones) {
        if (jewels == null || stones == null) {
            return 0;
        }

        int result = 0;
        for (char stone : stones.toCharArray()) {
            if (jewels.indexOf(stone) != -1) result++;
        }
        return result;
    }

    /*
    public int numJewelsInStones(String jewels, String stones) {
        List<String> jewelsContents = new ArrayList<>();
        jewelsContents = List.of(jewels.split(""));

        List<String> stonesContents = new ArrayList<>();
        stonesContents = List.of(stones.split(""));

        int result = 0;
        for (String jewelsContent : jewelsContents) {
            for (String stonesContent : stonesContents) {
                if (jewelsContent.equals(stonesContent)) result++;
            }
        }

        return result;
    }
     */

    /*
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelsContents = new HashSet<>();
        for (Character jewel : jewels.toCharArray()) {
            jewelsContents.add(jewel);
        }

        int result = 0;
        for (Character stone : stones.toCharArray()) {
            if (jewelsContents.contains(stone)) result++;
        }

        return result;
    }
     */
}