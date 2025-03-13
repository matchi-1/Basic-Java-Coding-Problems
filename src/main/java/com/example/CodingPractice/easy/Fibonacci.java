package com.example.CodingPractice.easy;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static int fibTerm(int n){
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        return fibTerm(n-1) + fibTerm(n-2);
    }

    public static int[] generateFibSeq(int n){
        int[] fib = new int[n];
        int prevNum = 1, currNum = 1;
        for (int i = 0; i < n; i++) {
            fib[i] = prevNum;
            int temp =  currNum + prevNum;
            prevNum = currNum;
            currNum = temp;
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number for the fibonacci sequence: ");
        int n = in.nextInt();
        int[] fibSeq = generateFibSeq(n);
        System.out.println(Arrays.toString(fibSeq));

        System.out.printf("Term %d of the sequence: %d\n", n, fibTerm(n));
    }
}
