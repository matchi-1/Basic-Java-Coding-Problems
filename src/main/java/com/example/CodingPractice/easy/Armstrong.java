package com.example.CodingPractice.easy;

import java.util.Scanner;

public class Armstrong {
    public static boolean armstrongChecker(int num){
        int sum = 0, origNum = num;
        while(num != 0){
            sum += (int) Math.pow((num % 10), 3);
            num /= 10;
        }
        return origNum == sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        System.out.println("Is an armstrong number? " + armstrongChecker(num));
    }
}
