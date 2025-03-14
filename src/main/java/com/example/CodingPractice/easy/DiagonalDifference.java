package com.example.CodingPractice.easy;

/*Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

Function description

Complete the  function in the editor below.

diagonalDifference takes the following parameter:

int arr[n][m]: an array of integers
Return

int: the absolute diagonal difference*/

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int j = arr.size() - 1, sum_lr = 0, sum_rl = 0;
        for (int i = 0; i < arr.size(); i++){
            sum_lr += arr.get(i).get(i);
            sum_rl += arr.get(i).get(j--);
        }
        return Math.abs(sum_lr - sum_rl);
    }
}
