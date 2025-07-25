import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("TreeSet: " + numbers);  // Sorted order: [10, 20, 30, 50]

        System.out.println("First Element: " + numbers.first());    // 10
        System.out.println("Last Element: " + numbers.last());      // 50

        System.out.println("Higher than 20: " + numbers.higher(20)); // 30
        System.out.println("Lower than 30: " + numbers.lower(30));   // 20

        numbers.remove(30);
        System.out.println("After removal: " + numbers);  // [10, 20, 50]
    }
}