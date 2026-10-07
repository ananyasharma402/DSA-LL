public class Removecyclell {
     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void removeCycle(Node head) {

        Node slow = head;
        Node fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // No cycle
        if (fast == null || fast.next == null) {
            return;
        }

        // Step 2: Find start of cycle
        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // slow/fast is the starting node of cycle

        // Step 3: Find the last node of cycle
        Node temp = slow;

        while (temp.next != slow) {
            temp = temp.next;
        }

        // Remove cycle
        temp.next = null;
    }

    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        // Creating cycle: 50 -> 30
        head.next.next.next.next.next = head.next.next;

        // Remove cycle
        removeCycle(head);

        // Print list after removing cycle
        printList(head);
    }
}
