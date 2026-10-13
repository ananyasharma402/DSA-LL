public class Printpath {
    
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert node into BST
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

    // Print all root-to-leaf paths
    public static void printPaths(Node root, String path) {

        if (root == null) {
            return;
        }

        path = path + root.data + " ";

        // If leaf node is reached, print the path
        if (root.left == null && root.right == null) {
            System.out.println(path);
            return;
        }

        printPaths(root.left, path);
        printPaths(root.right, path);
    }

    public static void main(String[] args) {

        int values[] = {8, 5, 10, 3, 6, 11};

        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Root-to-leaf paths:");
        printPaths(root, "");
    }
}
