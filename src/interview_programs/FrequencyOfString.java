package interview_programs;

import java.util.HashMap;

public class FrequencyOfString {

    public static void countFrequency(String str){
        HashMap<Character, Integer> charFrequency = new HashMap<>();

        for (char ch : str.toCharArray()){
            if (charFrequency.containsKey(ch)) {
                charFrequency.put(ch, charFrequency.get(ch) +1);
            } else {
                charFrequency.put(ch, 1);
            }
        }
        System.out.println("Character frequencies:");
        for (char ch : charFrequency.keySet()) {
            System.out.println(ch + ": " + charFrequency.get(ch));
        }

    }

    public static void main(String[] args) {
        String input = "Welcome to Jurassic Park";
        countFrequency(input);
    }
}
