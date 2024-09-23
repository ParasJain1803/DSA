public class stackLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Stack {
        static Node head = null;

        public  boolean isEmpty() {
            return head == null;
        }

        public  void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public  int pop() {
            if(isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public  int peek() {
            if(isEmpty()) {
                return -1;
            }

            int top = head.data;
            return top;
        }
    }

    public static void main(String args[]) { // Create an instance of the outer class
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
