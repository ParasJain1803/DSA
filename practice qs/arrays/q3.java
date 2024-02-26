public class q3 {
    public static int stockSale (int A[]) {
        int n = A.length;
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            if(buyPrice < A[i]) {
                int profit = A[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else buyPrice = A[i];
        }
        return maxProfit;
    }
}