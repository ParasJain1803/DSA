package questions;

import java.util.Stack;

public class nextGreaterRight {
    public static int[] nextGreater (int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] nG = new int[arr.length];
        for (int j = arr.length-1 ; j >= 0; j--) {
            while(!s.isEmpty() && arr[s.peek()] <= arr[j]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nG[j] = -1;
            } else {
                nG[j] = s.peek();
            }
            s.push(j);
        }
        return nG;
    }
}
