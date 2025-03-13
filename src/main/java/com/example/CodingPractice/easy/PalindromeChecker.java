package com.example.CodingPractice.easy;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]","").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static boolean isPalindrome1(String str) {
        str = str.replaceAll("[^a-zA-z]","").toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        System.out.println(isPalindrome1(str));
        System.out.println("singled whitespace: " + str.replaceAll("(\\s)", " "));
    }
}
