package Easy.Arrays;

public class FindIndexOfTheFirstOccurrenceInString {

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "wsadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
}
