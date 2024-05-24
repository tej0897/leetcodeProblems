package Hard;

import java.util.HashMap;
import java.util.Map;

public class MaximumScoreWordsFormedByLetters {
    public static int maxScoreWords(String[] words, char[] letters, int[] score) {
        Map<Character, Integer> letterCount = new HashMap<>();
        for (char letter : letters) {
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
        }
        return backtrack(words, 0, letterCount, score);
    }

    private static int backtrack(String[] words, int index, Map<Character, Integer> letterCount, int[] score) {
        if (index == words.length) {
            return 0;
        }

        int skipWord = backtrack(words, index + 1, letterCount, score);

        int wordScore = 0;
        boolean canFormWord = true;
        Map<Character, Integer> tempCount = new HashMap<>(letterCount);
        for (char ch : words[index].toCharArray()) {
            if (tempCount.getOrDefault(ch, 0) > 0) {
                tempCount.put(ch, tempCount.get(ch) - 1);
                wordScore += score[ch - 'a'];
            } else {
                canFormWord = false;
                break;
            }
        }
        int useWord = 0;
        if (canFormWord) {
            useWord = wordScore + backtrack(words, index + 1, tempCount, score);
        }

        return Math.max(skipWord, useWord);
    }

    public static void main(String[] args) {
        String [] words = {"dog","cat","dad","good"};
        char [] letters = {'a','a','c','d','d','d','g','o','o'};
        int [] score = {1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println("Maximum score: " + maxScoreWords(words, letters, score));
    }
}
