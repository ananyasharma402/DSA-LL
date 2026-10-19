    import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmapiterate {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Ananya");
        map.put(2, "Rahul");
        map.put(3, "Amit");
        map.put(4, "Priya");

        // Iterate through key-value pairs
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey()
                    + ", Value: " + entry.getValue());
        }






        // Get all keys in a Set
        Set<Integer> keys = map.keySet();

        // Iterate through keys
        for (Integer key : keys) {
            System.out.println("Key: " + key
                    + ", Value: " + map.get(key));
                }


    }
}

