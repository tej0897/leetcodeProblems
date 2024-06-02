package Easy.Strings;

public class ReverseString {
    public static void main(String[] args) {
        char [] input = {'h','e','l','l','o'};
        char [] output = reverseFunction(input);
        for (char c : output){
            System.out.println(c);
        }
    }
    private static char[] reverseFunction(char[] input) {
        int left = 0;
        int right = input.length-1;

        while(left < right){
            char temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            left ++;
            right --;
        }
        return input;
    }
}
