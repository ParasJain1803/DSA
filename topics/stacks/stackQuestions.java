import java.util.Stack;

public class stackQuestions {

    public static void pushAtBottom(Stack<Integer> s, int val) {
        if(s.isEmpty()) {
            s.push(val);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, val);
        s.push(top);
    }
/*
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
}