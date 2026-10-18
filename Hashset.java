
import java.util.HashSet;
public class Hashset {

    public static void main(String[] args) {

        // Create a HashSet
        HashSet<Integer> set = new HashSet<>();

        // Add elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate ignored

        System.out.println("HashSet: " + set);

        // Search for an element
        System.out.println("Contains 20: " + set.contains(20));

        // Remove an element
        set.remove(10);
        System.out.println("After removal: " + set);

        // Iterate through the HashSet
        System.out.println("Elements:");
        for (int num : set) {
            System.out.println(num);
        }

        // Check if empty
        System.out.println("Is empty: " + set.isEmpty());

        // Size of HashSet
        System.out.println("Size: " + set.size());
    }
}


