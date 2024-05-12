package Easy;

public class MaximumNumberWordsFoundSentences {
    /**
     *
     * Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
     * Output: 6
     * Explanation:
     * - The first sentence, "alice and bob love leetcode", has 5 words in total.
     * - The second sentence, "i think so too", has 4 words in total.
     * - The third sentence, "this is great thanks very much", has 6 words in total.
     * Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
     *
     */

    public static int mostWordsFound(String[] sentences) {
        int count = 0;
        for (int i=0; i<sentences.length; i++){
            int countWords = sentences[i].split("\\s").length;
            if (countWords > count){
                count = countWords;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String [] input = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(input));

    }
}
