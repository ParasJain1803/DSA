//Trapping rainwater
public class trappingRain {
    public static int trapping (int A[]) {
        int maxLeft[] = new int[A.length];
        int maxRight[] = new int[A.length];
        
            maxLeft[0] = A[0];
            maxRight[A.length-1] = A[A.length - 1];
        
        for (int i = 1; i < A.length; i++) {
            maxLeft[i] = Math.max(maxLeft[i-1], A[i]);
        }
        for (int i = A.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i+1], A[i]);
        }
        int trappedWater=0;
        for (int i = 0; i < A.length; i++) {
            trappedWater += Math.min(maxLeft[i], maxRight[i]) - A[i];
        }
        return trappedWater;
    }

    public static void main(String args[]) {
        int height[] = {4,2,0,6,3,2,5};
        trapping(height);
    }
}