package Result;

import java.util.*;

public class SherlockAndAnagrams {
    /*
     *  https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem
     *  Sherlock and Anagrams
     */
    public static int sherlockAndAnagrams(String s) {
        // Write your code here
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            for(int j = i+1; j <= s.length(); j++) {
                char[] chr = s.substring(i, j).toCharArray();
                Arrays.sort(chr);
                String str = new String(chr);
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        long sum = 0;

        for(int num : map.values()) {
            if(num >=2)
                sum += (long) num * (num - 1) / 2;
        }

        return (int) sum;
    }
}
