import java.util.*;

public class minAbsoluteSum {
    public static int minAbsoluteSumCode (int A[], int B[]) {
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for (int i = 0; i < B.length; i++) {
            sum += Math.abs(A[i] - B[i]);
        }
        return sum;
    }
}
