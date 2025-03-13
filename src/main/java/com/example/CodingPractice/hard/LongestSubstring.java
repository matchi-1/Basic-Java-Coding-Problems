package com.example.CodingPractice.hard;

/*
Longest Substring Without Repeating Characters:
Given a string, write a function to find the length of the longest substring without repeating characters.
*/

import java.util.HashSet;

public class LongestSubstring {
    public static int longestSubstring(String s) {
        if (s == null || s.isEmpty())
            return 0;

        int max = 1, count = 1;
        HashSet<Character> set = new HashSet<>();
        set.add(s.charAt(0));

        for(int i = 1; i < s.length(); i++) {
            if(set.contains(s.charAt(i))) {
                if(count > max)
                    max = count;
                count = 1;
                set.clear();
            }
            else {
                count++;
            }
            set.add(s.charAt(i));
        }
        if(count > max)
            max = count;

        return max;
    }
    public static void main(String[] args) {
        System.out.println(longestSubstring("aabcdefgabcdefghijk"));
    }
}
