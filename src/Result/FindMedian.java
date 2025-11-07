package Result;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindMedian {
    /*
     *  https://www.hackerrank.com/challenges/find-the-median/problem
     *  Find the Median
     */
    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr, Comparator.naturalOrder());

        return arr.get(arr.size()/2);
    }
}
