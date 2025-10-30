package Result;

import java.util.List;

public class FindFirstOccurrence {
    /*
     *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/first-occurrence-in-event-code-log/problem?isFullScreen=true
     *  Find First Occurrence
     */
    public static int findFirstOccurrence(List<Integer> nums, int target) {
        // Write your code here
        if(nums.size() == 0) return -1;

        int left = 0;
        int right = nums.size() - 1;
        int result = -1;

        while(left <= right) {

            int mid = (left + right) / 2;

            if(nums.get(mid) == target) {
                result = mid;
                right = mid - 1;
            } else if(nums.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }

        return result;
    }
}
