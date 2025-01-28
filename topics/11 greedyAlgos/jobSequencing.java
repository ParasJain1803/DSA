
import java.util.ArrayList;
import java.util.Collections;

public class jobSequencing {
    static class Job {
        int id;
        int time;
        int profit;

        public Job(int i, int t, int p) {
            id = i;
            time = t;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int t = 0;

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(curr.time > t) {
                seq.add(curr.id);
                t++;
            }
        }

        System.out.println("Max jobs = " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }
}
