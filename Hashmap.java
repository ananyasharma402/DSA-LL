import java.util.HashMap;
public class Hashmap {
    
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Insert elements
        map.put(1, "Ananya");
        map.put(2, "Rahul");
        map.put(3, "Amit");

        // Print HashMap
        System.out.println(map);

        // Get value using key
        System.out.println(map.get(2));

        // Check if key exists
        System.out.println(map.containsKey(1));

        // Remove an element
        map.remove(3);

        // Print updated HashMap
        System.out.println(map);
    }
}
