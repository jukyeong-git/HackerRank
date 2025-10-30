package Result;

import java.util.*;

public class IsNonTrivialRotation {
    /*
     *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/check-non-identical-string-rotation/problem?isFullScreen=true
     *  Check for Non-Identical String Rotation
     */
    public static boolean isNonTrivialRotation(String s1, String s2) {
        // Write your code here
        if(s1.length() != s2.length()) return false;
        if(s1.equals(s2)) return false;
        if(s1.length() == 1 || s2.length() == 1) return false;

        String sum = s1 + s1;
        return sum.contains(s2);
    }
}
