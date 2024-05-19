package Easy.Arrays;

import java.util.Stack;

public class ValidParentheses2 {

    public static boolean isValid(String string) {
        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()){
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String string = "()[]{}";
        System.out.println(isValid(string));
    }
}
