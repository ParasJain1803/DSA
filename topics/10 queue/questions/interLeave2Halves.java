import java.util.LinkedList;
import java.util.Queue;

public class interLeave2Halves {
    public static void interLeave (Queue<Integer> q) {
        int len = q.size();
        int i = 0;
        Queue<Integer> q1 = new LinkedList<>();
        while (i < len/2) {
            q1.add(q.remove());
            i++;
        }
        while(!q1.isEmpty()) {
            q.add(q1.remove());
            q.add(q.remove());
        }
        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }
        interLeave(q);
    }
}
