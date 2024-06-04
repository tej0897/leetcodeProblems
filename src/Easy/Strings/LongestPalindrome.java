package Easy.Strings;

import java.util.HashMap;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(checkPalindrome(s));
    }

    private static int checkPalindrome(String string) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count the frequency of each character
        for (char c : string.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        int length = 0;
        boolean hasOddCount = false;

        for (int count : charCount.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOddCount = true;
            }
        }

        if (hasOddCount) {
            length += 1;
        }

        return length;

    }
}
