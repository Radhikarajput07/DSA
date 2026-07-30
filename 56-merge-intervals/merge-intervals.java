import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals according to starting point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Store merged intervals
        List<int[]> result = new ArrayList<>();

        // Step 3: Start with first interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Step 4: Check every remaining interval
        for (int i = 1; i < intervals.length; i++) {

            // If current interval overlaps with next interval
            if (intervals[i][0] <= end) {

                // Extend the ending point
                end = Math.max(end, intervals[i][1]);

            } else {

                // No overlap, so add current interval
                result.add(new int[]{start, end});

                // Start a new interval
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        // Step 5: Add the last interval
        result.add(new int[]{start, end});

        // Step 6: Convert List<int[]> to int[][]
        return result.toArray(new int[result.size()][]);
    }
}