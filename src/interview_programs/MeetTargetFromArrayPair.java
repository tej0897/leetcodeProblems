package interview_programs;

import java.util.ArrayList;

public class MeetTargetFromArrayPair {
    public static void main(String[] args) {
        int [] intArray = {1,2,3,4,5,6,7,8};
        int target = 5;
        printPairs(intArray, target);
    }

    private static void printPairs(int[] intArray, int target) {
//        HashSet<Integer> hashSet = new HashSet<>();
//        for (int num : intArray){
//            int compliment = target - num;
//            if (hashSet.contains(compliment)){
//                System.out.println("("+num+", "+compliment+")");
//            }
//            hashSet.add(num);
//        }

        ArrayList<Integer> integers = new ArrayList<>();
        for (int num : intArray){
            int compliment = target - num;
            if (integers.contains(compliment)){
                System.out.println("("+num+", "+compliment+")");
            }
            integers.add(num);
        }

    }
}
