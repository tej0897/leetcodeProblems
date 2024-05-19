package interview_programs;

import java.util.Scanner;

public class PrintInAscOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int temp = 0;
        for (int i=0; i<n; i++){
            temp = i+1+(temp*10);
            System.out.println(temp);
        }
    }
}
