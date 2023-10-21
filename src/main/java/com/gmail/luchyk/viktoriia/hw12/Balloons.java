package com.gmail.luchyk.viktoriia.hw12;

import java.util.HashMap;
import java.util.Map;

public class Balloons {
    public int maxNumberOfBalloons(String text) {
        String word = "balloon";

        Map<Character, Integer> wordContents = new HashMap<>();
        for (Character letter : word.toCharArray()) {
            if (wordContents.containsKey(letter)) { // TO-DO: create a method
                wordContents.put(letter, wordContents.get(letter) + 1);
            } else {
                wordContents.put(letter, 1);
            }
        }

        Map<Character, Integer> textContents = new HashMap<>();
        for (Character letter : text.toCharArray()) {
            if (wordContents.containsKey(letter)) {
                if (textContents.containsKey(letter)) { // TO-DO: use a new created method
                    textContents.put(letter, textContents.get(letter) + 1);
                } else {
                    textContents.put(letter, 1);
                }
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
                    }
                }
            }
        }

        System.out.println(wordContents);
        System.out.println(textContents);

        return numberOfMatches;
    }
}
