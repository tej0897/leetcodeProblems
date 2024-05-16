package Easy.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {

        int [] input = {1,3,2,1};
        int [] output = new int[input.length*2];
//        for(int h : input){
//            System.out.println(h);
//        }

        for(int i=0; i<input.length; i++){
            output[i] = input[i];
            output[i+ input.length] = input[i];
        }

        for(int h : output){
            System.out.println(h);
        }
    }
}
