import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> linkedMap = new LinkedHashMap<>();

        linkedMap.put(3, "Three");
        linkedMap.put(1, "One");
        linkedMap.put(2, "Two");

        System.out.println(linkedMap); // Output: {3=Three, 1=One, 2=Two}
        System.out.println("The value of 2" + linkedMap.get(3));

        linkedMap.replace(1,"Four");
        System.out.println(linkedMap);

        linkedMap.remove(1,"Four");
        System.out.println(linkedMap);



        
    }
}