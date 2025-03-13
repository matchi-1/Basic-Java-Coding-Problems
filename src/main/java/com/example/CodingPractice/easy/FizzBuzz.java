package com.example.CodingPractice.easy;

import java.util.Scanner;

public class FizzBuzz {
    /*
    Write a program that outputs numbers from 1 to a given integer nnn, following these rules:
        For multiples of 3, print "Fizz" instead of the number.
        For multiples of 5, print "Buzz" instead of the number.
        For numbers which are multiples of both 3 and 5, print "FizzBuzz".
        For all other numbers, simply print the number itself.
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
