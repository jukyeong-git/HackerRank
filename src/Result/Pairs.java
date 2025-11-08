package Result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pairs {
    /*
     *  https://www.hackerrank.com/challenges/pairs/problem
     *  Pairs
     */
    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.size(); i++) {
            map.put(arr.get(i), i);
        }

        for(int i = 0; i < arr.size(); i++) {
            if(map.get(arr.get(i)+k) != null)
                count++;
        }

        return count;
    }
}
