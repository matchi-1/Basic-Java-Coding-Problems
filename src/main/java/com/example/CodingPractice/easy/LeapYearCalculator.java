package com.example.CodingPractice.easy;

/*
A year is a leap year if it is divisible by 4.
However, if the year is divisible by 100, it is not a leap year, unless:
The year is also divisible by 400, in which case it is a leap year.
*/

import java.util.Scanner;

public class LeapYearCalculator {
    public static boolean leapYearChecker(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        System.out.println("Is leap year? " + leapYearChecker(year));
    }
}
