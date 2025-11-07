import Result.*;

import java.util.*;

class Solution {
    public static void main(String[] args) {

        /*
         *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/find-smallest-missing-positive-integer/problem?isFullScreen=true
         *  Find the Smallest Missing Positive Integer
         */
//        List<Integer> orderNumbers = new ArrayList<>();
//        orderNumbers.add(3);
//        orderNumbers.add(4);
//        orderNumbers.add(1);
//        orderNumbers.add(1);
//
//        int result = FindSmallestMissingPositive.findSmallestMissingPositive(orderNumbers);

        /*
         *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/find-smallest-missing-positive-integer/problem?isFullScreen=true
         *  Find the Smallest Missing Positive Integer
         */
//        List<Integer> responseTimes = new ArrayList<>();
//        responseTimes.add(100);
//        responseTimes.add(200);
//        responseTimes.add(150);
//        responseTimes.add(300);
//
//        int result = CountResponseTimeRegressions.countResponseTimeRegressions(responseTimes);

        /*
         *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/check-palindrome-filter-non-letters/problem?isFullScreen=true
         *  Check Palindrome by Filtering Non-Letters
         */
//        String code = "A1b2B!a";
//
//        Boolean result = IsAlphabeticPalindrome.isAlphabeticPalindrome(code);

        /*
         *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/check-non-identical-string-rotation/problem?isFullScreen=true
         *  Check for Non-Identical String Rotation
         */
//        String s1 = "abcde";
//        String s2 = "cdeab";
//
//        Boolean result = IsNonTrivialRotation.isNonTrivialRotation(s1, s2);

        /*
         *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/lookup-with-binary-search/problem?isFullScreen=true
         *  Target Index Search
         */
//        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
//        int target = 16;
//
//        int result = BinarySearch.binarySearch(nums, target);

        /*
         *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/first-occurrence-in-event-code-log/problem?isFullScreen=true
         *  Find First Occurrence
         */
//        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 3));
//        int target = 3;
//
//        int result = FindFirstOccurrence.findFirstOccurrence(nums, target);

        /*
         *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/maximum-non-overlapping-intervals/problem?isFullScreen=true
         *  Maximum Number of Non-Overlapping Intervals
         */
//        List<List<Integer>> meetings = new ArrayList<>();
//        meetings.add(Arrays.asList(1, 2));
//        meetings.add(Arrays.asList(2, 3));
//        meetings.add(Arrays.asList(3, 4));
//        meetings.add(Arrays.asList(1, 3));
//
//        int result = MaximizeNonOverlappingMeetings.maximizeNonOverlappingMeetings(meetings);

        /*
         *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/validate-properly-nested-brackets/problem?isFullScreen=true
         *  Validate Properly Nested Brackets
         */
//        String code_snippet = "if (a[0] > b[1]) { doSomething(); }}";
//
//        boolean result = AreBracketsProperlyMatched.areBracketsProperlyMatched(code_snippet);

        /*
         *  https://www.hackerrank.com/challenges/find-the-median/problem
         *  Find the Median
         */
//        List<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 2, 4, 6, 5, 3));
//
//        int result = FindMedian.findMedian(arr);

        /*
         *  https://www.hackerrank.com/challenges/mark-and-toys/problem
         *  Mark and Toys
         */
//        List<Integer> prices = new ArrayList<>(Arrays.asList(1, 12, 5, 111, 200, 1000, 10));
//        int k = 50;
//
//        int result = MaximumToys.maximumToys(prices, k);

        /*
         *  hackerrank.com/challenges/sherlock-and-anagrams/problem
         *  Sherlock and Anagrams
         */
//        String s = "abba";
//
//        int result = SherlockAndAnagrams.sherlockAndAnagrams(s);

        /*
         *  hackerrank.com/challenges/sherlock-and-anagrams/problem
         *  Ice Cream Parlor
         */
        int m = 4;
//        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 4, 5, 3, 2));
        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 2, 4, 3));

        List<Integer> result = IcecreamParlor.icecreamParlor(m, arr);

        System.out.println(result);
    }
}
