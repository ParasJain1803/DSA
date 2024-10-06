import java.util.Stack;

public class nextGreaterRight {
    public static void main(String[] args) {
        int arr[] = {1,1};
        int ng[] = nextSmallerLeft(arr);
        for (int i = 0; i < ng.length; i++) {
            System.out.println(ng[i]);
        }
    }
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
    public static int[] nextSmallerLeft (int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] nG = new int[arr.length];
        for (int j = 0 ; j < arr.length; j++) {
            while(!s.isEmpty() && arr[s.peek()] > arr[j]) {
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
    public static int[] nextSmallerRight (int[] arr) {
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int[] nG = new int[arr.length];
        for (int j = arr.length-1 ; j >= 0; j--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[j]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nG[j] = n;
            } else {
                nG[j] = s.peek();
            }
            s.push(j);
        }
        return nG;
    }
    
}
