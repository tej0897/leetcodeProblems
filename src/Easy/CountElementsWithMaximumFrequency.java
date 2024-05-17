package Easy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.List.*;

public class CountElementsWithMaximumFrequency {

    public static int maxFrequencyElements(int[] nums) {
        int numDuplicates = 0;
        if(nums.length == IntStream.of(nums).boxed().collect(Collectors.toSet()).size()){
            return nums.length;
        } else {
            boolean [] visited = new boolean[nums.length];
            Arrays.fill(visited, false);

            for (int i = 0; i < nums.length; i++) {
                if (visited[i])
                    continue;
                int count = 1;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(nums[i] + " " + count);
                if (count > numDuplicates){
                    numDuplicates = count;
                } else if (count == numDuplicates) {
                    numDuplicates+= count;
                }
            }
        }
        return numDuplicates;
    }

    //17,17,2,12,20,17,12
    public static void main(String[] args) {
        int [] input = {17,17,17,17,17,2,12,20,17,12};
        System.out.println(maxFrequencyElements(input));
    }
}
