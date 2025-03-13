package com.example.CodingPractice.medium;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == mid) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }
        return -1; // not found
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

    }
}
