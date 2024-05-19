package interview_programs;

import java.util.Scanner;

public class PrintInAscOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int temp = 0;
        for (int i=1; i<=n; i++){
            temp = i+(temp*10);
            System.out.println(temp);
        }
        /*
         * Alternate solution using 2 for loops

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
         */
    }
}
