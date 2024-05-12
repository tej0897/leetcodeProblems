package Easy;

public class RunningSumOfArray {

    /**
     * Input: nums = [1,2,3,4]
     * Output: [1,3,6,10]
     * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     */

    public static int[] runningSum(int[] nums) {
        int [] output = new int[nums.length];
        int sum=0;
        for (int i=0; i< nums.length; i++){
            output[i] = nums[i] + sum;
            sum = sum + nums[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int [] input = {1,2,3,4};
        int [] output = runningSum(input);
        for (int j : output){
            System.out.println(j);
        }
    }
}
