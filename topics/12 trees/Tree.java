
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Tree01 {
        static int idx = -1;
        public static Node buildTree(int[] nodes) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorderTraversal(Node root) {
            if(root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        public static void levelorderTraversal(Node root) {
            if(root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()) {
                Node curr = q.remove();
                if(curr == null) {
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curr.data + " ");
                    if(curr.left != null) {
                        q.add(curr.left);
                    }
                    if(curr.right != null) {
                        q.add(curr.right);
                    }                    
                }
            }
        }

        public static int height(Node root) {
            if(root == null) {
                return 0;
            }

            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;            
        }
    }
    
    static class Tree02 {
        public static int diametre(Node root) { // O(N^2)
            if(root == null) {
                return 0;
            }
            
            int leftDiam = diametre(root.left);
            int rightDiam = diametre(root.right);

            int leftHt = Tree01.height(root.left);
            int rightHt = Tree01.height(root.right);

            int selfDiam = leftHt + rightHt + 1;

            return Math.max(selfDiam, Math.max(rightDiam, leftDiam));
        }
    }
        
    public static void main(String[] args) {
        /*
            1
           / \
          2   3
         / \ / \
        4  5 6  7
        
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        System.out.println(Tree02.diametre(root));
    }
    
}
