package Result;

import java.util.List;

public class FindSmallestMissingPositive {
    /*
     *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/find-smallest-missing-positive-integer/problem?isFullScreen=true
     *  Find the Smallest Missing Positive Integer
     */
    public static int findSmallestMissingPositive(List<Integer> orderNumbers) {
        int idx = 0;

        while(idx < orderNumbers.size()) {
            //condition
            boolean con1 = orderNumbers.get(idx) > 0;
            boolean con2 = orderNumbers.get(idx) <= orderNumbers.size();
            boolean con3 = orderNumbers.get(idx) != idx+1;

            //compare
            if(con1 && con2 && con3){
                int temp = orderNumbers.get(idx);
                if(!orderNumbers.get(idx).equals(orderNumbers.get(temp-1))) {
                    orderNumbers.set(idx, orderNumbers.get(temp - 1));
                    orderNumbers.set(temp - 1, temp);
                } else {
                    idx++;
                }
            } else {
                idx++;
            }
        }

        //confirm
        for(int i = 0; i < orderNumbers.size(); i++) {
            if(orderNumbers.get(i) != i+1)
                return i+1;
        }

        return orderNumbers.size() + 1;
    }
}
