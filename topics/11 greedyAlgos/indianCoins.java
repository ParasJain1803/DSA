
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class indianCoins {
    public static void indianCoinsCode() {
        Integer coins[] = {1,2,5,10,20,50,100,200,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());

        int countCoins = 0;
        int amt = 590;

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if(coins[i] <= amt) {
                while(coins[i] <= amt) {
                    countCoins++;
                    a.add(coins[i]);
                    amt -= coins[i];
                }
            }
        }
        System.out.println("Total coins " + countCoins);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        indianCoinsCode();
    }
}
