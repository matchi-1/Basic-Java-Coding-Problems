package com.example.CodingPractice.medium;

import java.util.HashSet;
// remove duplicates in an array

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr){
        if(arr.length == 0)
            return new int[0];
        HashSet<Integer> map = new HashSet<>();
        for (int j : arr) {
            map.add(j);
        }

        return map.stream().mapToInt(Integer::intValue).toArray();
    }
}
