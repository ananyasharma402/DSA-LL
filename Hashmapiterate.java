    import java.util.HashMap;
import java.util.Map;

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
    }
}

