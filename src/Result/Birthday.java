package Result;

import java.util.List;

public class Birthday {
    /*
     *  https://www.hackerrank.com/challenges/the-birthday-bar/problem
     *  Subarray Division
     */
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int sum = 0;
        int count = 0;

        for(int i = 0; i < m; i ++) {
            sum += s.get((i));
        }

        if(sum == d)
            count ++;

        for(int i = m; i < s.size(); i++) {
            sum -= s.get(i-m);
            sum += s.get(i);
            if(sum == d)
                count ++;
        }

        return count;
    }
}
