import java.util.*;

public class Main {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;

        //! Brute force
        // for(int i = 0; i < height.size(); i++) {
        //     for(int j = i + 1; j < height.size(); j++) {
        //         int ht = Math.min(height.get(i), height.get(j));
        //         wt = j-i;
        //         int currWater = ht * wt;
        //         maxWater = Math.max(maxWater, currWater);
        //     }
        // }

        //! Two pointer approach
        int lp = 0;
        int rp = height.size() - 1;
  
        while (lp < rp) {
            // calculate water
            int wt = rp - lp;
            int ht = Math.min(height.get(lp), height.get(rp));
            int currWater = ht * wt;
            maxWater = Math.max(maxWater, currWater);

            // update pointer
            if (height.get(lp) > height.get(rp)) {
                rp--;
            }
            else lp++;   
        }

        return maxWater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}