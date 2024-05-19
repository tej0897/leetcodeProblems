package interview_programs;

public class FrequencyOfString {
    static final int SIZE = 26;

    public static void countFrequency(String str){
        int n = str.length();
        int [] frequency  = new int[SIZE];
        for (int i=0; i < n; i++)
            frequency[str.charAt(i) - 'a']++;

        for (int i = 0; i < n; i++) {
            if (frequency[str.charAt(i) - 'a'] != 0) {

                // print the character along with its
                // frequency
                System.out.print(str.charAt(i));
                System.out.print(frequency[str.charAt(i) - 'a'] + " ");

                // update frequency of str.charAt(i) to
                // 0 so that the same character is not
                // printed again
                frequency[str.charAt(i) - 'a'] = 0;
            }
        }
    }

    public static void main(String[] args) {
        String input = "Welcome to Jurassic Park";
        countFrequency(input);
    }
}
