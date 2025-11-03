package Result;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class AreBracketsProperlyMatched {
    /*
     *  https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/validate-properly-nested-brackets/problem?isFullScreen=true
     *  Validate Properly Nested Brackets
     */
    public static boolean areBracketsProperlyMatched(String code_snippet) {
        // Write your code here
        Map<Character, Character> mapPush = new HashMap<>();
        mapPush.put('(', ')');
        mapPush.put('{', '}');
        mapPush.put('[', ']');

        Map<Character, Character> mapPop = new HashMap<>();
        mapPop.put(')', '(');
        mapPop.put('}', '{');
        mapPop.put(']', '[');

        Stack<Character> stk = new Stack<>();

        for(Character c : code_snippet.toCharArray()) {
            if(mapPush.get(c) != null) {
                stk.push(c);
            } else if(mapPop.get(c) != null) {
                if(stk.isEmpty())
                    return false;
                if(stk.pop() != mapPop.get(c))
                    return false;
            }
        }
        return stk.isEmpty();
    }
}
