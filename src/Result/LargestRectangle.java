package Result;

import java.util.*;

public class LargestRectangle {
    /*
     *  https://www.hackerrank.com/challenges/largest-rectangle/problem
     *  Largest Rectangle
     */
    public static long largestRectangle(List<Integer> h) {
        int n = h.size();
        Stack<Integer> st = new Stack<>();
        long maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int curr = (i == n) ? 0 : h.get(i);
            while (!st.isEmpty() && curr < h.get(st.peek())) {
                int height = h.get(st.pop());
                int left = st.isEmpty() ? 0 : st.peek() + 1;
                int width = i - left;
                long area = (long) height * width;
                if (area > maxArea) maxArea = area;
            }
            st.push(i);
        }
        return maxArea;
    }
}
