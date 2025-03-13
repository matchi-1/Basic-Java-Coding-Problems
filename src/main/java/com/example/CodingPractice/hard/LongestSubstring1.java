package com.example.CodingPractice.hard;

import java.util.HashSet;

public class LongestSubstring1 {
    public static void main(String[] args) {
        String str = "abcdazxvbnmop";
        String longestSubstring = "";
        HashSet<Character> seen = new HashSet<>();
        int start = 0;

        for (int end = 0; end < str.length(); end++) {
            char currentChar = str.charAt(end);

            // remove chars until the duplicate is gone
            while (seen.contains(currentChar)) {
                seen.remove(str.charAt(start));
                start++;
            }

            // add the current char to the set
            seen.add(currentChar);

            // update the longest substring
            if (end - start + 1 > longestSubstring.length()) {
                longestSubstring = str.substring(start, end + 1);
            }

            System.out.println("Current Window: " + str.substring(start, end + 1));
        }

        System.out.println("Longest Substring: " + longestSubstring);
    }
}
