package com.gmail.luchyk.viktoriia.hw12;

import java.util.HashMap;
import java.util.Map;

public class Balloons {
    public int maxNumberOfBalloons(String text) {
        String word = "balloon";

        Map<Character, Integer> wordContents = new HashMap<>();
        for (Character letter : word.toCharArray()) {
            letterStatistics(wordContents, letter);
        }

        Map<Character, Integer> textContents = new HashMap<>();
        for (Character letter : text.toCharArray()) {
            if (wordContents.containsKey(letter)) {
                letterStatistics(textContents, letter);
            }
        }

        int numberOfMatches = 0;
        if (wordContents.size() == textContents.size()) {
            boolean exit = false;
            while (!exit) {
                numberOfMatches++;
                for (Character letter : wordContents.keySet()) {
                    if (wordContents.get(letter) * numberOfMatches > textContents.get(letter)) {
                        exit = true;
                        numberOfMatches--;
                        break;
                    }
                }
            }
        }

        /*
        int numberOfMatches = 0;
        if (wordContents.size() == textContents.size()) {
            Character keyWithMinValue = Collections.min(textContents.entrySet(), Map.Entry.comparingByValue()).getKey();
            numberOfMatches = textContents.get(keyWithMinValue) / wordContents.get(keyWithMinValue);
            boolean exit = false;
            while (!exit) {
                int wrongCase = 0;
                for (Character letter : wordContents.keySet()) {
                    if (wordContents.get(letter) * numberOfMatches > textContents.get(letter)) {
                        wrongCase++;
                        numberOfMatches--;
                        break;
                    }
                }
                if (wrongCase == 0) exit = true;
            }
        }
         */

        return numberOfMatches;
    }

    private void letterStatistics(Map<Character, Integer> contents, Character letter) {
        if (contents.containsKey(letter)) {
            contents.put(letter, contents.get(letter) + 1);
        } else {
            contents.put(letter, 1);
        }
    }
}
