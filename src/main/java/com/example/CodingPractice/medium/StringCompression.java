package com.example.CodingPractice.medium;
/*String Compression: Develop a program that compresses a string by replacing consecutive
repeating characters with the character followed by its count.
For example, the input "aaabbcc" should be compressed to "a3b2c2".*/
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        StringBuilder compressed = new StringBuilder();

        if (str.isEmpty()) {
            System.out.println();
        }

        char prevChar = str.charAt(0);
        int count = 0;
        for (char chr : str.toCharArray()) {
            if (chr == prevChar) {
                count++;
            } else {
                compressed.append(prevChar);
                compressed.append(count);
                count = 1;
            }
            prevChar = chr;
        }

        compressed.append(prevChar);
        compressed.append(count);

        System.out.println(compressed);
    }
}
