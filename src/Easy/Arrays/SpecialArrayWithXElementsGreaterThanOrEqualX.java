package Easy.Arrays;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;

        for (int x=1; x < length; x++){
            int count = 0;
            for (int n : nums){
                if (n >= x){
                    count ++;
                }
            }
            if (count == x){
                return x;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int [] input = {0,0};
        System.out.println(specialArray(input));
    }
}
