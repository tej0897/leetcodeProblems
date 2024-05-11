package Easy;

public class NumbersAreSmallerThanCurrentNumber {

    /**
     *
     * Input: nums = [8,1,2,2,3]
     * Output: [4,0,1,1,3]
     * Explanation:
     * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
     * For nums[1]=1 does not exist any smaller number than it.
     * For nums[2]=2 there exist one smaller number than it (1).
     * For nums[3]=2 there exist one smaller number than it (1).
     * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
     *
     */
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] output = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            int temp = 0;
            for (int j=0; j< nums.length; j++){
                if (nums[i] > nums[j]){
                    temp++;
                }
                output[i] = temp;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int [] input  ={6,5,4,8};
        int [] output = smallerNumbersThanCurrent(input);
        for( int j : output){
            System.out.println(j);
        }
    }
}
