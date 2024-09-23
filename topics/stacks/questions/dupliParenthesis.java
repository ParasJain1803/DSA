package questions;

import java.util.Stack;

public class dupliParenthesis {
    public static boolean duplicateParenthesis(String str) {
        Stack<Character> s = new Stack<>();
        for(char c : str.toCharArray()) {
            if (c ==')') {
                int count = 0;
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                s.push(c);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a-b))";
        System.out.println(duplicateParenthesis(str));
    }
}
