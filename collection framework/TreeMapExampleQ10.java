import java.util.TreeMap;

public class TreeMapExampleQ10 {
    public static void main(String[] args) {
        // Creating a TreeMap to store Integer keys and String values
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Insertion of key-value pairs
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(4, "Cherry");
        treeMap.put(2, "Date");

        // Displaying the TreeMap (sorted order by key)
        System.out.println("TreeMap after insertion:");
        for (Integer key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

        // Retrieval of a specific value
        int searchKey = 2;
        if (treeMap.containsKey(searchKey)) {
            System.out.println("\nRetrieved Value for key " + searchKey + ": " + treeMap.get(searchKey));
        } else {
            System.out.println("\nKey " + searchKey + " not found in TreeMap.");
        }

        // Deletion of a key-value pair
        int deleteKey = 3;
        treeMap.remove(deleteKey);
        System.out.println("\nTreeMap after deleting key " + deleteKey + ":");
        for (Integer key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}