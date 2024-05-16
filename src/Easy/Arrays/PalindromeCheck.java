package Easy.Arrays;

public class PalindromeCheck {
    public static void main(String[] args) {
        int palindromeCheck = 123;
        int sum = 0;
        int temp = palindromeCheck;
        int rem;

        while(palindromeCheck > 0){
            rem = palindromeCheck % 10;
            sum = (sum * 10) + rem;
            palindromeCheck /= 10;
        }

        if (sum == temp){
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a Palindrome!!");
        }
    }
}
