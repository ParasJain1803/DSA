import java.util.*;
public class pairSum2 {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        int n = list.size() - 1;
        while(lp < rp) {
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            }
            else if(list.get(lp) + list.get(rp) > target) {
                rp = (n + rp + 1) % n;
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(43);
        list.add(34);
        list.add(96);
        list.add(23);
        list.add(72);
        System.out.println(pairSum(list, 10));
    }
}
