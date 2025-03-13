package com.example.CodingPractice.easy;
/*
Write a program that takes a positive integer n and generates sequence:

 if n is even, divide by 2
if n is odd, mult by 3, add 1

continue process until it reaches 1

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CollatzConjecture {
    public static int[] collatzSeq(int n){
        if(n <= 0)
            return null;

        List<Integer> seq = new ArrayList<>();
        while(n != 1){
            seq.add(n);
            if(n % 2 == 0)
                n /= 2;
            else
                n = 3*n + 1;
        }
        seq.add(1);
        return seq.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println(Arrays.toString(collatzSeq(n)));
    }
}
