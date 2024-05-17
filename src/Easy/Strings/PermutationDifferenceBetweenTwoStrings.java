package Easy.Strings;

public class PermutationDifferenceBetweenTwoStrings {


    /**
     * The absolute difference between the index of the occurrence of "a" in s and the index of the occurrence of "a" in t.
     * The absolute difference between the index of the occurrence of "b" in s and the index of the occurrence of "b" in t.
     * The absolute difference between the index of the occurrence of "c" in s and the index of the occurrence of "c" in t.
     * That is, the permutation difference between s and t is equal to |0 - 1| + |2 - 2| + |1 - 0| = 2.
     */
    public static int findPermutationDifference(String s, String t) {
        int solution = 0;
        int len = s.length();
        for ( int i=0; i< len; i++){
            char c = t.charAt(i);
            int temp = s.indexOf(c);
            solution = solution + Math.abs( i - temp);
        }
        return solution;
    }
    public static void main(String[] args) {
        String a = "abcde";
        String b = "edbac";
        System.out.println(findPermutationDifference(a,b));
    }
}
