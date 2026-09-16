
    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Searchll {

    Node head;

    // Add node at the end
    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Find desired node
    boolean search(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {

        Searchll list = new Searchll();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int key = 30;

        if (list.search(key)) {
            System.out.println("Node found");
        } else {
            System.out.println("Node not found");
        }
    }

}
