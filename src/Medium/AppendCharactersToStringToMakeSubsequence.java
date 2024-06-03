package Medium;

public class AppendCharactersToStringToMakeSubsequence {
    public static void main(String[] args) {
        String s = "coaching";
        String t = "coding";

        System.out.println(appendCharacters(s, t));
    }

    private static int appendCharacters(String s, String t) {
        int m = s.length();
        int n = t.length();

        int i = 0;
        int j = 0;
        // Iterate through both strings to find the longest subsequence
        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }
        return n - j;
    }
}
