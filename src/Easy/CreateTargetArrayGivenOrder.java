package Easy;

import java.util.ArrayList;

public class CreateTargetArrayGivenOrder {

    public  static int[] createTargetArray(int[] nums, int[] index) {

        // logic

        int len = nums.length;
        ArrayList<Integer> targetList = new ArrayList<>();
        for(int i=0;i<len;i++){
            targetList.add(index[i],nums[i]);
        }
        int[] target = new int[len];
        for(int i=0;i<len;i++){
            target[i] = targetList.get(i);
        }
        System.gc();
        return target;
    }
    public static void main(String[] args) {
        int [] input = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};
        int [] output = createTargetArray(input, index);
        for (int j : output){
            System.out.println(j);
        }
    }
}
