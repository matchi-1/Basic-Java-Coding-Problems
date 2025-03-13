package com.example.CodingPractice.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // sort intervals by their start times
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        List<int[]> merged = new ArrayList<>();

        // traverse intervals and merge overlapping ones
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for (int[] interval : intervals) {
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (nextStart <= currentEnd) {
                // overlapping intervals, merge
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // no overlap, move to next interval
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }

        // convert merged list back to a 2D array
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] mergedIntervals = merge(intervals);

        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
