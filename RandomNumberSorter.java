import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberSorter {
    public static void main(String[] args) {
        // Step 1: Read range from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        // Step 2: Generate random numbers and filter multiples of 2 and 5
        List<Integer> multiples = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) { // Generate 100 random numbers
            int number = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            if (number % 2 == 0 && number % 5 == 0) {
                multiples.add(number);
            }
        }

        System.out.println("Multiples of 2 and 5: " + multiples);

        // Step 3: Sort numbers according to the tens place using a comparator
        Collections.sort(multiples, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return (num1 / 10) % 10 - (num2 / 10) % 10; // Compare tens place
            }
        });

        // Step 4: Display sorted numbers
        System.out.println("Sorted by tens place: " + multiples);

        // Close the scanner
        scanner.close();
    }
}