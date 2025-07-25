import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");  // Duplicate, won't be added

        System.out.println("HashSet: " + set); // Unordered output

        set.remove("Banana");
        System.out.println("After removal: " + set);

        System.out.println("Contains 'Apple'? " + set.contains("Apple"));
        System.out.println("Size: " + set.size());
    }
}
