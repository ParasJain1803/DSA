import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class queueReversal {
    public static void reverseQueue (Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()) {
            s.push(q.remove());
        }
        while(!s.isEmpty()) {
            q.add(s.pop());
        }
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        reverseQueue(q);
    }
}
