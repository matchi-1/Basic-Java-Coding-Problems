package com.example.CodingPractice.medium;

// no new array creation
import java.util.Scanner;
import java.util.Arrays;

public class RotateArray1 {
    public static void rotateArray(int[] arr, int k){
        k  = k % arr.length;
        reverseArray(arr, 0, arr.length-1); // rotate whole array
        reverseArray(arr, 0, k-1); // rotate from start to k (shift key)
        reverseArray(arr, k, arr.length-1); // rotate remaining
    }

    public static void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter shift key: ");
        int k = sc.nextInt();
        rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));

    }
}

