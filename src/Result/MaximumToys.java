package Result;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaximumToys {
    /*
     *  https://www.hackerrank.com/challenges/mark-and-toys/problem
     *  Mark and Toys
     */
    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
        Collections.sort(prices, Comparator.naturalOrder());
        int sum = 0;
        int count = 0;

        for(int i = 0; i < prices.size(); i ++) {
            if(sum + prices.get(i) <= k) {
                sum += prices.get(i);
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
