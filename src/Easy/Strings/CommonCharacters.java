package Easy.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonCharacters {
    public static List<String> commonChars(String[] words) {
        // Initialize an array to track the minimum frequency of each character
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        // Iterate through each word in the input array
        for (String word : words) {
            // Count the frequency of each character in the current word
            int[] charFreq = new int[26];
            for (char c : word.toCharArray()) {
                charFreq[c - 'a']++;
            }

            // Update the minimum frequency array
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charFreq[i]);
            }
        }

        // Collect the result based on the minimum frequency array
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        List<String> commonCharacters = commonChars(words);
        System.out.println(commonCharacters); // Output: [e, l, l]
    }
}
