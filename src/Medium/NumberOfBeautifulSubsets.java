package Medium;

import java.util.ArrayList;
import java.util.List;

public class NumberOfBeautifulSubsets {

    private static int count = 0;

    public static int beautifulSubsets(int[] nums, int k) {
        count = 0;
        generateSubsets(nums, k, 0, new ArrayList<>());
        return count;
    }

    private static void generateSubsets(int[] nums, int k, int start, List<Integer> current) {
        if (!current.isEmpty()) {
            count++;
        }

        for (int i = start; i < nums.length; i++) {
            if (isBeautiful(current, nums[i], k)) {
                current.add(nums[i]);
                generateSubsets(nums, k, i + 1, current);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean isBeautiful(List<Integer> current, int num, int k) {
        for (int val : current) {
            if (Math.abs(val - num) == k) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = 1;
        System.out.println("The number of beautiful subsets is: " + beautifulSubsets(nums, k));
    }
}

