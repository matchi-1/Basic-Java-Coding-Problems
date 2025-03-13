package com.example.CodingPractice.easy;

import java.util.Scanner;

public class NumReverse {
    public static int reverseNum(int num) {
        int newNum = 0;
        while (num != 0) {
            newNum = (newNum*10) + num % 10;
            num = num / 10;
        }
        return newNum;
    }

    private static int reverseNumRecursive(int num, int reversed) {
        if (num == 0) {
            return reversed;
        }

        return reverseNumRecursive(num / 10, reversed * 10 + num % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("\nReversed number: " + reverseNum(num));
        // System.out.println("\nReversed number: " + reverseNumRecursive(num, 0));
    }
}
