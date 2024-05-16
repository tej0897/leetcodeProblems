package Easy.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {

        /**
         * 0,2,4,   1,3,5
         * 1,2,3,   4,5,6
         * 0,1,2,   3,4,5
         *
         * half-point = 3
         *
         *
         */


        int [] nums = {2,5,1,3,4,7};
        int [] array1 = new int[nums.length/2];
        int [] array2 = new int[nums.length/2];





        for (int j : array1){
            System.out.println(j);
        }
        for (int j : array2){
            System.out.println(j);
        }
    }
}
