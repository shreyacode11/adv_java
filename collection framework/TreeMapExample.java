import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");

        System.out.println(treeMap); // Output: {1=One, 2=Two, 3=Three}
    }
}