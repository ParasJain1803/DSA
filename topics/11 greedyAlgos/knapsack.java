import java.util.Arrays;
import java.util.Comparator;

public class knapsack {
    public static int knapsackCode (int weight[], int value[], int totalWeight) {
        double ratio[][] = new double[weight.length][2];
        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];            
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = totalWeight;
        int finalValue = 0;
        for (int i = ratio.length - 1; i >= 0 ; i--) {
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]) {
                finalValue += value[idx];
                capacity -= weight[idx];
            } else {
                finalValue += capacity * ratio[i][1];
                capacity = 0;
                break;
            }
        }
        return finalValue;
    }

    public static void main(String[] args) {
        int weight[] = {10, 20, 30};
        int value[] = {60, 100, 120};
        int totalWeight = 50;
        System.out.println(knapsackCode(weight, value, totalWeight));
    }
}
