package Easy.Arrays;

import java.util.Arrays;

public class CheckIfTwoStringArraysAreEquivalent {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        for (int i =0; i < word1.length; i++){
            w1.append(word1[i]);
        }
        for (int i =0; i < word2.length; i++){
            w1.append(word1[i]);
        }
        return w1.toString().equals(w2.toString());
    }
    public static void main(String[] args) {
        String [] input1 = {"ab", "c"};
        String [] input2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(input1, input2));
    }
}

