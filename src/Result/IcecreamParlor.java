package Result;

import java.util.*;

public class IcecreamParlor {
    /*
     *  hackerrank.com/challenges/sherlock-and-anagrams/problem
     *  Ice Cream Parlor
     */
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.size(); i++) {
            map.put(arr.get(i), i);
        }

        for(int i = 0; i < arr.size(); i ++) {
            if(map.get(m - arr.get(i)) != null && map.get(m - arr.get(i)) != i) {
                return new ArrayList<>(Arrays.asList(i + 1, map.get(m - arr.get(i))+1));
            }
        }

        return new ArrayList<>(Arrays.asList(0, 0));
    }
}
