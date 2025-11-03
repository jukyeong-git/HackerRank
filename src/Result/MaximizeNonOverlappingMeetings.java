package Result;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaximizeNonOverlappingMeetings {
    /*
     *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/maximum-non-overlapping-intervals/problem?isFullScreen=true
     *  Maximum Number of Non-Overlapping Intervals
     */
    public static int maximizeNonOverlappingMeetings(List<List<Integer>> meetings) {
        // Write your code here
        meetings.sort(Comparator.comparingInt(a -> a.get(1)));
        int count = 0;
        int lastEnd = Integer.MIN_VALUE;

        for(int i = 0; i <meetings.size(); i++) {
            if(meetings.get(i).get(0) >= lastEnd) {
                lastEnd = meetings.get(i).get(1);
                count++;
            }
        }

        return count;
    }
}
