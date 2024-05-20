package Easy.Arrays;

public class ShuffleTheArray {

    public static int[] shuffle(int[] nums, int n) {
        int [] output = new int[n*2];
        for (int i = 0; i < n; i++){
            output[2*i] = nums[i];
            output[2*i+1] = nums[n+i];
        }
        return output;
    }
    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7};
        int n=3;
        int [] output = shuffle(nums, n);
        for (int i : output){
            System.out.println(i);
        }
    }
}
