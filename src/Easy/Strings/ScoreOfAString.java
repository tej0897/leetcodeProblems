package Easy.Strings;

public class ScoreOfAString {
    /**
     * The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.
     */

    public static int scoreOfString(String s) {
        int score = 0;
        int len = s.length();
        for (int i=0; i<len-1; i++){
            int temp = (int) s.charAt(i) - (int) s.charAt(i+1);
            score += Math.abs(temp);
        }
        return score;
    }
    public static void main(String[] args) {
        String input = "zaz";
        System.out.println(scoreOfString(input));
    }
}
