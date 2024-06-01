package interview_programs;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyOfInt {
    public static void main(String[] args) {
        int [] intArray = {1,2,2,3,3,4,4,4,5,6,7,6,8,8};
        countFrequency(intArray);
    }

    private static void countFrequency(int[] intArray) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : Arrays.stream(intArray).toArray()){
            if (hashMap.containsKey(num)) {
                hashMap.put(num, hashMap.get(num) +1);
            } else {
                hashMap.put(num, 1);
            }
        }
        for (int num : hashMap.keySet()){
            System.out.println(num + "-" + hashMap.get(num));
        }
    }
}
