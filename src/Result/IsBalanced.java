package Result;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IsBalanced {
    /*
     *  https://www.hackerrank.com/challenges/balanced-brackets/problem
     *  Balanced Brackets
     */
    public static String isBalanced(String s) {
        // Write your code here

        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        Stack<Character> stk = new Stack<>();

        for(Character c : s.toCharArray()) {
            if(map.get(c) == null) {
                stk.push(c);
            } else {
                if(stk.isEmpty() && map.get(c) != null)
                    return "NO";

                if(!stk.isEmpty() && stk.pop() != map.get(c))
                    return "NO";
            }
        }

        return stk.isEmpty()?"YES":"NO";
    }
}
