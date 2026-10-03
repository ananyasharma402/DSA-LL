import java.util.*;
import java.util.Stack;

public class Reversestack {
     // Push element at the bottom of the stack
    public static void pushAtBottom(int data, Stack<Integer> s) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();

        pushAtBottom(data, s);

        s.push(top);
    }

    // Reverse the stack
    public static void reverse(Stack<Integer> s) {

        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();

        reverse(s);

        pushAtBottom(top, s);
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("Original Stack: " + s);

        reverse(s);

        System.out.println("Reversed Stack: " + s);
    }
}
