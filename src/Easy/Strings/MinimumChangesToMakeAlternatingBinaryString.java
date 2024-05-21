package Easy.Strings;

import java.util.List;

public class MinimumChangesToMakeAlternatingBinaryString {

    public static int minOperations(String s) {
       int startsWithZero = 0;
       int startsWithOne = 0;
       for (int i=0; i<s.length(); i++){
           char evenZero = (i % 2 == 0)? '0' : '1';   //check if even index are 0s
           char evenOne = (i % 2 == 0)? '1' : '0';    //check if even index are 1s

           if(s.charAt(i) != evenZero){
               startsWithZero++;
           }
           if (s.charAt(i) != evenOne){
               startsWithOne++;
           }
       }
       return Math.min(startsWithZero, startsWithOne);
    }
    public static void main(String[] args) {
        String input = "10010100";
        System.out.println(minOperations(input));
    }
}
