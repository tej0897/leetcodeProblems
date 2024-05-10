package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> output = new ArrayList<>();
        for (int i=0; i< candies.length; i++){
            if (candies[i] + extraCandies > max ){
                output.add(true);
            } else {
                output.add(false);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int  [] input = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> output =  kidsWithCandies(input, extraCandies);
        for (Boolean j : output){
            System.out.println(j);
        }
    }
}
