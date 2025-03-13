package com.example.CodingPractice.hard;

import java.util.Arrays;
import java.util.Scanner;

/*
The Sieve of Eratosthenes is an efficient algorithm to find all prime numbers up to a specified integer.
*/
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter upper limit of finding prime numbers: ");
        int n = in.nextInt();

        boolean[] isPrimes = new boolean[n + 1];
        Arrays.fill(isPrimes, true);
        isPrimes[0] = isPrimes[1] = false;
        for (int num = 2; num * num <= n; num++) {
            // the number is still considered prime
            if (isPrimes[num]) {
                // make all multiples false
                for(int mult = num * num; mult <= n; mult += num) {
                    isPrimes[mult] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + n + " are: ");
        for(int i = 2; i <= n; i++) {
            if(isPrimes[i]) {
                System.out.print(i + " ");
            }
        }

    }
}
