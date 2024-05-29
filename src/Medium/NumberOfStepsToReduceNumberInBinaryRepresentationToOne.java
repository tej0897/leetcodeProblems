package Medium;

import java.math.BigInteger;

public class NumberOfStepsToReduceNumberInBinaryRepresentationToOne {
    public static void main(String[] args) {
        String s = "1111011110000011100000110001011011110010111001010111110001";
        int result = reduceBinaryStringToOne(s);
        System.out.println("Steps to reduce " + s + " to 1: " + result);
    }

    private static int reduceBinaryStringToOne(String s) {
        BigInteger number = new BigInteger(s, 2);
        int steps = 0;

        // Apply the rules until the number is reduced to 1
        while (number.compareTo(BigInteger.ONE) > 0) {
            if (number.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                // If the number is even, divide it by 2
                number = number.divide(BigInteger.TWO);
            } else {
                // If the number is odd, add 1
                number = number.add(BigInteger.ONE);
            }
            steps++;
        }
        return steps;
    }
}
