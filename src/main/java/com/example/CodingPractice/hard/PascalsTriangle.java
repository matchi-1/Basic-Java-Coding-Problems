package com.example.CodingPractice.hard;

import java.util.Scanner;

public class PascalsTriangle {

    public static void printPascalsTriangle(int numRows) {
        int[][] triangle = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            // initialize the row with size (+1)
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // first element of each row is 1
            triangle[i][i] = 1; // last element of each row is also 1

            // computation for interior elements of the triangle
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // print
        for (int i = 0; i < numRows; i++) {
            // leading spaces
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();
        printPascalsTriangle(numRows);
        scanner.close();
    }
}
