public class Queue {

    static class QueueArray {
        int arr[];
        int size;
        int rear;

        QueueArray(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // Add element
        void add(int data) {

            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        // Remove element
        int remove() {

            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];

            // Shift all elements to the left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;

            return front;
        }

        // Peek front element
        int peek() {

            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }

        // Check empty
        boolean isEmpty() {
            return rear == -1;
        }
    }

    public static void main(String[] args) {

        QueueArray q = new QueueArray(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Front: " + q.peek());

        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());

        System.out.println("Front: " + q.peek());
    }
}