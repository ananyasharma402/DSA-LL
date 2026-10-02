public class Stackclass {
    public static void main(String[] args) {

        java.util.Stack<Integer> s = new java.util.Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}