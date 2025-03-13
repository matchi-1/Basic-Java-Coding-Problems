package com.example.CodingPractice.medium;

import java.util.HashMap;
import java.util.Arrays;
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

public class TwoSum {
    public static int[] twosum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(arr[i])){
                return new int[] { map.get(arr[i]), i };
            } else{
                map.put(complement, i);
            }

        }
        
        return new int[0];
    }

    public static void main(String[] args){
        int[] arr = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twosum(arr, 9)));
    }
}
