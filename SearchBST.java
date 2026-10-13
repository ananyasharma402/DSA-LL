
public class SearchBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

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

    public static boolean search(Node root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {

        int values[] = {8, 5, 10, 3, 6, 11};

        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        int key = 6;

        if (search(root, key)) {
            System.out.println("Key found");
        } else {
            System.out.println("Key not found");
        }
    }
}

