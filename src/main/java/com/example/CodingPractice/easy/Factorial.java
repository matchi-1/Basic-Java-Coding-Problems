package com.example.CodingPractice.easy;

import java.util.Scanner;

public class Factorial {
    public static int fact(int num){
        if(num == 0)
            return 0;
        else if(num == 1)
            return 1;
        return num * fact(num-1);
    }

    public static  int factIterative(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("The factorial of " + num + " is " + factIterative(num));
    }
}
