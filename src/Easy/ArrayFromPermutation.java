package Easy;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        int [] input = {0,2,1,5,3,4};
        int [] output = new int[input.length];

        for(int i=0; i< input.length; i++){
            int temp = input[i];
            output[i] = input[temp];
        }

        for (int j: output){
            System.out.println(j);
        }

    }
}
