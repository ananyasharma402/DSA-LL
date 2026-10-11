public class SumofNodes {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int SumofNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = SumofNodes(root.left);
        int rightSum= SumofNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Total nodes: " + SumofNodes(root));
    }
}



