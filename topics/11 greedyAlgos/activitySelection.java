import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activitySelection {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        System.out.println(activitySelectionCode(start, end));
    }

    // Sorted on ending time
    /* 
    public static int activitySelectionCode(int start[], int end[]) {
        ArrayList<Integer> list = new ArrayList<>();

        int maxAct = 1;
        int lastEnd = end[0];
        list.add(0);

        for (int i = 1; i < end.length; i++) {
            if(start[i] >= lastEnd) {
                maxAct++;
                lastEnd = end[i];
                list.add(i);
            }
        }

        // return list;
        return maxAct;
    }
    */

    public static int activitySelectionCode(int start[], int end[]) {
        ArrayList<Integer> list = new ArrayList<>();

        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function -> short form
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 1;
        int lastEnd = activities[0][2];
        list.add(0);

        for (int i = 1; i < start.length; i++) {
            if(activities[i][1] >= lastEnd) {
                maxAct++;
                lastEnd = activities[i][2];
                list.add(i);
            }
        }

        // return list;
        return maxAct;
    }
}
