public class Rangebst {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert a node into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Print nodes within range [k1, k2]
    public static void printInRange(Node root, int k1, int k2) {

        if (root == null) {
            return;
        }

        // If root is greater than k1, check left subtree
        if (root.data > k1) {
            printInRange(root.left, k1, k2);
        }

        // Print root if it lies within range
        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + " ");
        }

        // If root is smaller than k2, check right subtree
        if (root.data < k2) {
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {

        int values[] = {8, 5, 10, 3, 6, 11, 1, 4, 14};

        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        int k1 = 5;
        int k2 = 11;

        System.out.println("Nodes in range [" + k1 + ", " + k2 + "]:");
        printInRange(root, k1, k2);
    }
}

