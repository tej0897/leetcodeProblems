package Easy.Strings;

public class ValidParentheses {

    public static boolean isValid(String s) {
        int length = s.length();
        for (int i=0; i<length; i++){
            if (s.charAt(i) == '(' && s.charAt(i+1) == ')'){
                continue;
            }
            if (s.charAt(i) == '[' && s.charAt(i+1) == ']'){
                continue;
            }
            if (s.charAt(i) == '{' && s.charAt(i+1) == '}'){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String input = "(){}}{";
        System.out.println(isValid(input));
    }
}
