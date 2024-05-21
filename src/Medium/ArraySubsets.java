package Medium;

import java.util.ArrayList;
import java.util.List;

public class ArraySubsets {

    public static List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> output = new ArrayList<>();
            output.add(new ArrayList<>());

            for (int n : nums){
                int size = output.size();
                for (int i=0; i<size; i++){
                    List<Integer> subSet = new ArrayList<>(output.get(i));
                    subSet.add(n);
                    output.add(subSet);
                }
            }
            return output;
    }
    public static void main(String[] args) {
        int [] input = {1,2,3};
        System.out.println(subsets(input));
    }
}
