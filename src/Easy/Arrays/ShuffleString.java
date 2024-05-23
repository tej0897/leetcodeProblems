package Easy.Arrays;

public class ShuffleString {

    public static String restoreString(String s, int[] indices) {
        int length = s.length();
        char[] output = new char[length];
        for (int i=0; i<length; i++){
            output[indices[i]] = s.charAt(i);
        }
        return new String(output);
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int [] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }
}
