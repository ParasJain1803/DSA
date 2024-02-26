// BRUTE FORCE METHOD //
// SUM OF SubArrays //
public class subarraySum {
    public static int printSubarray(int A[]) {
        int cSum = 0;
        int mSum = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                for (int k = i; k<=j; k++) {
                    //System.out.print(A[k] + " ");
                    cSum += A[k];
                    System.out.println(cSum);
                    if (cSum>mSum) {
                        mSum = cSum;
                        }
                }
            //System.out.println();
            }
        //System.out.println();
        }
    System.out.println("max =" + mSum);
    return 0;
    }
    public static void main(String[] args) {

        int arr[] = {2,4,2,6,8,10};
        printSubarray(arr);
    }
}