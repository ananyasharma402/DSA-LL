
    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Middlenode {

    Node head;

    // Find middle node
    Node findMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        Middlenode list = new Middlenode();

        // Creating linked list
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.next = new Node(50);
        list.head.next.next.next.next.next = new Node(60);

        Node middle = list.findMiddle();

        System.out.println("Middle node: " + middle.data);
    }
}
