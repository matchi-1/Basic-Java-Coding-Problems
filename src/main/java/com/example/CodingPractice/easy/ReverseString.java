package com.example.CodingPractice.easy;
import java.util.Scanner;


/* [2MPS] Reverse a string by:
    1. Reverse the string as is
    2. Takes a sentence as input and returns it in reverse order.
    Each word in the sentence should maintain its internal character order.
    Additionally, remove any punctuation, and change all letters to lowercase.
*/

public class ReverseString {
    // MP 1
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // MP 2
    public static String reverseSentence(String sentence) {
        String cleanSentence = sentence.replaceAll("[^a-zA-z ]","").toLowerCase();
        String[] arr_words = cleanSentence.split(" ");

        StringBuilder strReversed = new StringBuilder();
        for (int i = arr_words.length - 1; i >= 0; i--) {
            strReversed.append(arr_words[i]);
            if(i > 0)
                strReversed.append(" ");
        }
        return strReversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        System.out.print("Reversed string: " + reverseString(string));

        System.out.println();

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Reversed sentence: " + reverseSentence(sentence));
    }
}
