public class kadane {
    public static void kadaneMethod (int A[]) {
        // Kadane's method : declare -ve sum as ZERO
        int mSum = Integer.MIN_VALUE;
        int cSum = 0;
        for (int i = 0; i < A.length; i++) {
            cSum += A[i];
            if (cSum < 0) {
                cSum = 0;
            }
            mSum = Math.max(cSum, mSum);
        }
    }

    public static void main(String[] args) {

        int arr[] = {2,4,2,6,8,10};
        kadaneMethod(arr);
    }
}
