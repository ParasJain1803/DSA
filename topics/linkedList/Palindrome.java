public class Palindrome {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        public void addFirst(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

    }

    public static Node head;
    public static Node tail;
    public static Node size;

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void printLL() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }
        // find mid
        Node mid = findMid(head);
        
        // reverse second half
        Node curr = mid;
        Node prev = null;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // compare both halves
        Node left = head;
        Node right = prev;
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
        public static void main(String[] args) {
        Node newNode = new Node(1);
        newNode.addFirst(1);
        newNode.addFirst(2);
        printLL();
        System.out.println(checkPalindrome());
    }
}
