public class Detectcycle {
     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean hasCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;       // moves 1 step
            fast = fast.next.next;  // moves 2 steps

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        // Creating a cycle:
        // 50 → 30
        head.next.next.next.next.next = head.next.next;

        if (hasCycle(head)) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("No cycle");
        }
    }
}
