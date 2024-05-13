package Easy;

public class LeftAndRightSumDifferences {
    /**
     *
     * Input: nums = [10,4,8,3]
     * leftSum is [0,10,14,22]  rightSum is [15,11,3,0]
     * [15,1,11,22]
     */
    public static int[] leftRightDifference(int[] nums) {
        int [] output = new int[nums.length];
        int [] leftSum = new int[nums.length];
        int [] rightSum = new int[nums.length];

        for (int i = 1; i< nums.length; i++){
            leftSum[i] = leftSum[i-1]+nums[i-1];
        }
        for (int i = nums.length-2; i >= 0 ; i--){
            rightSum[i] = rightSum[i+1]+nums[i+1];
        }
        for (int i = 0; i < nums.length; i++){
            output[i] = Math.abs(leftSum[i] - rightSum[i]);
        }


        return output;
    }

    public static void main(String[] args) {
        int [] input = {10,4,8,3};
        int []  output = leftRightDifference(input);
        for (int j : output){
            System.out.println(j);
        }
    }
}
