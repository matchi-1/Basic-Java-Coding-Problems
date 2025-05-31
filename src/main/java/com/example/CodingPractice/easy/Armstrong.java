package com.example.CodingPractice.easy;

/* An n-digit number is an Armstrong number if the sum of its digits each raised to the power of n equals the number itself.
 * 153 → 3 digits → =1+125+27=153
 * 9474 → 4 digits → 6561 + 256 + 2401 + 256 = 9474
 */

import java.util.Scanner;

public class Armstrong {
    public static boolean armstrongChecker(int num) {
        int ctr = 0, sum = 0;
        for (int numcpy = num; numcpy > 0; ctr++) {
            numcpy /= 10;
        }

        int numcpy1 = num;
        while (numcpy1 > 0) {
            sum += (int)Math.pow(numcpy1 % 10, ctr);
            numcpy1 /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.println(
                armstrongChecker(num) ? num + " is an armstrong number." : num + " is NOT an armstrong number.");
    }
}
