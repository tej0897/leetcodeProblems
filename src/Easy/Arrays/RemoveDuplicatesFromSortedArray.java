package Easy.Arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int sortedArray [] =  Arrays.stream(arr).distinct().toArray();
        for( int i=0; i< sortedArray.length; i++){
            System.out.println(sortedArray[i]);
        }
    }
}

// check this one

//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int n = nums.length;
//
//        if (n==0 || n==1){
//            return n;
//        }
//
//        int[] temp = new int[n];
//        int j = 0;
//
//        for (int i=0; i<n-1; i++){
//            if (nums[i] != nums[i+1]){
//                temp[j++] = nums[i];
//            }
//        }
//        temp[j++] = nums[n-1];
//        // Changing original array
//        for (int i=0; i<j; i++){
//            nums[i] = temp[i];
//        }
//        return j;
//    }
//}

