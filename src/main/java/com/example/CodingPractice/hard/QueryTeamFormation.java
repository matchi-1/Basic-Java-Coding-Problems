package com.example.CodingPractice.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QueryTeamFormation {
    public static List<Integer> countTeams(List<Integer> ratings, List<List<Integer>> queries){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < queries.size(); i++){
            int l = queries.get(i).get(0);
            int r = queries.get(i).get(1);

            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j = l; j < r; j++){
                map.put(l, map.getOrDefault(l, 0) + 1);

            }

            int countTeams = 0;

            for(int freq : map.values()){
                countTeams += freq / 2;
            }
            result.add(countTeams);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> ratings = new ArrayList<>();
        ratings.add(2); ratings.add(3); ratings.add(4); ratings.add(2); ratings.add(4);
        List<List<Integer>> queries = new ArrayList<>();

        List<Integer> query1 = new ArrayList<>();
        query1.add(1);
        query1.add(5);
        queries.add(query1);


        List<Integer> query2 = new ArrayList<>();
        query2.add(1);
        query2.add(4);
        queries.add(query2);


        System.out.println(countTeams(ratings, queries));
    }

}
