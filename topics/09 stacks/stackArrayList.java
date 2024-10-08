import java.util.ArrayList;

public class stackArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public void push(int data) {
            list.add(data);
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int data = list.get(list.size()-1);
            list.remove(list.size()-1);
            return data;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

        public static void main(String args[]) {
            //stackArrayList outer = new stackArrayList(); // Create an instance of the outer class
            Stack s = new Stack();  // Create an instance of the inner class
            s.push(0);
            s.push(1);
            s.push(2);
            while (!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }
        }
    
}
