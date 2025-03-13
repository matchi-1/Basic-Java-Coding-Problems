package com.example.CodingPractice.medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}, arrShifted = new int[arr.length];
        int len = arr.length, shift = 3;

        for (int i = 0; i < arr.length; i++) {
            arrShifted[(i + shift) % len] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrShifted));
    }
}
