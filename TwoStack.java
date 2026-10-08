import java.util.Stack;

public class TwoStack{

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // Add element to queue
        public static void add(int data) {
            s1.push(data);
        }

        // Remove element from queue
        public static int remove() {

            if (s1.isEmpty() && s2.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            // Move elements from s1 to s2
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.pop();
        }

        // Get front element
        public static int peek() {

            if (s1.isEmpty() && s2.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.peek();
        }

        // Check if queue is empty
        public static boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Front: " + q.peek());

        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());

        System.out.println("Front: " + q.peek());

        q.add(50);

        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());
    }
}