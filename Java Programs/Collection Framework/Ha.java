import java.util.HashMap;
import java.util.Map;

public class Ha {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Sohil", 1);
        map.put("Amol", 2);
        map.put("Vishnu", 3);

        System.out.println(map);
        System.out.println("Key of Sohil : " + map.get("Sohil"));

        for(Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println("Key : " + entry.getKey() + "    " + "value  : " + entry.getValue());
        
    }
}