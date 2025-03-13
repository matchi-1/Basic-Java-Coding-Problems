package com.example.CodingPractice.easy;

import java.util.Scanner;

public class GCDAndLCM {

    // euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    // LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        while (true) {
            System.out.print("Enter the first positive integer: ");
            a = scanner.nextInt();
            System.out.print("Enter the second positive integer: ");
            b = scanner.nextInt();
            if (a > 0 && b > 0) break;
            System.out.println("Please enter positive integers only.");
        }

        int gcdValue = gcd(a, b);
        int lcmValue = lcm(a, b);

        System.out.println("GCD of " + a + " and " + b + " is: " + gcdValue);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcmValue);

        scanner.close();
    }
}
