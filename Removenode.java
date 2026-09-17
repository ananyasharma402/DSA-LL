public class Removenode {
    public class RemoveNthNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeNthFromEnd(Node head, int n) {

        // Dummy node handles the case where head itself is removed
        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

        // Create a gap of n nodes
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Move both pointers together
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the N-th node from the end
        slow.next = slow.next.next;

        return dummy.next;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Original List:");
        printList(head);

        int n = 2;

        head = removeNthFromEnd(head, n);

        System.out.println("After removing " + n + "nd node from end:");
        printList(head);
    }
}
}
