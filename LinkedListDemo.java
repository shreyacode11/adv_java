import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("LinkedList: " + list);

        list.add(1, "Mango");  // Insert at index 1
        System.out.println("After insertion: " + list);

        list.remove("Banana");  // Remove element
        System.out.println("After removal: " + list);
        
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
    }
}