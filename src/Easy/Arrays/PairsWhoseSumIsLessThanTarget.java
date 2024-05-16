package Easy.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PairsWhoseSumIsLessThanTarget {

    /**
     * - (0, 1) since 0 < 1 and nums[0] + nums[1] = 0 < target
     * - (0, 2) since 0 < 2 and nums[0] + nums[2] = 1 < target
     * - (0, 4) since 0 < 4 and nums[0] + nums[4] = 0 < target
     */

    public static int countPairs(List<Integer> nums, int target) {
        int output = 0;

        for (int i=0; i<nums.size(); i++){
            for (int j=1; j<nums.size(); j++){
                if (i < j && nums.get(i)+ nums.get(j) < target){
                    output ++;
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        int target = 2;
        System.out.println(countPairs(nums, target));

    }
}


//        for(int i=0; i< nums.length; i++){
//            for (int j=1; j<nums.length; j++){
//                if (i < j && nums[i] + nums[j] < target){
//                    output++;
//                }
//            }
//        }
