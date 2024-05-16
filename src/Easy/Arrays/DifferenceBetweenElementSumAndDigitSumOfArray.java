package Easy.Arrays;

public class DifferenceBetweenElementSumAndDigitSumOfArray {


    public static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        int len = nums.length;
        for (int i =0; i < len; i++){
            elementSum += nums[i];
            while (nums[i] > 0){
                digitSum = digitSum + nums[i] % 10;
                nums[i] /= 10;
            }
        }
        return elementSum - digitSum;
    }

    public static void main(String[] args) {
        int [] input = {1,15,6,3};
        System.out.println(differenceOfSum(input));
    }
}
