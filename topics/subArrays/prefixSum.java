public class prefixSum {
    public static  void prefixSumMethod (int A[]) {
        int prefix[] = new int[A.length];
        prefix[0] = A[0];
        int cSum = 0;
        int mSum = Integer.MIN_VALUE;
        for (int i = 1; i < A.length; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }
        for (int i = 0; i < A.length; i++) {
            cSum = 0;
            for (int j = i; j < A.length; j++) {
                cSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if (cSum > mSum) {
                    mSum = cSum;
                }
            }
        }
    }
    public static void main(String[] args) {

        int arr[] = {2,4,2,6,8,10};
        prefixSumMethod(arr);
    }
}