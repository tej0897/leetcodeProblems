package Hard;

import java.util.*;

public class WordBreakII {

    public static List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);  // Convert list to set for O(1) lookups
        Map<Integer, List<String>> memo = new HashMap<>();  // Memoization map

        return backtrack(s, wordSet, 0, memo);
    }

    private static List<String> backtrack(String s, Set<String> wordSet, int start, Map<Integer, List<String>> memo) {
        if (memo.containsKey(start)) {
            return memo.get(start);
        }
        List<String> results = new ArrayList<>();
        if (start == s.length()) {
            results.add("");  // Base case: we've segmented the entire string
            return results;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (wordSet.contains(word)) {
                List<String> subSentences = backtrack(s, wordSet, end, memo);
                for (String subSentence : subSentences) {
                    if (subSentence.isEmpty()) {
                        results.add(word);
                    } else {
                        results.add(word + " " + subSentence);
                    }
                }
            }
        }
        memo.put(start, results);
        return results;
    }


    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        System.out.println(wordBreak(s, wordDict));  // Output: ["cats and dog", "cat sand dog"]

    }
}
