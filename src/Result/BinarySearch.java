package Result;

import java.util.List;

public class BinarySearch {
    /*
     *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/lookup-with-binary-search/problem?isFullScreen=true
     *  Target Index Search
     */
    public static int binarySearch(List<Integer> nums, int target) {
        if(nums.size() <= 0) return -1;

        // Write your code here
        int left = 0;
        int right = nums.size() - 1;

        return bSearch(left, right, nums, target);
    }

    public static int bSearch(int left, int right, List<Integer> nums, int target) {
        if (left > right) return -1;

        int mid = (left + right) / 2;

        if(nums.get(mid) == target)
            return mid;
        else if(nums.get(mid) < target)
            return bSearch(mid+1, right, nums, target);
        else if (nums.get(mid) > target)
            return bSearch(left, mid-1, nums, target);

        return -1;
    }
}
