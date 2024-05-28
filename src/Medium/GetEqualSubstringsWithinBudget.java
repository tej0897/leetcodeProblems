package Medium;

public class GetEqualSubstringsWithinBudget {

    public static int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int maxLength = 0;
        int currentCost = 0;
        int start = 0;

        for (int end = 0; end < n; end++){
            currentCost += Math.abs(s.charAt(end) - t.charAt(end));

            while(currentCost > maxCost){
                currentCost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            maxLength = Math.max(maxLength, end - start +1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;
        System.out.println(equalSubstring(s, t, maxCost));
    }
}
