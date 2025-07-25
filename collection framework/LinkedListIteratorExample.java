import java.util.*;

public class LinkedListIteratorExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        List<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Getting an iterator
        Iterator<Integer> iterator = numbers.iterator();

        // Iterating through the LinkedList
        System.out.println("Numbers in the LinkedList:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}