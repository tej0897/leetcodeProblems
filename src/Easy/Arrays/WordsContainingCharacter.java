package Easy.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsContainingCharacter {
    public static void main(String[] args) {
        String [] input = {"leet","code"};
        List<Integer> answer = functionCheck(input, 'e');
        System.out.println(answer);
    }
    public static List<Integer> functionCheck(String [] input , char x ) {

        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            if (input[i].contains(String.valueOf(x))) {
                output.add(i);
            }
        }
        return output;
    }
}
