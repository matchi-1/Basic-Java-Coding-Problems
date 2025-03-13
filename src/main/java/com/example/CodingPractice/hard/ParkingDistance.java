package com.example.CodingPractice.hard;

public class ParkingDistance {
    public static int maxDistance(String str){
        boolean hasOne = false;
        int distance = 0, maxDistance = 0;
        for(int i = 0; i < str.length(); i++){
            if(i == str.length() - 1 && str.charAt(i) != 1 && hasOne)
                return Math.max(++distance, maxDistance);
            if(str.charAt(i) == '1'){
                if(hasOne){
                    distance = distance % 2 != 0 ? distance / 2 : distance / 2 + 1;
                }
                hasOne = true;
                maxDistance = Math.max(distance, maxDistance);
                distance = 0;
            } else if (str.charAt(i) != '1'){
                distance++;
            }
        }
        return maxDistance;

    }
    public static void main(String[] args) {
        System.out.println(maxDistance("0001"));
    }
}
