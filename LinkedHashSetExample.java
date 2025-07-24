import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");  // Duplicate, won't be added

        System.out.println("LinkedHashSet: " + set); // Maintains insertion order

        set.remove("Banana");
        System.out.println("After removal: " + set);

        System.out.println("Contains 'Apple'? " + set.contains("Apple"));
        System.out.println("Size: " + set.size());
    }
}