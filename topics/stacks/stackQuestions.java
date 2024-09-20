import java.util.Stack;

public class stackQuestions {
/*
    public static void pushAtBottom(Stack<Integer> s, int val) {
        if(s.isEmpty()) {
            s.push(val);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, val);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushAtBottom(s, 0);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
*/
/* 
    public static String reverseString(String str) {
        int idx = 0;
        Stack<Character> s = new Stack<>();
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder ans = new StringBuilder("");
        while (!s.isEmpty()) {
            ans.append(s.pop());
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "Paras";
        System.out.println(reverseString(str));
    }
*/
/*
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverseStack(s);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
*/
/*
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
*/

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