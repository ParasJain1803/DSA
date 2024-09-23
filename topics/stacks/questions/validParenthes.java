package questions;

import java.util.Stack;

public class validParenthes {
      public static boolean validParenthesis(String str) {
        Stack<Character> s = new Stack<>();
        for (char c : str.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                s.push(c);
            } 
            else {
                if(s.isEmpty()){
                    return false;
                }
                if ((c == ')' && s.peek() == '(')
                || (c == ']' && s.peek() == '[')
                || (c == '}' && s.peek() == '{')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        String str = "({[]}())";
        System.out.println(validParenthesis(str));
        
    }
}
