package com.example.CodingPractice.medium;
import java.util.HashSet;
import java.util.Scanner;


public class VacStrength {

    public static void main(String[] args){
        String ans = "yes";
        Scanner sc = new Scanner(System.in);
        int vacCount = sc.nextInt();

        int[] vacStrength = new int[vacCount];
        for(int i = 0; i < vacCount; i++)
            vacStrength[i] = sc.nextInt();

        for(int i = 0; i < vacCount; i++){
            int mitCount = sc.nextInt();
            if(vacStrength[i] < mitCount){
                ans = "no";
                break;
            }

        }
        System.out.println(ans);
    }
}
