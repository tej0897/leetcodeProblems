package Easy.Arrays;

import java.util.Arrays;

public class MinimumNumberGame {

    public static int[] numberGame(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int [] output = new int[len];
        for (int i=0; i < len; i = i+2){
            output[i+1] = nums[i];
            output[i] = nums[i+1];
        }
        return output;
    }
    public static void main(String[] args) {
        int [] input = {2,5};
        int [] output = numberGame(input);
        for (int j : output){
            System.out.println(j);
        }
    }
}
