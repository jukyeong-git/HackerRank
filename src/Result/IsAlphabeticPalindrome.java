package Result;

import java.util.ArrayList;
import java.util.List;

public class IsAlphabeticPalindrome {
    /*
     *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/check-palindrome-filter-non-letters/problem?isFullScreen=true
     *  Check Palindrome by Filtering Non-Letters
     */
    public static boolean isAlphabeticPalindrome(String code) {
        // Write your code here
        if(code.length() == 1) return true;

        List<Character> charList = new ArrayList<>();
        for(char c : code.toCharArray()) {
            if ((int) 'a' <= c && c <= (int) 'z') {
                charList.add(c);
            } else if ((int) 'A' <= c && c <= (int) 'Z') {
                charList.add((char) (c + 32));
            }
        }

        int n = charList.size() - 1;
        for(int i = 0; i <= n; i++) {
            if(!charList.get(i).equals(charList.get(n-i))) {
                return false;
            }
        }

        return true;
    }
}
