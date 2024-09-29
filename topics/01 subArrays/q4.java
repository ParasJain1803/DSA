public class q4 {
    public static int trapRain (int height[]) {
        int n = height.length;

        // TODO left max array
        int leftMax[] = new int[n];
        leftMax[0] = 0;
        for (int i=0;i<n;i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // TODO right max array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=0;i<n;i++) {
            rightMax[i] = Math.max(rightMax[i-1], height[i]);
        }

        int trappedWater = 0;
        for(int i=0;i<n;i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return trappedWater;
    }
}
