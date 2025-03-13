package com.example.CodingPractice.easy;

import java.util.Scanner;

public class SwapNum {
    static int num1, num2;
    public static void swap() {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        num1 = in.nextInt();
        System.out.print("Enter num2: ");
        num2 = in.nextInt();
        System.out.println("-- doing swap --");
        swap();
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
