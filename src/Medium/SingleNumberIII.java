package Medium;

public class SingleNumberIII {

    public static int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        // Step 2: Find the rightmost set bit in xor
        int rightmostSetBit = xor & -xor;

        // Step 3: Divide the elements into two groups and XOR
        int num1 = 0;
        int num2 = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        // The two unique numbers
        return new int[]{num1, num2};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        int[] result = singleNumber(nums);
        System.out.println("The two unique numbers are: " + result[0] + " and " + result[1]);
    }
}
