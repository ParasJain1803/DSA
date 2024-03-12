import java.util.*;
public class pairSum1 {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while(lp < rp) {
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            else if(list.get(lp) + list.get(rp) > target) {
                rp--;
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(pairSum(list, 10));
    }
}