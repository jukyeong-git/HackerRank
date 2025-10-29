import Result.FindSmallestMissingPositive;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Solution {
    public static void main(String[] args) throws IOException {

        /*
         *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/find-smallest-missing-positive-integer/problem?isFullScreen=true
         *  Find the Smallest Missing Positive Integer
         */
        List<Integer> orderNumbers = new ArrayList<>();
        orderNumbers.add(3);
        orderNumbers.add(4);
        orderNumbers.add(1);
        orderNumbers.add(1);

        int result = FindSmallestMissingPositive.findSmallestMissingPositive(orderNumbers);

        System.out.println(result);
    }
}
