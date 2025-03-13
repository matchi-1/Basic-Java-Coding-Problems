package com.example.CodingPractice.medium;

/*
    Given an array containing integers from 1 to n (with one or more values missing),
    write a program to identify and display the missing values.

*/

import java.util.*;

public class FindMissing {
    public static int[] findMissing(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        List<Integer> missing = new ArrayList<>();
        for(int num : arr){
            set.add(num);
        }
        int min = arr[0], max = arr[arr.length-1];
        for(int i = min; i <= max; i++){
            if(!set.contains(i)){
                missing.add(i);
            }
        }
        return missing.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,9,10,11,13,15};
        System.out.println(Arrays.toString(findMissing(arr)));
    }
}
