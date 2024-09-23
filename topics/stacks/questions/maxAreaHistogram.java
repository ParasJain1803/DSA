package questions;

import java.util.Stack;

public class maxAreaHistogram {
    
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

    public static int[] nextSmallerLeft (int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] nG = new int[arr.length];
        for (int j = 0 ; j < arr.length; j++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[j]) {
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

    public static int areaHistogram(int[] height) {
        int nSL[] = nextSmallerLeft(height);
        int nSR[] = nextSmallerRight(height);
        int maxArea = -1;
        for (int i = 0; i < height.length; i++) {
            int width = nSR[i] - nSL[i] - 1;
            int currArea = height[i] * width;
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        System.out.println(areaHistogram(arr));
    }
}
