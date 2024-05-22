package Medium;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
    public static List<List<String>> partition(String s){
        List<List<String>> output = new ArrayList<>();
        backTrack(0, s, new ArrayList<>(), output);
        return output;
    }

    public static void backTrack(int start, String s, List<String> path, List<List<String>> result){
        if (start == s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int end = start; end < s.length(); end++){
            if (isPalindrome(s, start, end)){
                path.add(s.substring(start, end+1));
                backTrack(end+1, s, path, result);
                path.remove(path.size()-1);
            }
        }
    }

    private static boolean isPalindrome(String s, int start, int end){
        while (start < end){
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "aab";
        System.out.println(partition(input));
    }
}
