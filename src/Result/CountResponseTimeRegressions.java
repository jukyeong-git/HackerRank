package Result;

import java.util.List;

public class CountResponseTimeRegressions {
    /*
     *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/count-elements-greater-than-previous-average/problem?isFullScreen=true
     *  Count Elements Greater Than Previous Average
     */
    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        // Write your code here
        if(responseTimes.size() <= 1) return 0;

        int count = 0;
        double sum = responseTimes.get(0);

        for(int i = 1; i <responseTimes.size(); i++) {
            if(responseTimes.get(i) > sum/i)
                count++;
            sum += responseTimes.get(i);
        }

        return count;
    }
}
